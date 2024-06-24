/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;

/**
 * @author geekers-donald237
 */
public class DatabaseConnection {

    public static Connection getCon() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ict308", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            throw new Exception(e.getMessage());
        }
    }


    public static void main(String[] args) throws Exception {
        Connection connection = DatabaseConnection.getCon();

        if (connection != null) {
            System.out.println("Connection successfully! etablished ");
        } else {
            System.out.println("Failed to establish connection. ");
        }
    }
}
