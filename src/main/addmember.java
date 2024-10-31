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


public class addmember {
    
    Connection conn = new DBConnection().connect();

void addTrainerdetails(String Firstname, String Lastname, String PhoneNo, String Age, String Email, String Gender,
                       String Dayofbirth, String Monthofbirth, String Yearofbirth, String Trainertype, String Height, String Weight) {
    try {
        PreparedStatement ps;
        ps = conn.prepareStatement("INSERT INTO Trainerdetails (Firstname, Lastname,PhoneNo, Age, Email, Gender, Dayofbirth, Monthofbirth, Yearofbirth, Trainertype, Height, Weight) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        ps.setString(1, Firstname);
        ps.setString(2, Lastname);
        ps.setString(3, PhoneNo);
        ps.setString(4, Age);
        ps.setString(5, Email);
        ps.setString(6, Gender);
        ps.setString(7, Dayofbirth);
        ps.setString(8, Monthofbirth);
        ps.setString(9, Yearofbirth);
        ps.setString(10, Trainertype);
        ps.setString(11, Height);
        ps.setString(12, Weight);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, Firstname + "'s information successfully entered into the database");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex);
    }
}
       

    
}