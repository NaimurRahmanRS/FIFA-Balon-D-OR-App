/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nrproject;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author never
 */
public class Results extends javax.swing.JFrame {
    Connection c;
    String sql;
    PreparedStatement ptst;
    ResultSet rs;
    /**
     * Creates new form Result
     */
    public Results() throws SQLException, FileNotFoundException, IOException {
        setUndecorated(true);
        initComponents();
        
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
        sql = "select * from playerdata";
        ptst = c.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = ptst.executeQuery();
        
        int row_count = 0;
        
        while(rs.next())
        {
            row_count++;
        }
        
        int max = 0;
        int id = 0;
        String sql2;
        PreparedStatement ptst2;
        String sql3;
        PreparedStatement ptst3;
        ResultSet rs3;
        String sql4;
        PreparedStatement ptst4;
        String sql5;
        PreparedStatement ptst5;
        
        for(int i=0;i<row_count;i++){
            rs = ptst.executeQuery();
            max = 0;
            while(rs.next()){
                if(rs.getInt(15)!=1){
                    if(rs.getInt(10)>=max){
                        max = rs.getInt(10);
                        id = rs.getInt(1);
                    }
                }
            }
            sql2 = "update playerdata set mark=? where id='"+id+"'";
            ptst2 = c.prepareStatement(sql2);
            ptst2.setInt(1,1);
            ptst2.executeUpdate();
            
            String name = null;
            String country = null;
            String club = null;
            int points = 0;
            Blob image = null;
            
            sql3 = "select * from playerdata where id='"+id+"'";
            ptst3 = c.prepareStatement(sql3);
            rs3 = ptst3.executeQuery();
            if(rs3.next()){
                name = rs3.getString(2);
                country = rs3.getString(3);
                club = rs3.getString(4);
                points = rs3.getInt(10);
                image = rs3.getBlob(14);
                
                sql4 = "insert into resultdata (name,country,club,points,pic) values(?,?,?,?,?)";
                ptst4 = c.prepareStatement(sql4);
                ptst4.setString(1, name);
                ptst4.setString(2, country);
                ptst4.setString(3, club);
                ptst4.setInt(4, points);
                ptst4.setBlob(5, image);
                ptst4.execute();
            }
        }
        
        int prev = 0;
        int r = 0;
        String name2;
            
        sql3 = "select * from resultdata";
        ptst3 = c.prepareStatement(sql3);
        rs3 = ptst3.executeQuery();
        while(rs3.next()){
            int points = rs3.getInt(5);
            name2 = rs3.getString(2);
            if(points != prev){
                r++;
                prev = points;
            }
            sql5 = "update resultdata set ranking=? where name=?";
            ptst5 = c.prepareStatement(sql5);
            ptst5.setInt(1, r);
            ptst5.setString(2, name2);
            ptst5.executeUpdate();
        }
        
        sql = "select * from resultdata";
        ptst = c.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = ptst.executeQuery();
        
        if(rs.next()){
            String name3 = rs.getString(2);
            String country = rs.getString(3);
            String club = rs.getString(4);
            String points = rs.getString(5);
            String rank = rs.getString(7);

            Blob image = rs.getBlob(6);
            String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
            byte [] bytea = image.getBytes(1, (int)image.length());
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(bytea);
            ImageIcon icon = new ImageIcon(bytea);
            add_photo.setIcon(icon);

            r_name.setText(name3);
            r_country.setText(country);
            r_club.setText(club);
            r_points.setText(points);
            r_rank.setText(rank);
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
        r_country = new javax.swing.JTextField();
        r_rank = new javax.swing.JTextField();
        r_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        r_club = new javax.swing.JTextField();
        r_points = new javax.swing.JTextField();
        add_back = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        add_photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 219, 251));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 480));

        r_country.setEditable(false);
        r_country.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        r_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_countryActionPerformed(evt);
            }
        });

        r_rank.setEditable(false);
        r_rank.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        r_rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_rankActionPerformed(evt);
            }
        });

        r_name.setEditable(false);
        r_name.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        r_name.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                r_nameComponentShown(evt);
            }
        });
        r_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Rank :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Name :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Country :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Club :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Points :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        min.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        min.setText("-");
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText(">");
        next.setAlignmentY(0.0F);
        next.setBorderPainted(false);
        next.setFocusPainted(false);
        next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        next.setMargin(new java.awt.Insets(2, 10, 2, 10));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        r_club.setEditable(false);
        r_club.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        r_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clubActionPerformed(evt);
            }
        });

        r_points.setEditable(false);
        r_points.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        r_points.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_pointsActionPerformed(evt);
            }
        });

        add_back.setBackground(new java.awt.Color(0, 0, 0));
        add_back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        add_back.setForeground(new java.awt.Color(255, 255, 255));
        add_back.setText("USER LOGIN");
        add_back.setAlignmentY(0.0F);
        add_back.setBorderPainted(false);
        add_back.setFocusPainted(false);
        add_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add_back.setIconTextGap(0);
        add_back.setMargin(new java.awt.Insets(2, 10, 2, 10));
        add_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_backActionPerformed(evt);
            }
        });

        previous.setBackground(new java.awt.Color(0, 0, 0));
        previous.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setText("<");
        previous.setAlignmentY(0.0F);
        previous.setBorderPainted(false);
        previous.setFocusPainted(false);
        previous.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        previous.setMargin(new java.awt.Insets(2, 10, 2, 10));
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("PLAYER DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(previous))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(r_points, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_club, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_country, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(next)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(min)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(exit))))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exit)
                        .addComponent(min))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_country, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_club, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_points, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(previous))
                .addGap(20, 20, 20)
                .addComponent(add_back, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add_photo.setAlignmentY(0.0F);
        add_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2));
        add_photo.setPreferredSize(new java.awt.Dimension(400, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(add_photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_countryActionPerformed

    private void r_rankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_rankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_rankActionPerformed

    private void r_nameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_r_nameComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_r_nameComponentShown

    private void r_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_nameActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        try {
            // TODO add your handling code here:
            if(rs.next()){
                String name3 = rs.getString(2);
                String country = rs.getString(3);
                String club = rs.getString(4);
                String points = rs.getString(5);
                String rank = rs.getString(7);

                Blob image = rs.getBlob(6);
                String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
                byte [] bytea = image.getBytes(1, (int)image.length());
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(bytea);
                ImageIcon icon = new ImageIcon(bytea);
                add_photo.setIcon(icon);

                r_name.setText(name3);
                r_country.setText(country);
                r_club.setText(club);
                r_points.setText(points);
                r_rank.setText(rank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void r_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_clubActionPerformed

    private void r_pointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_pointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_pointsActionPerformed

    private void add_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_backActionPerformed
        // TODO add your handling code here:
       Login l = new Login();
       l.show();
       this.dispose();

    }//GEN-LAST:event_add_backActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {
            if(rs.previous()){
                String name3 = rs.getString(2);
                String country = rs.getString(3);
                String club = rs.getString(4);
                String points = rs.getString(5);
                String rank = rs.getString(7);

                Blob image = rs.getBlob(6);
                String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
                byte [] bytea = image.getBytes(1, (int)image.length());
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(bytea);
                ImageIcon icon = new ImageIcon(bytea);
                add_photo.setIcon(icon);

                r_name.setText(name3);
                r_country.setText(country);
                r_club.setText(club);
                r_points.setText(points);
                r_rank.setText(rank);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previousActionPerformed

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Results().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_back;
    private javax.swing.JLabel add_photo;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField r_club;
    private javax.swing.JTextField r_country;
    private javax.swing.JTextField r_name;
    private javax.swing.JTextField r_points;
    private javax.swing.JTextField r_rank;
    // End of variables declaration//GEN-END:variables
}
