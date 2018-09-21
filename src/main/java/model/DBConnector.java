package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    //private Connection connection = null;

    //Constants
    private static final String IP = "188.166.86.13";
    private static final String PORT = "3306";
    public static final String DATABASE = "cupcake";
    private static final String USERNAME = "nikolai";
    private static final String PASSWORD = "nikolai123";

//	public DBConnector() throws Exception {
//   		Class.forName("com.mysql.jdbc.Driver").newInstance();
//   		String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
//   		this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
//	}
//	
//	public Connection getConnection() {
//   		return this.connection;
//	}
        
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
            con = DriverManager.getConnection(url, USERNAME, PASSWORD);  // The connection will be released upon program 

        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
        }

        return con;
    }

}
