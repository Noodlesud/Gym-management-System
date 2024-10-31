/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Plan extends javax.swing.JFrame {

    /**
     * Creates new form Plan
     */
    public Plan() {
        initComponents();
    }
    private void deletePlan() {
    try {
        String Username = UserCredentials.getUsername();
String Password = UserCredentials.getPassword();
        String url = "jdbc:mysql://localhost:3306/gymdb";
        String username = "root";
        String password = "";

        
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Database connection established.");

        
       String sql = "UPDATE Customerdetails SET Plan = NULL  WHERE Username=? AND Password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, Username);
        statement.setString(2, Password);
        statement.executeUpdate();

      
        statement.close();
        connection.close();
        

    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Error connecting to the database: " + ex.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pr.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Choose Plan");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Month", "6 Month", "1 Year" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("1 Month        For 1,3000bir");

        jLabel4.setText("6  Month       For 7,0000bir");

        jLabel5.setText("1 Year           For 15,000bir");

        jLabel6.setText("    Back");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton1.setText("Cancel Plan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  String Username = UserCredentials.getUsername();
String Password = UserCredentials.getPassword();

try {
    String url = "jdbc:mysql://localhost:3306/gymdb";
    String username = "root";
    String password = "";
    String plan = jComboBox1.getSelectedItem().toString();

    Connection connection = DriverManager.getConnection(url, username, password);
    System.out.println("Database connection established.");
    String query = "SELECT COUNT(Plan) FROM Customerdetails WHERE Username=? AND Password=?";
    try {
        PreparedStatement ST = connection.prepareStatement(query);
        ST.setString(1, Username);
        ST.setString(2, Password);
        ResultSet resultSet = ST.executeQuery();

        if (resultSet.next()) {
           int count = resultSet.getInt(1);

            if (count == 0 ) {
                String sql = "UPDATE Customerdetails SET Plan=? WHERE Username=? AND Password=?";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, plan);
                statement.setString(2, Username);
                statement.setString(3, Password);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "You have bought a " + plan + " Plan");

                Plan mainc = new Plan();
                mainc.setVisible(true);
                mainc.pack();
                mainc.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "You have already bought a plan ");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
} catch (SQLException e) {
    e.printStackTrace();
}


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        CustomerPage mainc=new CustomerPage();
        mainc.setVisible(true);
        mainc.pack();
        mainc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String Username = UserCredentials.getUsername();
String Password = UserCredentials.getPassword();

try {
    String url = "jdbc:mysql://localhost:3306/gymdb";
    String username = "root";
    String password = "";
    String plan = jComboBox1.getSelectedItem().toString();

    Connection connection = DriverManager.getConnection(url, username, password);
    System.out.println("Database connection established.");
    String query = "SELECT COUNT(Plan) FROM Customerdetails WHERE Username=? AND Password=?";
    try {
        PreparedStatement ST = connection.prepareStatement(query);
        ST.setString(1, Username);
        ST.setString(2, Password);
        ResultSet resultSet = ST.executeQuery();

        if (resultSet.next()) {
         int count = resultSet.getInt(1);
         
            if (count != 0) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel your plan?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    deletePlan();
                    JOptionPane.showMessageDialog(null, "Plan deleted.");
                    Plan maincc=new Plan();
           maincc.setVisible(true);
           maincc.pack();
          maincc.setLocationRelativeTo(null);
          this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "You Don't Have A Plan");
                Plan maincc=new Plan();
           maincc.setVisible(true);
           maincc.pack();
          maincc.setLocationRelativeTo(null);
          this.dispose();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
