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

/**
 *
 * @author never
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
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

        jPanel1 = new javax.swing.JPanel();
        admin_add_player = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        admin_update_player = new javax.swing.JButton();
        min = new javax.swing.JLabel();
        admin_view_players = new javax.swing.JButton();
        admin_delete_player = new javax.swing.JButton();
        admin_log_out = new javax.swing.JButton();
        vote_control = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 219, 251));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 480));

        admin_add_player.setBackground(new java.awt.Color(0, 0, 0));
        admin_add_player.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        admin_add_player.setForeground(new java.awt.Color(255, 255, 255));
        admin_add_player.setText("ADD NEW PLAYER");
        admin_add_player.setAlignmentY(0.0F);
        admin_add_player.setBorderPainted(false);
        admin_add_player.setFocusPainted(false);
        admin_add_player.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_add_player.setMargin(new java.awt.Insets(2, 10, 2, 10));
        admin_add_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_add_playerActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\output-onlinepngtools.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("ADMIN INTERFACE");

        exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        admin_update_player.setBackground(new java.awt.Color(0, 0, 0));
        admin_update_player.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        admin_update_player.setForeground(new java.awt.Color(255, 255, 255));
        admin_update_player.setText("UPDATE EXISTING PLAYER");
        admin_update_player.setAlignmentY(0.0F);
        admin_update_player.setBorderPainted(false);
        admin_update_player.setFocusPainted(false);
        admin_update_player.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_update_player.setMargin(new java.awt.Insets(2, 10, 2, 10));
        admin_update_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_update_playerActionPerformed(evt);
            }
        });

        min.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        admin_view_players.setBackground(new java.awt.Color(0, 0, 0));
        admin_view_players.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        admin_view_players.setForeground(new java.awt.Color(255, 255, 255));
        admin_view_players.setText("VIEW ADDED PLAYERS");
        admin_view_players.setAlignmentY(0.0F);
        admin_view_players.setBorderPainted(false);
        admin_view_players.setFocusPainted(false);
        admin_view_players.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_view_players.setMargin(new java.awt.Insets(2, 10, 2, 10));
        admin_view_players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_view_playersActionPerformed(evt);
            }
        });

        admin_delete_player.setBackground(new java.awt.Color(0, 0, 0));
        admin_delete_player.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        admin_delete_player.setForeground(new java.awt.Color(255, 255, 255));
        admin_delete_player.setText("DELETE EXISTING PLAYER");
        admin_delete_player.setAlignmentY(0.0F);
        admin_delete_player.setBorderPainted(false);
        admin_delete_player.setFocusPainted(false);
        admin_delete_player.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_delete_player.setMargin(new java.awt.Insets(2, 10, 2, 10));
        admin_delete_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_delete_playerActionPerformed(evt);
            }
        });

        admin_log_out.setBackground(new java.awt.Color(0, 0, 0));
        admin_log_out.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        admin_log_out.setForeground(new java.awt.Color(255, 255, 255));
        admin_log_out.setText("LOG OUT");
        admin_log_out.setAlignmentY(0.0F);
        admin_log_out.setBorderPainted(false);
        admin_log_out.setFocusPainted(false);
        admin_log_out.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admin_log_out.setMargin(new java.awt.Insets(2, 10, 2, 10));
        admin_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_log_outActionPerformed(evt);
            }
        });

        vote_control.setBackground(new java.awt.Color(0, 0, 0));
        vote_control.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        vote_control.setForeground(new java.awt.Color(255, 255, 255));
        vote_control.setText("VOTE & RESULT CONTROL");
        vote_control.setAlignmentY(0.0F);
        vote_control.setBorderPainted(false);
        vote_control.setFocusPainted(false);
        vote_control.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vote_control.setMargin(new java.awt.Insets(2, 10, 2, 10));
        vote_control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote_controlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(admin_add_player, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin_update_player, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin_delete_player, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin_view_players, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addComponent(admin_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote_control, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(min))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(admin_add_player)
                        .addGap(20, 20, 20)
                        .addComponent(admin_update_player)
                        .addGap(20, 20, 20)
                        .addComponent(admin_delete_player)
                        .addGap(20, 20, 20)
                        .addComponent(admin_view_players))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(vote_control)
                .addGap(20, 20, 20)
                .addComponent(admin_log_out)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\never\\Downloads\\download_400x480.jpeg")); // NOI18N
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setIconTextGap(0);

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

    private void admin_add_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_add_playerActionPerformed
        AddNewPlayer a = new AddNewPlayer();
        a.show();
        this.dispose();
    }//GEN-LAST:event_admin_add_playerActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void admin_update_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_update_playerActionPerformed
        // TODO add your handling code here:
        UpdatePlayer u = new UpdatePlayer();
        u.show();
        this.dispose();
    }//GEN-LAST:event_admin_update_playerActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void admin_view_playersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_view_playersActionPerformed
        // TODO add your handling code here:
        ViewPlayersAdmin v;
        try {
            v = new ViewPlayersAdmin();
            v.show();
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_admin_view_playersActionPerformed

    private void admin_delete_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_delete_playerActionPerformed
        // TODO add your handling code here:
        DeletePlayer d = new DeletePlayer();
        d.show();
        this.dispose();
    }//GEN-LAST:event_admin_delete_playerActionPerformed

    private void admin_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_log_outActionPerformed
        // TODO add your handling code here:
        AdminLogin a = new AdminLogin();
        a.show();
        this.dispose();
    }//GEN-LAST:event_admin_log_outActionPerformed

    private void vote_controlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote_controlActionPerformed
        // TODO add your handling code here:
        VoteControl v = new VoteControl();
        v.show();
        this.dispose();
    }//GEN-LAST:event_vote_controlActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_add_player;
    private javax.swing.JButton admin_delete_player;
    private javax.swing.JButton admin_log_out;
    private javax.swing.JButton admin_update_player;
    private javax.swing.JButton admin_view_players;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JButton vote_control;
    // End of variables declaration//GEN-END:variables
}
