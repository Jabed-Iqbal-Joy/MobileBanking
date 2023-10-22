package MobileBanking;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Recharge extends javax.swing.JFrame {

    public Recharge() {
        initComponents();
        connect();
        balance();
        jPanel3.hide();
        jPanel4.hide();
        jPanel5.hide();
        jPanel6.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        L_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mobile_num_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        amounttxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Balance_level = new javax.swing.JLabel();
        send_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Mobile_num_level = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        amountlvl = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pintxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_panel.setBackground(new java.awt.Color(225, 19, 111));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mobile Recharge");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_left_40px_1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout L_panelLayout = new javax.swing.GroupLayout(L_panel);
        L_panel.setLayout(L_panelLayout);
        L_panelLayout.setHorizontalGroup(
            L_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        L_panelLayout.setVerticalGroup(
            L_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(L_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 619, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("To");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        mobile_num_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(mobile_num_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 300, 35));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_arrow_20px.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 35, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 440, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(amounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 100, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Available Balance :  ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, 20));

        Balance_level.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Balance_level.setText("jLabel6");
        jPanel3.add(Balance_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, 20));

        send_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_arrow_50px_1.png"))); // NOI18N
        send_btn.setContentAreaFilled(false);
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        jPanel3.add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, 45));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Amount");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 23));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 195, 440, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("To");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        Mobile_num_level.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mobile_num_level.setText("jLabel5");
        jPanel4.add(Mobile_num_level, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 335, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 440, 80));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Amount");

        amountlvl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        amountlvl.setText("jLabel7");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(74, 74, 74)
                .addComponent(amountlvl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(amountlvl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 195, 440, 130));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Enter Pin");

        confirmbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_arrow_20px.png"))); // NOI18N
        confirmbtn.setContentAreaFilled(false);
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 440, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection conn;
    PreparedStatement pst, update, delete, select, insert;
    ResultSet rs;
    String acno, tbalance, pin;
    int balance, ttbalance, rbalance;

    public void connect() {
        try {
            conn = (Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/mobilebanking", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void balance() {
        acno = Login_page_2.getmobile();
        try {
            pst = (PreparedStatement) conn.prepareStatement("select * from customer_balance where mobile=?");
            pst.setString(1, acno);
            rs = pst.executeQuery();
            while (rs.next()) {
                String balancee = rs.getString("balance");
                Balance_level.setText(balancee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String mobile_num;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mobile_num = mobile_num_txt.getText();
        Mobile_num_level.setText(mobile_num);
        jPanel2.hide();
        jPanel3.show();
        jPanel4.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        tbalance = amounttxt.getText();
        ttbalance = Integer.parseInt(tbalance);
        acno =Login_page_2.getmobile();
        try {
            select = (PreparedStatement) (java.sql.PreparedStatement) conn.prepareStatement("select balance from customer_balance where mobile = ?");
            select.setString(1, acno);
            rs = select.executeQuery();
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            if (rs.next()) {
                balance = rs.getInt("balance");
                System.out.println(balance);
                System.err.println("\n");
                System.out.println(ttbalance);
                if (balance >= ttbalance && ttbalance >= 10) {
                    jPanel3.hide();
                    jPanel5.show();
                    jPanel6.show();
                    amountlvl.setText(tbalance);
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance.please use add Money feature from "
                            + "homescreen to add to your account Balance, and persorm transactions comfortably");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Number.Try Again!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_send_btnActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        pin = pintxt.getText();
        acno = Login_page_2.getmobile();
        DateTimeFormatter dfd = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime nowt = LocalDateTime.now();
        try {
            select = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("select pin from user_info where mobile = ? ");
            select.setString(1, acno);
            rs = select.executeQuery();
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            if (rs.next()) {
                String newpin = rs.getString("pin");
                if (newpin.equals(pin)) {
                    try {

                        update = (PreparedStatement) conn.prepareStatement("update customer_balance set balance=? where mobile=?");
                        update.setInt(1, (balance - ttbalance));
                        update.setString(2, acno);
                        update.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        insert = (PreparedStatement) conn.prepareStatement("insert into inbox (type,number,balance,time,date,acno) values(?,?,?,?,?,?)");
                        insert.setString(6, acno);
                        insert.setString(1, "Mobile Recharge");
                        insert.setString(2, mobile_num);
                        insert.setInt(3, ttbalance);
                        insert.setString(4, dfd.format(nowt));
                        insert.setString(5, dft.format(now));
                        insert.executeUpdate();

                    } catch (SQLException ex) {
                        Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(this, "Mobile Recharge Succesfull");
                    new DashboardPage().setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong PIN Number");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Password");
            }
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DashboardPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recharge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balance_level;
    private javax.swing.JPanel L_panel;
    private javax.swing.JLabel Mobile_num_level;
    private javax.swing.JLabel amountlvl;
    private javax.swing.JTextField amounttxt;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField mobile_num_txt;
    private javax.swing.JTextField pintxt;
    private javax.swing.JButton send_btn;
    // End of variables declaration//GEN-END:variables
}
