/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class Customizetrainer extends javax.swing.JFrame {
  
    private String Firstname;
    private String Lastname;
    private String PhoneNo;
    private String Age;
  
    private String Gender;
    private String Dayofbirth;
    private String Monthofbirth;
    private String Yearofbirth;
    private String Trainertype;
    private String Height;
    private String Weight;
    

    public Customizetrainer() {
        initComponents();
        populateTrainerComboBox();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pr.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("Choose Trainer");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("  Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String selectedName = (String) jComboBox1.getSelectedItem();
        displayTrainerDetails(selectedName);
    }                                          

   

    private void populateTrainerComboBox() {
        try {
            String url = "jdbc:mysql://localhost:3306/gymdb";
            String username = "root";
            String password = "";
  Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established.");

           String sql = "SELECT Firstname, Lastname FROM Trainerdetails";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            List<String> trainerNames = new ArrayList<>();
            while (resultSet.next()) {
                String firstname = resultSet.getString("Firstname");
                String lastname = resultSet.getString("Lastname");
                String fullName = firstname + " " + lastname;
                trainerNames.add(fullName);
            }

            jComboBox1.setModel(new DefaultComboBoxModel<>(trainerNames.toArray(new String[0])));

             resultSet.close();
            statement.close();

             connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
    }

    private void displayTrainerDetails(String selectedName) {
        try {
            String url = "jdbc:mysql://localhost:3306/gymdb";
            String username = "root";
            String password = "";

             Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established.");

          String[] nameParts = selectedName.split(" ");
            String firstname = nameParts[0];
            String lastname = nameParts[1];

            String sql = "SELECT * FROM Trainerdetails WHERE Firstname=? AND Lastname=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String fetchedFirstname = resultSet.getString("Firstname");
                String fetchedLastname = resultSet.getString("Lastname");
                String fetchedPhoneNo = resultSet.getString("PhoneNO");
                String fetchedAge = resultSet.getString("Age");
               
                String fetchedGender = resultSet.getString("Gender");
                String fetchedDayofbirth = resultSet.getString("Dayofbirth");
                String fetchedMonthofbirth = resultSet.getString("Monthofbirth");
                String fetchedYearofbirth = resultSet.getString("Yearofbirth");
                String fetchedTrainertype = resultSet.getString("Trainertype");
                String fetchedHeight = resultSet.getString("Height");
                String fetchedWeight = resultSet.getString("Weight");

                Trainerdetail trainerdetail = new Trainerdetail(fetchedFirstname, fetchedLastname, fetchedPhoneNo,
                        fetchedAge,  fetchedGender, fetchedDayofbirth, fetchedMonthofbirth,
                        fetchedYearofbirth, fetchedTrainertype, fetchedHeight, fetchedWeight);
                 trainerdetail.pack();
                trainerdetail.setVisible(true);
                trainerdetail.setLocationRelativeTo(null);
          this.dispose();
            }

            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Database connection closed.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error connecting to the database: " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // UI initialization code

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customizetrainer().setVisible(true);
            }
        });
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        AdminPage page=new AdminPage();
           page.setVisible(true);
           page.pack();
          page.setLocationRelativeTo(null);
          this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
  /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
