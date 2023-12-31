package MobileBanking;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Login_page_2 extends javax.swing.JFrame {

    public Login_page_2() {
        initComponents();
        connect();
        regp.hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        L_txtacno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        L_txtpin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Login_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        regp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sign_btn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_pic = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        s_mbl = new javax.swing.JTextField();
        s_nid = new javax.swing.JTextField();
        s_ad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        s_cpin = new javax.swing.JPasswordField();
        s_pin = new javax.swing.JPasswordField();
        s_bdate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        s_name1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        pic_upload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginp.setBackground(new java.awt.Color(255, 255, 255));
        loginp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel1.setText("Log In");
        loginp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 270, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("to your billionaire account");
        loginp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, 40));

        L_txtacno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L_txtacno.setBorder(null);
        loginp.add(L_txtacno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 290, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PIN");
        loginp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 170, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        loginp.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 300, 10));

        L_txtpin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        L_txtpin.setBorder(null);
        loginp.add(L_txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 260, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Account Number");
        loginp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 160, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        loginp.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 300, 10));

        Login_Button.setBackground(new java.awt.Color(225, 19, 111));
        Login_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_right_40px.png"))); // NOI18N
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        loginp.add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 140, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_dove_60px.png"))); // NOI18N
        loginp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 70));

        signup_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signup_btn.setText("Dont have an account? Sign Up");
        signup_btn.setBorder(null);
        signup_btn.setContentAreaFilled(false);
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        loginp.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 300, 50));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_hide_25px.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
        });
        loginp.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 40, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_eye_25px.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
        });
        loginp.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 40, 40));

        regp.setBackground(new java.awt.Color(255, 255, 255));
        regp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(225, 19, 111));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registration");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_left_40px_1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        regp.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Pin");
        regp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Picture");
        regp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Birthdate");
        regp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Mobile No.");
        regp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("NID Number");
        regp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Address");
        regp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 110, 30));

        sign_btn.setBackground(new java.awt.Color(225, 19, 111));
        sign_btn.setText("Sign Up");
        sign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_btnActionPerformed(evt);
            }
        });
        regp.add(sign_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 140, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 410, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 410, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 330, 20));

        txt_pic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_pic.setBorder(null);
        regp.add(txt_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 220, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 410, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 410, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 410, 20));

        s_mbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_mbl.setBorder(null);
        regp.add(s_mbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 290, 30));

        s_nid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_nid.setBorder(null);
        regp.add(s_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 290, 30));

        s_ad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_ad.setBorder(null);
        regp.add(s_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Pin Number");
        regp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 110, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 410, 20));

        s_cpin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_cpin.setBorder(null);
        regp.add(s_cpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 290, 30));

        s_pin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_pin.setBorder(null);
        regp.add(s_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 290, 30));
        regp.add(s_bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 290, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Name");
        regp.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 30));

        s_name1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s_name1.setBorder(null);
        regp.add(s_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 290, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        regp.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 410, 20));

        pic_upload.setText("Choose");
        pic_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pic_uploadActionPerformed(evt);
            }
        });
        regp.add(pic_upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginp, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(regp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginp, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(regp, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     Connection con;

    public void connect() {
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mobilebanking", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String getmobile() {
        return acno;
    }
    static String acno;
    String name, bdate, mobile, nid, ad, pin, cpin, filename, picture;
    PreparedStatement insert;
    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed

        acno = L_txtacno.getText();
        String pin = L_txtpin.getText();
        try {
            PreparedStatement select;
            select = (PreparedStatement) con.prepareStatement("select mobile,pin from user_info where mobile = ? and pin=?");
            select.setString(1, acno);
            select.setString(2, pin);
            ResultSet rs = select.executeQuery();
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful!!");
                new DashboardPage().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Password.Try Again!!");
                L_txtpin.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        regp.show();
        loginp.hide();
    }//GEN-LAST:event_signup_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loginp.show();
        regp.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sign_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_btnActionPerformed
        name = s_name1.getText();
        bdate = s_bdate.getDate().toString();
        mobile = s_mbl.getText();
        nid = s_nid.getText();
        ad = s_ad.getText();
        pin = s_pin.getText();
        cpin = s_cpin.getText();
        picture = txt_pic.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Name");
        } else if (bdate.equals("")) {
            JOptionPane.showMessageDialog(this, "Select Birth Date");
        } else if (mobile.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Mobile Number");
        } else if (nid.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the NID Number");
        } else if (ad.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Address");
        } else if (cpin.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter the Pin");
        } else if (picture.equals("")) {
            JOptionPane.showMessageDialog(this, "Select Profile Picture");
        } else if (cpin.equals(pin)) {
            try {
                insert = con.prepareStatement("insert into user_info (mobile,pin,name,bdate,nid,ad,pic) values(?,?,?,?,?,?,?)");
                insert.setString(1, mobile);
                insert.setString(2, pin);
                insert.setString(3, name);
                insert.setString(4, bdate);
                insert.setString(5, nid);
                insert.setString(6, ad);
                insert.setString(7, picture);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Registration successful");
            } catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                insert = con.prepareStatement("insert into customer_balance (mobile,balance) values(?,?)");
                insert.setString(1, mobile);
                insert.setInt(2, 0);
                insert.executeUpdate();
                regp.hide();
                loginp.show();
                s_name1.setText("");
                s_mbl.setText("");
                s_nid.setText("");
                s_ad.setText("");
                s_pin.setText("");
                s_cpin.setText("");
                txt_pic.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Pin Not Match");
            s_pin.setText("");
            s_cpin.setText("");
        }
    }//GEN-LAST:event_sign_btnActionPerformed

    private void pic_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pic_uploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txt_pic.setText(filename);
    }//GEN-LAST:event_pic_uploadActionPerformed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        L_txtpin.setEchoChar('*');
    }//GEN-LAST:event_hideMousePressed

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        hide.setVisible(true);
        show.setVisible(false);
        L_txtpin.setEchoChar((char) 0);
    }//GEN-LAST:event_showMousePressed

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
            java.util.logging.Logger.getLogger(Login_page_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_page_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_page_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_page_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_page_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L_txtacno;
    private javax.swing.JPasswordField L_txtpin;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel loginp;
    private javax.swing.JButton pic_upload;
    private javax.swing.JPanel regp;
    private javax.swing.JTextField s_ad;
    private com.toedter.calendar.JDateChooser s_bdate;
    private javax.swing.JPasswordField s_cpin;
    private javax.swing.JTextField s_mbl;
    private javax.swing.JTextField s_name1;
    private javax.swing.JTextField s_nid;
    private javax.swing.JPasswordField s_pin;
    private javax.swing.JLabel show;
    private javax.swing.JButton sign_btn;
    private javax.swing.JButton signup_btn;
    private javax.swing.JTextField txt_pic;
    // End of variables declaration//GEN-END:variables
}
