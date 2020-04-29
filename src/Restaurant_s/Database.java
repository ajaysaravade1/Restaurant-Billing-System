package Restaurant_s;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Database extends JFrame {

    JFrame frame1;
    JLabel l0, l1, l2;
    JComboBox c1;
    JButton b1;
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;
    String ids;
    static JTable table;
    String[] columnNames = {"Customer name", "Date & Time", "Payment", "Drinks","Meal","Total Bill"};
    String from;

    Database() {

        try {
             Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Res","root","toor");
    
            
        } catch (Exception e) {
        }
        frame1 = new JFrame("Database");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        from = "user1";
        frame1.setVisible(true);
        String c_name = "";
        String date = "";
        String payment = "";
        String Drinks = "";
        String Meal = "";
        String Total_bill="";

        try {
            pst = con.prepareStatement("select * from customer");
            ResultSet rs = pst.executeQuery();
            int i;
            for(i=0;rs.next();i++)
            {
                c_name = rs.getString("c_name");
                date = rs.getString("date&time");
                payment = rs.getString("payment");
                Drinks = rs.getString("Drinks");
                Meal = rs.getString("Meal");
                Total_bill = rs.getString("Total_Bill");
                model.addRow(new Object[]{c_name, date, payment, Drinks,Meal,Total_bill});
           
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (i == 1) {
                System.out.println(i + " Record Found");
            } else {
                System.out.println(i + " Records Found");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(400, 300);
    }

    public static void main(String args[]) {
      
    }
    }