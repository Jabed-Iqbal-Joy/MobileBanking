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

public class Banktocash extends javax.swing.JFrame {

    public Banktocash() {
        initComponents();
        jPanel3.hide();
        connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        L_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        my_ac = new javax.swing.JRadioButton();
        Ot_ac = new javax.swing.JRadioButton();
        txt_amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        procced = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_card_num = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        amt_lvl = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_bank_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_panel.setBackground(new java.awt.Color(225, 19, 111));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_left_40px_1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank To Billionaire Cash");

        javax.swing.GroupLayout L_panelLayout = new javax.swing.GroupLayout(L_panel);
        L_panel.setLayout(L_panelLayout);
        L_panelLayout.setHorizontalGroup(
            L_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(L_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        L_panelLayout.setVerticalGroup(
            L_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, L_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(L_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(my_ac);
        my_ac.setText("My Account");
        my_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                my_acActionPerformed(evt);
            }
        });

        buttonGroup1.add(Ot_ac);
        Ot_ac.setText("Other Account");
        Ot_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ot_acActionPerformed(evt);
            }
        });

        txt_amount.setText("Enter Amount to add");
        txt_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_amountFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Amount");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Recipient's Account Number");

        txt_num.setText("Enter Account number");

        procced.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        procced.setText("Proceed");
        procced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_amount)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(my_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ot_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(txt_num, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(procced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(my_ac)
                    .addComponent(Ot_ac))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(procced, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 430, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Pament Details");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 229, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Bank Name ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 152, 26));
        jPanel3.add(txt_card_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 558, 43));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Bank Number");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 213, 26));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Your Order");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 87, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Total Amount");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 244, 27));

        amt_lvl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        amt_lvl.setText("hgfhgf");
        jPanel3.add(amt_lvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 104, 30));

        pay.setText("Pay");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel3.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 142, 40));

        jButton4.setText("Cencel");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 114, 40));

        txt_bank_name.setText("jTextField1");
        txt_bank_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_bank_nameFocusGained(evt);
            }
        });
        jPanel3.add(txt_bank_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 550, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     Connection conn;
    PreparedStatement pst, update, delete, select, insert;
    ResultSet rs;
    String acno, tbalance, pin, amnt;
    int balance, ttbalance, rbalance;

    public void connect() {
        try {
            conn = (Connection) (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/mobilebanking", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void balance(String mobile_num) {
        try {
            select = (PreparedStatement) (java.sql.PreparedStatement) conn.prepareStatement("select balance from customer_balance where mobile = ?");
            select.setString(1, mobile_num);
            rs = select.executeQuery();
            ResultSetMetaData rss = (ResultSetMetaData) rs.getMetaData();
            if (rs.next()) {
                rbalance = rs.getInt("balance");
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Number.Try Again!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DashboardPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void my_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_my_acActionPerformed
        String ac_no;
        ac_no = Login_page_2.getmobile();
        txt_num.setText(ac_no);
    }//GEN-LAST:event_my_acActionPerformed

    private void Ot_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ot_acActionPerformed
        txt_num.setText("");
    }//GEN-LAST:event_Ot_acActionPerformed

    private void txt_amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_amountFocusGained
        txt_amount.setText("");
    }//GEN-LAST:event_txt_amountFocusGained

    private void txt_amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_amountFocusLost
        String s = txt_amount.getText();
        if (s.equals("")) {
            txt_amount.setText("Enter Amount to add");
        }
    }//GEN-LAST:event_txt_amountFocusLost

    private void proccedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccedActionPerformed
        acno = txt_num.getText();
        amnt = txt_amount.getText();
        if (acno.equals("") || acno.equals("Enter Account number")) {
            JOptionPane.showMessageDialog(this, "Enter Number");
        } else if (amnt.equals("Enter Amount to add")) {
            JOptionPane.showMessageDialog(this, "Enter Amount");
        } else {
            amt_lvl.setText(amnt);
            jPanel2.hide();
            jPanel3.show();
        }
    }//GEN-LAST:event_proccedActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        String cdnum = txt_card_num.getText();
        String Bankname = txt_bank_name.getText();
        balance(acno);
        if (cdnum.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Bank Number");
        } else if (Bankname.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Bank Name");
        } else {
            DateTimeFormatter dfd = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime nowt = LocalDateTime.now();
            try {

                update = (PreparedStatement) conn.prepareStatement("update customer_balance set balance=? where mobile=?");
                update.setInt(1, (rbalance + Integer.parseInt(amnt)));
                update.setString(2, acno);
                update.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                insert = (PreparedStatement) conn.prepareStatement("insert into inbox (type,number,balance,time,date,acno) values(?,?,?,?,?,?)");
                
                insert.setString(1, "Add Money From Bank");
                insert.setString(2, cdnum);
                insert.setInt(3, Integer.parseInt(amnt));
                insert.setString(4, dfd.format(nowt));
                insert.setString(5, dft.format(now));
                insert.setString(6, acno);
                insert.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(sendmoney.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Add Money Succesfull");
            new DashboardPage().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_payActionPerformed

    private void txt_bank_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_bank_nameFocusGained
        txt_bank_name.setText("");
    }//GEN-LAST:event_txt_bank_nameFocusGained

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
            java.util.logging.Logger.getLogger(Banktocash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banktocash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banktocash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banktocash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banktocash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel L_panel;
    private javax.swing.JRadioButton Ot_ac;
    private javax.swing.JLabel amt_lvl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton my_ac;
    private javax.swing.JButton pay;
    private javax.swing.JButton procced;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_bank_name;
    private javax.swing.JTextField txt_card_num;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
