/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nrproject;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author never
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login_login = new javax.swing.JButton();
        login_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login_password = new javax.swing.JPasswordField();
        exit = new javax.swing.JLabel();
        login_admin_login = new javax.swing.JButton();
        login_register = new javax.swing.JButton();
        login_results = new javax.swing.JButton();
        min = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\631134068-real-madrid-cf-v-granada-cf-la-liga.jpg-850x560.png")); // NOI18N
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setIconTextGap(0);

        jPanel1.setBackground(new java.awt.Color(72, 219, 251));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 480));

        login_login.setBackground(new java.awt.Color(0, 0, 0));
        login_login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        login_login.setForeground(new java.awt.Color(255, 255, 255));
        login_login.setText("LOGIN");
        login_login.setAlignmentY(0.0F);
        login_login.setBorderPainted(false);
        login_login.setFocusPainted(false);
        login_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_login.setMargin(new java.awt.Insets(2, 10, 2, 10));
        login_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_loginActionPerformed(evt);
            }
        });

        login_username.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        login_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_usernameActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\output-onlinepngtools.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("USER LOGIN");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setText("Username :");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setText("Password :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        login_password.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        login_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passwordActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        login_admin_login.setBackground(new java.awt.Color(0, 0, 0));
        login_admin_login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        login_admin_login.setForeground(new java.awt.Color(255, 255, 255));
        login_admin_login.setText("ADMIN LOGIN");
        login_admin_login.setAlignmentY(0.0F);
        login_admin_login.setBorderPainted(false);
        login_admin_login.setFocusPainted(false);
        login_admin_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_admin_login.setMargin(new java.awt.Insets(2, 10, 2, 10));
        login_admin_login.setPreferredSize(new java.awt.Dimension(140, 27));
        login_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_admin_loginActionPerformed(evt);
            }
        });

        login_register.setBackground(new java.awt.Color(0, 0, 0));
        login_register.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        login_register.setForeground(new java.awt.Color(255, 255, 255));
        login_register.setText("REGISTER");
        login_register.setAlignmentY(0.0F);
        login_register.setBorderPainted(false);
        login_register.setFocusPainted(false);
        login_register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_register.setMargin(new java.awt.Insets(2, 10, 2, 10));
        login_register.setPreferredSize(new java.awt.Dimension(140, 27));
        login_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_registerActionPerformed(evt);
            }
        });

        login_results.setBackground(new java.awt.Color(0, 0, 0));
        login_results.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        login_results.setForeground(new java.awt.Color(255, 255, 255));
        login_results.setText("RESULTS");
        login_results.setAlignmentY(0.0F);
        login_results.setBorderPainted(false);
        login_results.setFocusPainted(false);
        login_results.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login_results.setMargin(new java.awt.Insets(2, 10, 2, 10));
        login_results.setPreferredSize(new java.awt.Dimension(140, 27));
        login_results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_resultsActionPerformed(evt);
            }
        });

        min.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(min)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exit))
                            .addComponent(login_results, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_admin_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_login, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(min))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(login_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(login_admin_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(login_results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_loginActionPerformed
        Connection c;
        String sql;
        PreparedStatement ptst;
        ResultSet rs2;
        int u = 1;

        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "select * from admincontrol where id=?";
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 1);
            rs2 = ptst.executeQuery();
            if (rs2.next()) {
                u = rs2.getInt(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (u == 0) {
            JOptionPane.showMessageDialog(null, "Voting has not started yet");
        } else {

            if (login_username.getText().isEmpty() || login_password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter your username and password");
            } else {
                String user = login_username.getText();
                String pass = login_password.getText();
                String sqlquery = "SELECT * FROM user_registration WHERE username='" + user + "' AND userpassword='" + pass + "'";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "1234");
                    PreparedStatement ps = conn.prepareStatement(sqlquery);
                    ResultSet rs = ps.executeQuery();
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "Username and password is incorrect");
                    } else {
                        int id = rs.getInt(1);
                        JOptionPane.showMessageDialog(null, "Login Successfully");
                        User u2 = new User(id);
                        u2.show();
                        this.dispose();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_login_loginActionPerformed

    private void login_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_usernameActionPerformed

    private void login_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passwordActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void login_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_admin_loginActionPerformed
        // TODO add your handling code here:
        AdminLogin a = new AdminLogin();
        a.show();
        this.dispose();
    }//GEN-LAST:event_login_admin_loginActionPerformed

    private void login_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_registerActionPerformed
        // TODO add your handling code here:
        Registration r = new Registration();
        r.show();
        this.dispose();
    }//GEN-LAST:event_login_registerActionPerformed

    private void login_resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_resultsActionPerformed
        // TODO add your handling code here:
        Connection c;
        String sql;
        PreparedStatement ptst;
        ResultSet rs2;
        int r = 0;

        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "select * from admincontrol where id=?";
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 1);
            rs2 = ptst.executeQuery();
            if (rs2.next()) {
                r = rs2.getInt(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(r==0){
            JOptionPane.showMessageDialog(null, "Result has not been published yet");
        }
        
        else{
            Results r2;
            try {
                r2 = new Results();
                r2.show();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_login_resultsActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_admin_login;
    private javax.swing.JButton login_login;
    private javax.swing.JPasswordField login_password;
    private javax.swing.JButton login_register;
    private javax.swing.JButton login_results;
    private javax.swing.JTextField login_username;
    private javax.swing.JLabel min;
    // End of variables declaration//GEN-END:variables
}
