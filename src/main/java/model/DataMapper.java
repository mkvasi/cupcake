package model;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
                BigDecimal u_balance = rs.getBigDecimal("balance");
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
                    + "VALUES(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setBigDecimal(4, user.getBalance());
            pstmt.executeUpdate(sql);

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
                String c_name = rs.getString("name");
                String c_top = rs.getString("t_topname");
                String c_bottom = rs.getString("b_bottomname");
                BigDecimal c_totalPrice = rs.getBigDecimal("totalprice");
                cupcake = new Cupcake(c_id, c_name, c_top, c_bottom, c_totalPrice);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return cupcake;
    }

    public List<Bottom> getBottoms() {
        List<Bottom> getAllBottoms = null;
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `bottom`";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String b_name = rs.getString("name");
                BigDecimal b_price = rs.getBigDecimal("price");
                getAllBottoms.add(new Bottom(b_name, b_price));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return getAllBottoms;
    }

    public List<Topping> getToppings() {
        List<Topping> getAllToppings = null;
        try {
            Connection conn = new DBConnector().getConnection();
            String sql = "SELECT * FROM `topping`";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String t_name = rs.getString("name");
                BigDecimal t_price = rs.getBigDecimal("price");
                getAllToppings.add(new Topping(t_name, t_price));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return getAllToppings;
    }
}
