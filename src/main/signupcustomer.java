/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class signupcustomer {
    
    Connection conn = new DBConnection().connect();

void addCustomerdetails(String Firstname, String Lastname,String Age,String Gender,String Dayofbirth, String Monthofbirth, String Yearofbirth,String Email, String PhoneNo,   
                        String Username,String Password ,String Height, String Weight) {
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("INSERT INTO Customerdetails (Firstname, Lastname, Age, Gender, Dayofbirth, Monthofbirth, Yearofbirth, Email, PhoneNo, Username, Password, Height, Weight) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        ps.setString(1, Firstname);
        ps.setString(2, Lastname);
        ps.setString(3, Age);
        ps.setString(4, Gender);
        ps.setString(5, Dayofbirth);
        ps.setString(6, Monthofbirth);
        ps.setString(7, Yearofbirth);
        ps.setString(8, Email);
        ps.setString(9, PhoneNo);
        ps.setString(10, Username);
        ps.setString(11, Password);
        ps.setString(12, Height);
        ps.setString(13, Weight);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, Firstname + "'s information successfully entered into the database");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
}
       

    
}