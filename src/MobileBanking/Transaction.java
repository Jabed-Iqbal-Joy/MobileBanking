package MobileBanking;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.toedter.calendar.JCalendar;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Transaction extends JFrame implements ActionListener {

    JPanel p1;
    JPanel tarea;
    static Box vertical = Box.createVerticalBox();

    public Transaction() {

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(225, 19, 111));
        p1.setBounds(0, 0, 608, 70);
        add(p1);

        //BackButton//
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/icons8_left_40px_1.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(5, 17, 73, 49);
        p1.add(l1);

        //BackButton work//
        l1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                new DashboardPage().setVisible(true);
                setVisible(false);
            }
        });

        //Transaction Level//
        JLabel l3 = new JLabel("Transaction");
        l3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setBounds(240, 15, 400, 40);
        p1.add(l3);

        //Text Area//
        tarea = new JPanel();
        //tarea.setBounds(5, 75, 600, 370);
        tarea.setBackground(new Color(225, 19, 111));
        tarea.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        // add(tarea);

        //ScrollPane
        JScrollPane sp = new JScrollPane(tarea);
        sp.setBounds(5, 75, 600, 370);
        sp.setBorder(BorderFactory.createEmptyBorder());
        add(sp);

        setLayout(null);
        setSize(625, 490);
        setLocation(370, 144);
        setBackground(new Color(255,255,255));
        setVisible(true);

        connect();
        transactionmsgshow();

    }

    //connect database
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

    //transactionmsgshow();
    public void transactionmsgshow() {
        acno=Login_page_2.getmobile();
        try {
            pst = (PreparedStatement) conn.prepareStatement("select * from inbox ");
            //pst.setString(1, acno);
            rs = pst.executeQuery();
            while (rs.next()) {
                String type = rs.getString("type");
                String number = rs.getString("number");
                String balanc = rs.getString("balance");
                balanc+="  ";
                balanc+="$";
                String time = rs.getString("time");
                time += "  ";
                time += rs.getString("date");
                String acnum= rs.getString("acno");
                
                if(number.equals(acno))
                {
                    if(type.equals("Send Money"))
                    {
                        String newnum=number;
                        number=acnum;
                        acnum=newnum;
                        type="Received Money";
                    }
                    else if(type.equals("Payment"))
                    {
                        String newnum=number;
                        number=acnum;
                        acnum=newnum;
                        type="Received Payment";
                    }
                }
                
               if(acnum.equals(acno)){
                JPanel p2 = formatLabel(type, number, balanc, time);
                tarea.setLayout(new BorderLayout());
                JPanel right = new JPanel(new BorderLayout());
                right.add(p2, BorderLayout.LINE_START);
                vertical.add(right);
                vertical.add(Box.createVerticalStrut(05));
                tarea.add(vertical, BorderLayout.PAGE_START);
               }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //formatlevel
    public JPanel formatLabel(String type,String number, String balanc,String time) {
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));

        JLabel l1 = new JLabel("<html><h3 style =\"text-align:left;\">" + type + "<br>" + number + "<br>" + balanc + "<br>" + time + "<br>" + "</h3></html>");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        l1.setBackground(new Color(255, 255, 255));
        l1.setOpaque(true);
        l1.setBorder(new EmptyBorder(5, 5, 5, 450));
        p3.add(l1);
        return p3;
    }

    //override actionperformed
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String args[]) {
        new Transaction().setVisible(true);
    }
}
