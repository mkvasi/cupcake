package model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataMapper {
    
    public User getUserInformation(String username) {
        User user = null;
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `user`"
                    + "WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String u_username = rs.getString("username");
                String u_password = rs.getString("password");
                double u_balance = rs.getDouble("balance");
                String u_email = rs.getString("email");
                user = new User(u_username, u_password, u_email, u_balance);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return user;
    }

    public void addUser(User user) {
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "INSERT INTO `user` (username, password, email, balance)"
                    + "VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setDouble(4, user.getBalance());
            pstmt.executeUpdate();
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Cupcake getCupcakeInformation(int id) {
        Cupcake cupcake = null;
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `cupcake`"
                    + "WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int c_id = rs.getInt("id");
                String c_top = rs.getString("t_topname");
                String c_bottom = rs.getString("b_bottomname");
                double c_totalPrice = rs.getDouble("totalprice");
                cupcake = new Cupcake(c_id, c_top, c_bottom, c_totalPrice);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return cupcake;
    }

    public ArrayList<Bottom> getBottoms() {
        ArrayList<Bottom> getAllBottoms = new ArrayList();
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `bottom`";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String b_name = rs.getString("bottomname");
                double b_price = rs.getDouble("price");
                getAllBottoms.add(new Bottom(b_name, b_price));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return getAllBottoms;
    }

    public ArrayList<Topping> getToppings() {
        ArrayList<Topping> getAllToppings = new ArrayList();
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `toppings`";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String t_name = rs.getString("toppingname");
                double t_price = rs.getDouble("price");
                getAllToppings.add(new Topping(t_name, t_price));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return getAllToppings;
    }
//    public static void main(String[] args) {
//        DataMapper dataMapper = new DataMapper(); 
//        
//        dataMapper.addUser(new User("lort", "123", "123", 100.0));
//    }
}
