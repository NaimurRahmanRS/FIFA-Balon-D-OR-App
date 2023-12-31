/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nrproject;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author never
 */
public class VoteControl extends javax.swing.JFrame {
    Connection c;
    String sql;
    PreparedStatement ptst;
    ResultSet rs;
    /**
     * Creates new form VoteControl
     */
    public VoteControl() {
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
        start = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        pause = new javax.swing.JButton();
        min = new javax.swing.JLabel();
        publish_results = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\CyXW7MqXgAAyZND_1_400x480.jpeg")); // NOI18N
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setIconTextGap(0);

        jPanel1.setBackground(new java.awt.Color(72, 219, 251));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 480));

        start.setBackground(new java.awt.Color(0, 0, 0));
        start.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("START VOTE");
        start.setAlignmentY(0.0F);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        start.setMargin(new java.awt.Insets(2, 10, 2, 10));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\output-onlinepngtools.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("CONTROL INTERFACE");

        exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        pause.setBackground(new java.awt.Color(0, 0, 0));
        pause.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pause.setForeground(new java.awt.Color(255, 255, 255));
        pause.setText("PAUSE VOTE");
        pause.setAlignmentY(0.0F);
        pause.setBorderPainted(false);
        pause.setFocusPainted(false);
        pause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pause.setMargin(new java.awt.Insets(2, 10, 2, 10));
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        min.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        publish_results.setBackground(new java.awt.Color(0, 0, 0));
        publish_results.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        publish_results.setForeground(new java.awt.Color(255, 255, 255));
        publish_results.setText("PUBLISH RESULTS");
        publish_results.setAlignmentY(0.0F);
        publish_results.setBorderPainted(false);
        publish_results.setFocusPainted(false);
        publish_results.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        publish_results.setMargin(new java.awt.Insets(2, 10, 2, 10));
        publish_results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publish_resultsActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET VOTE");
        reset.setAlignmentY(0.0F);
        reset.setBorderPainted(false);
        reset.setFocusPainted(false);
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset.setMargin(new java.awt.Insets(2, 10, 2, 10));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK TO ADMIN PANEL");
        back.setAlignmentY(0.0F);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back.setMargin(new java.awt.Insets(2, 10, 2, 10));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(publish_results, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(min))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(start)
                .addGap(30, 30, 30)
                .addComponent(pause)
                .addGap(30, 30, 30)
                .addComponent(reset)
                .addGap(30, 30, 30)
                .addComponent(publish_results)
                .addGap(30, 30, 30)
                .addComponent(back)
                .addContainerGap(84, Short.MAX_VALUE))
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

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "update admincontrol set result=?,useracc=? where id=?";            
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 0);
            ptst.setInt(2, 1);
            ptst.setInt(3, 1);
            ptst.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int id;
            Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            String sql2 = "select * from playerdata";
            PreparedStatement ptst2 = c2.prepareStatement(sql2);
            ResultSet rs2 = ptst2.executeQuery();
            while(rs2.next()){
                id = rs2.getInt(1);
                String sql3 = "update playerdata set mark=? where id='"+id+"'";
                PreparedStatement ptst3 = c2.prepareStatement(sql3);
                ptst3.setInt(1,0);
                ptst3.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            String sql2 = "delete from resultdata";
            PreparedStatement ptst2 = c2.prepareStatement(sql2);
            ptst2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "update admincontrol set useracc=? where id=?";            
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 0);
            ptst.setInt(2, 1);
            ptst.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pauseActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void publish_resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publish_resultsActionPerformed
        // TODO add your handling code here:
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "update admincontrol set result=?,useracc=? where id=?";            
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 1);
            ptst.setInt(2, 0);
            ptst.setInt(3, 1);
            ptst.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_publish_resultsActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Admin a = new Admin();
        a.show();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            sql = "update admincontrol set result=?,useracc=? where id=?";
            ptst = c.prepareStatement(sql);
            ptst.setInt(1, 0);
            ptst.setInt(2, 0);
            ptst.setInt(3, 1);
            ptst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VoteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int id;
            Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "1234");
            String sql2 = "select * from user_registration";
            PreparedStatement ptst2 = c2.prepareStatement(sql2);
            ResultSet rs2 = ptst2.executeQuery();
            while(rs2.next()){
                id = rs2.getInt(1);
                String sql3 = "update user_registration set points5=?,points3=?,points1=? where idno='"+id+"'";
                PreparedStatement ptst3 = c2.prepareStatement(sql3);
                ptst3.setString(1,"");
                ptst3.setString(2,"");
                ptst3.setString(3,"");
                ptst3.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int id;
            Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
            String sql2 = "select * from playerdata";
            PreparedStatement ptst2 = c2.prepareStatement(sql2);
            ResultSet rs2 = ptst2.executeQuery();
            while(rs2.next()){
                id = rs2.getInt(1);
                String sql3 = "update playerdata set points=?,points5=?,points3=?,points1=? where id='"+id+"'";
                PreparedStatement ptst3 = c2.prepareStatement(sql3);
                ptst3.setInt(1,0);
                ptst3.setInt(2,0);
                ptst3.setInt(3,0);
                ptst3.setInt(4,0);
                ptst3.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(VoteControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoteControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoteControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoteControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoteControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JButton pause;
    private javax.swing.JButton publish_results;
    private javax.swing.JButton reset;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
