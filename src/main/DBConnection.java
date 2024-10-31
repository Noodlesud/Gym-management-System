/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection DBConnection;

    public Connection connect() {
         String url = "jdbc:mysql://localhost:3306/gymdb"; 
        String username = "root"; 
        String password = ""; 
        try {
            DBConnection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established.");

            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
        
        return DBConnection;
    }
    

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
       
        Connection connection = dbConnection.connect();
         try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error closing the database connection: " + ex.getMessage());
        }
    }
}

      