/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hoaiphat
 */
public class JDBCConnection {
    public Connection getConnect(){
        String url = "jdbc:mysql://localhost:3306/shop";
        String username = "root";
	String password = "minh1998";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
	} catch (ClassNotFoundException e) {
            e.printStackTrace();
	} catch (SQLException e) {
            e.printStackTrace();
	}

	return null;
    }
    public static void main(String[] args) {
        JDBCConnection connection = new JDBCConnection();
            Connection conn = connection.getConnect();

            if (conn != null) {
		System.out.println("THANH CONG");
            } else {
                System.out.println("THAT BAI");
            }
    }
}
