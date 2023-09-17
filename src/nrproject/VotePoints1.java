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
public class VotePoints1 extends javax.swing.JFrame {
    String path2 = null;
    Connection c;
    Connection c2;
    String sql;
    String sqlU;
    PreparedStatement ptst;
    PreparedStatement ptstU;
    ResultSet rs;
    ResultSet rsU;
    String p5;
    String p3;
    int user;
    /**
     * Creates new form VotePoints1
     */
    public VotePoints1() throws SQLException, FileNotFoundException, IOException {
        setUndecorated(true);
        initComponents();
        
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
        c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "1234");
        sql = "select * from playerdata";
        ptst = c.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = ptst.executeQuery();
        
        if(rs.next()){
            String name2 = rs.getString(2);
            String country = rs.getString(3);
            String club = rs.getString(4);
            String position = rs.getString(5);
            String played = rs.getString(6);
            String goals = rs.getString(7);
            String assists = rs.getString(8);
            String clean_sheets = rs.getString(9);

            Blob image = rs.getBlob(14);
            String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
            byte [] bytea = image.getBytes(1, (int)image.length());
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(bytea);
            ImageIcon icon = new ImageIcon(bytea);
            add_photo.setIcon(icon);

            search_name.setText(name2);
            add_country.setText(country);
            add_club.setText(club);
            add_position.setText(position);
            add_played.setText(played);
            add_goals.setText(goals);
            add_assists.setText(assists);
            add_clean_sheets.setText(clean_sheets);
        }
    }
    
    public VotePoints1(int u) throws SQLException, FileNotFoundException, IOException {
        setUndecorated(true);
        initComponents();
        
        user = u;
        
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/players", "root", "1234");
        c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "1234");
        sql = "select * from playerdata";
        sqlU = "select * from user_registration where idno='" + user + "'";
        ptst = c.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ptstU = c2.prepareStatement(sqlU);
        rs = ptst.executeQuery();
        rsU = ptstU.executeQuery();
        if(rsU.next()){
            p5 = rsU.getString(6);
            p3 = rsU.getString(7);
        }
        while(rs.next()){
            if (!rs.getString(2).equals(p5)) {
                if (!rs.getString(2).equals(p3)) {
                    String name2 = rs.getString(2);
                    String country = rs.getString(3);
                    String club = rs.getString(4);
                    String position = rs.getString(5);
                    String played = rs.getString(6);
                    String goals = rs.getString(7);
                    String assists = rs.getString(8);
                    String clean_sheets = rs.getString(9);
                    
                    Blob image = rs.getBlob(14);
                    String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
                    byte [] bytea = image.getBytes(1, (int)image.length());
                    FileOutputStream fos = new FileOutputStream(path);
                    fos.write(bytea);
                    ImageIcon icon = new ImageIcon(bytea);
                    add_photo.setIcon(icon);
                    
                    search_name.setText(name2);
                    add_country.setText(country);
                    add_club.setText(club);
                    add_position.setText(position);
                    add_played.setText(played);
                    add_goals.setText(goals);
                    add_assists.setText(assists);
                    add_clean_sheets.setText(clean_sheets);
                    break;
                }
            }
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

        add_photo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        add_club = new javax.swing.JTextField();
        search_name = new javax.swing.JTextField();
        add_country = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        add_position = new javax.swing.JTextField();
        add_played = new javax.swing.JTextField();
        add_goals = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        add_assists = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        add_clean_sheets = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        user_back = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        vote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add_photo.setAlignmentY(0.0F);
        add_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2));
        add_photo.setPreferredSize(new java.awt.Dimension(400, 480));

        jPanel1.setBackground(new java.awt.Color(72, 219, 251));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(454, 480));

        add_club.setEditable(false);
        add_club.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_clubActionPerformed(evt);
            }
        });

        search_name.setEditable(false);
        search_name.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_nameActionPerformed(evt);
            }
        });

        add_country.setEditable(false);
        add_country.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_country.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                add_countryComponentShown(evt);
            }
        });
        add_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_countryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Full Name :");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Country :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Club :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Position :");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Games Played :");
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

        add_position.setEditable(false);
        add_position.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_positionActionPerformed(evt);
            }
        });

        add_played.setEditable(false);
        add_played.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_played.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_playedActionPerformed(evt);
            }
        });

        add_goals.setEditable(false);
        add_goals.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_goals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_goalsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("Goals :");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        add_assists.setEditable(false);
        add_assists.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_assists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_assistsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Assists :");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        add_clean_sheets.setEditable(false);
        add_clean_sheets.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add_clean_sheets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_clean_sheetsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("Clean Sheets :");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        user_back.setBackground(new java.awt.Color(0, 0, 0));
        user_back.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        user_back.setForeground(new java.awt.Color(255, 255, 255));
        user_back.setText("BACK TO USER PANEL");
        user_back.setAlignmentY(0.0F);
        user_back.setBorderPainted(false);
        user_back.setFocusPainted(false);
        user_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        user_back.setIconTextGap(0);
        user_back.setMargin(new java.awt.Insets(2, 10, 2, 10));
        user_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_backActionPerformed(evt);
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

        vote.setBackground(new java.awt.Color(0, 0, 0));
        vote.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        vote.setForeground(new java.awt.Color(255, 255, 255));
        vote.setText("VOTE");
        vote.setAlignmentY(0.0F);
        vote.setBorderPainted(false);
        vote.setFocusPainted(false);
        vote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vote.setIconTextGap(0);
        vote.setMargin(new java.awt.Insets(2, 10, 2, 10));
        vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteActionPerformed(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(user_back)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vote))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(previous))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(add_clean_sheets, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_assists, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_goals, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_played, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_position, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_club, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add_country, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(min)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(exit))
                                .addComponent(next)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit)
                    .addComponent(min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_country, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_club, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_position, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_played, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_goals, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_assists, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_clean_sheets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(previous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_back)
                    .addComponent(vote))
                .addGap(31, 31, 31))
        );

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

    private void add_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_clubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_clubActionPerformed

    private void search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_nameActionPerformed

    private void add_countryComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_add_countryComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_add_countryComponentShown

    private void add_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_countryActionPerformed

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
            while(rs.next()){
                if (!rs.getString(2).equals(p5)) {
                    if (!rs.getString(2).equals(p3)) {
                        String name2 = rs.getString(2);
                        String country = rs.getString(3);
                        String club = rs.getString(4);
                        String position = rs.getString(5);
                        String played = rs.getString(6);
                        String goals = rs.getString(7);
                        String assists = rs.getString(8);
                        String clean_sheets = rs.getString(9);

                        Blob image = rs.getBlob(14);
                        String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
                        byte [] bytea = image.getBytes(1, (int)image.length());
                        FileOutputStream fos = new FileOutputStream(path);
                        fos.write(bytea);
                        ImageIcon icon = new ImageIcon(bytea);
                        add_photo.setIcon(icon);

                        search_name.setText(name2);
                        add_country.setText(country);
                        add_club.setText(club);
                        add_position.setText(position);
                        add_played.setText(played);
                        add_goals.setText(goals);
                        add_assists.setText(assists);
                        add_clean_sheets.setText(clean_sheets);
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void add_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_positionActionPerformed

    private void add_playedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_playedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_playedActionPerformed

    private void add_goalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_goalsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_goalsActionPerformed

    private void add_assistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_assistsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_assistsActionPerformed

    private void add_clean_sheetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_clean_sheetsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_clean_sheetsActionPerformed

    private void user_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_backActionPerformed
        // TODO add your handling code here:
        User u;
        try {
            u = new User(user);
            u.show();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_user_backActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        try {
            while(rs.previous()){
                if (!rs.getString(2).equals(p5)) {
                    if (!rs.getString(2).equals(p3)) {
                        String name2 = rs.getString(2);
                        String country = rs.getString(3);
                        String club = rs.getString(4);
                        String position = rs.getString(5);
                        String played = rs.getString(6);
                        String goals = rs.getString(7);
                        String assists = rs.getString(8);
                        String clean_sheets = rs.getString(9);

                        Blob image = rs.getBlob(14);
                        String path = "C:\\Users\\never\\OneDrive\\Documents\\NetBeansProjects\\nrproject\\src\\nrproject\\images\\img.jpg";
                        byte [] bytea = image.getBytes(1, (int)image.length());
                        FileOutputStream fos = new FileOutputStream(path);
                        fos.write(bytea);
                        ImageIcon icon = new ImageIcon(bytea);
                        add_photo.setIcon(icon);

                        search_name.setText(name2);
                        add_country.setText(country);
                        add_club.setText(club);
                        add_position.setText(position);
                        add_played.setText(played);
                        add_goals.setText(goals);
                        add_assists.setText(assists);
                        add_clean_sheets.setText(clean_sheets);
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewPlayersAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previousActionPerformed

    private void voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteActionPerformed
        try {
            // TODO add your handling code here:
            Connection c2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "1234");
            String sql2 = "update user_registration set points1=? where idno=?";
            PreparedStatement ptst2 = c2.prepareStatement(sql2);
            ptst2.setInt(2, user);
            String name3 = rs.getString(2);
            ptst2.setString(1, name3);
            ptst2.executeUpdate();
            String sql3 = "update playerdata set points=?, points1=? where name=?";
            PreparedStatement ptst3 = c.prepareStatement(sql3);
            ptst3.setString(3, name3);
            int cp = rs.getInt(10);
            ptst3.setInt(1, cp+1);
            int p1 = rs.getInt(13);
            ptst3.setInt(2, p1+1);
            ptst3.executeUpdate();
            JOptionPane.showMessageDialog(null, "Voted successfully");
            User u = new User(user);
            u.show();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(VotePoints5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_voteActionPerformed

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
            java.util.logging.Logger.getLogger(VotePoints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotePoints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotePoints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotePoints1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VotePoints1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VotePoints1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(VotePoints1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_assists;
    private javax.swing.JTextField add_clean_sheets;
    private javax.swing.JTextField add_club;
    private javax.swing.JTextField add_country;
    private javax.swing.JTextField add_goals;
    private javax.swing.JLabel add_photo;
    private javax.swing.JTextField add_played;
    private javax.swing.JTextField add_position;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel min;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JTextField search_name;
    private javax.swing.JButton user_back;
    private javax.swing.JButton vote;
    // End of variables declaration//GEN-END:variables
}
