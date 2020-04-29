package Restaurant_s;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.lang.*;
import java.text.MessageFormat;
import javax.swing.JScrollPane;

public class Res extends javax.swing.JFrame {
    int loop;   
    double firstnum;
       double secondnum;
       double result;
       String operation;
       Connection con;
       int Cash=0;
       int Paytm=0;
       Statement stmt,smt1,sm;
       ResultSet rs;
       String Name;
       String Time;
       String Pay;
       String dr;
       String f;
       String str;
       double RVada_pav =10,RSamosa =10,RMendu_Vada =15,RMasala_Dosa=15,RRava_Masala_Dosa=15,RPav_Bhaji=15,RCheese_Pav_Bhaji=20,RBhurji_Pav=20,RUpma=15,RShira=10;
       double RApple=15, RTea=5 , RIce_Tea=15, RCoffee=10, RIceCream=10, RSprite=15, RCoke=15;
       
    /**
     * Creates new form Res
     */
    public Res() {
      
        initComponents();
        try
        {
            setLocation(10,10);
            Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Res","root","toor");
        }
        catch(SQLException | ClassNotFoundException e)
        {
         System.out.println(e.getMessage());
        }
        jBtnCheck.setVisible(false);
        jtxtApple.setText("0");
        jtxtTea.setText("0");  
    jtxtIce_Tea.setText("0");
    jtxtCoffee.setText("0");
    jtxtSprite.setText("0");
    jtxtCoke.setText("0");
    jtxtVada_pav.setText("0");
    jtxtSamosa.setText("0");
    jtxtMendu_Vada.setText("0");
    jtxtMasala_Dosa.setText("0");
    jtxtRava_Masala_Dosa.setText("0");
    jtxtPav_Bhaji.setText("0");
    jtxtCheese_Pav_Bhaji.setText("0");
    jtxtBhurji_Pav.setText("0");
    jtxtUpma.setText("0");
    jtxtShira.setText("0");
    Receipt.setEditable(false);
    jLabel2.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlblName = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jlblClock = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtVada_pav = new javax.swing.JTextField();
        jChHDelivery = new javax.swing.JCheckBox();
        jlblCostOfDrinks2 = new javax.swing.JLabel();
        jlblCostOfDrinks = new javax.swing.JLabel();
        jlblCostOfMeal = new javax.swing.JLabel();
        jlblCostOfMeal2 = new javax.swing.JLabel();
        jlblCostOfDelivery2 = new javax.swing.JLabel();
        jlblCostOfDelivery = new javax.swing.JLabel();
        jtxtApple = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtxtSamosa = new javax.swing.JTextField();
        jtxtMendu_Vada = new javax.swing.JTextField();
        jtxtTea = new javax.swing.JTextField();
        jtxtIce_Tea = new javax.swing.JTextField();
        jtxtCoffee = new javax.swing.JTextField();
        jtxtSprite = new javax.swing.JTextField();
        jtxtCoke = new javax.swing.JTextField();
        jtxtMasala_Dosa = new javax.swing.JTextField();
        jtxtRava_Masala_Dosa = new javax.swing.JTextField();
        jtxtPav_Bhaji = new javax.swing.JTextField();
        jtxtCheese_Pav_Bhaji = new javax.swing.JTextField();
        jtxtBhurji_Pav = new javax.swing.JTextField();
        jtxtUpma = new javax.swing.JTextField();
        jtxtShira = new javax.swing.JTextField();
        llbl = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jChCash = new javax.swing.JCheckBox();
        jChPaytm = new javax.swing.JCheckBox();
        jBtnCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnDot = new javax.swing.JButton();
        jBtnC = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtnEql = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtnBack = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnAORS = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtnMul = new javax.swing.JButton();
        jBtnSub = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        Get_Receipt = new javax.swing.JToggleButton();
        Get_Receipt1 = new javax.swing.JToggleButton();
        Get_Receipt2 = new javax.swing.JToggleButton();

        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restuarant Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblName.setText("Name :-");

        jlblClock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Date & time");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton3KeyTyped(evt);
            }
        });

        jButton5.setText("Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addGap(105, 105, 105))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton5)
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Items");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jtxtVada_pav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtVada_pav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVada_pavActionPerformed(evt);
            }
        });

        jChHDelivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChHDelivery.setText("Home Delivery");
        jChHDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChHDeliveryMouseClicked(evt);
            }
        });
        jChHDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChHDeliveryActionPerformed(evt);
            }
        });

        jlblCostOfDrinks2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 102, 0)));

        jlblCostOfDrinks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCostOfDrinks.setText("Cost of Drinks");

        jlblCostOfMeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCostOfMeal.setText("Cost of Meal");

        jlblCostOfMeal2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 102, 0)));

        jlblCostOfDelivery2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 102, 0)));

        jlblCostOfDelivery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblCostOfDelivery.setText("Cost of Delivery");

        jtxtApple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtApple.setToolTipText("");
        jtxtApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAppleActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Drink");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Quantity");

        jtxtSamosa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtSamosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSamosaActionPerformed(evt);
            }
        });

        jtxtMendu_Vada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtMendu_Vada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMendu_VadaActionPerformed(evt);
            }
        });

        jtxtTea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtTea.setToolTipText("");
        jtxtTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTeaActionPerformed(evt);
            }
        });

        jtxtIce_Tea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtIce_Tea.setToolTipText("");
        jtxtIce_Tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIce_TeaActionPerformed(evt);
            }
        });

        jtxtCoffee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCoffee.setToolTipText("");
        jtxtCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCoffeeActionPerformed(evt);
            }
        });

        jtxtSprite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtSprite.setToolTipText("");
        jtxtSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSpriteActionPerformed(evt);
            }
        });

        jtxtCoke.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCoke.setToolTipText("");
        jtxtCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCokeActionPerformed(evt);
            }
        });

        jtxtMasala_Dosa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtMasala_Dosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMasala_DosaActionPerformed(evt);
            }
        });

        jtxtRava_Masala_Dosa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtRava_Masala_Dosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRava_Masala_DosaActionPerformed(evt);
            }
        });

        jtxtPav_Bhaji.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtPav_Bhaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPav_BhajiActionPerformed(evt);
            }
        });

        jtxtCheese_Pav_Bhaji.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtCheese_Pav_Bhaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCheese_Pav_BhajiActionPerformed(evt);
            }
        });

        jtxtBhurji_Pav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtBhurji_Pav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBhurji_PavActionPerformed(evt);
            }
        });

        jtxtUpma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtUpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUpmaActionPerformed(evt);
            }
        });

        jtxtShira.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxtShira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtShiraActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Total");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Vada Pav");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Samosa");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Mendu Vada");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Masala Dosa");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Rava Masala Dosa");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pav Bhaji");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Cheese Pav Bhaji");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Bhurji Pav");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Upma");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Shira");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Apple Juice");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tea");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Ice Tea");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Coffee");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Sprite");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Coke");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jChHDelivery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCostOfMeal2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCostOfDelivery2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCostOfDrinks2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtVada_pav, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMendu_Vada, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtMasala_Dosa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtRava_Masala_Dosa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtPav_Bhaji, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCheese_Pav_Bhaji, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtBhurji_Pav, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtUpma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtShira, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtApple, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jtxtTea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtIce_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCoke, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtIce_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCostOfDrinks2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jChHDelivery))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblCostOfMeal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblCostOfDelivery)
                            .addComponent(jlblCostOfDelivery2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtVada_pav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSamosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMendu_Vada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMasala_Dosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtRava_Masala_Dosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtPav_Bhaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCheese_Pav_Bhaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBhurji_Pav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUpma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtShira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(35, 35, 35)
                .addComponent(llbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payment Method:-");

        jChCash.setText("Cash");
        jChCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChCashActionPerformed(evt);
            }
        });
        jChCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jChCashKeyReleased(evt);
            }
        });

        jChPaytm.setText("Paytm");
        jChPaytm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChPaytmActionPerformed(evt);
            }
        });

        jBtnCheck.setText("Check Payment");
        jBtnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCheckActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnCheck)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jChCash, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jChPaytm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChCash)
                    .addComponent(jChPaytm))
                .addGap(59, 59, 59)
                .addComponent(jBtnCheck)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42))
        );

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDot.setText(".");
        jBtnDot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDotActionPerformed(evt);
            }
        });

        jBtnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnC.setText("C");
        jBtnC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtnEql.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnEql.setText("=");
        jBtnEql.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnEql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqlActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtnBack.setFont(new java.awt.Font("Mangal", 1, 18)); // NOI18N
        jBtnBack.setText("<-");
        jBtnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnAORS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnAORS.setText("+/-");
        jBtnAORS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnAORS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAORSActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtnMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnMul.setText("*");
        jBtnMul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMulActionPerformed(evt);
            }
        });

        jBtnSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSub.setText("-");
        jBtnSub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubActionPerformed(evt);
            }
        });

        jBtnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnAdd.setText("+");
        jBtnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Calculator");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnAORS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnEql, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAORS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEql, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Calculator", jPanel9);

        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane1.setViewportView(Receipt);

        Get_Receipt.setText("Get Receipt");
        Get_Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_ReceiptActionPerformed(evt);
            }
        });

        Get_Receipt1.setText("Print");
        Get_Receipt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_Receipt1ActionPerformed(evt);
            }
        });

        Get_Receipt2.setText("Clear");
        Get_Receipt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_Receipt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Get_Receipt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Get_Receipt1)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Get_Receipt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Get_Receipt)
                    .addComponent(Get_Receipt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Get_Receipt2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Receipt", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date today = new Date();
        jlblClock.setText(today.toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyTyped

    private void jtxtVada_pavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVada_pavActionPerformed

    }//GEN-LAST:event_jtxtVada_pavActionPerformed

    private void jChHDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChHDeliveryMouseClicked

    }//GEN-LAST:event_jChHDeliveryMouseClicked

    private void jChHDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChHDeliveryActionPerformed

    }//GEN-LAST:event_jChHDeliveryActionPerformed

    private void jtxtAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAppleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAppleActionPerformed

    private void jtxtSamosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSamosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSamosaActionPerformed

    private void jtxtMendu_VadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMendu_VadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMendu_VadaActionPerformed

    private void jtxtTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTeaActionPerformed

    private void jtxtIce_TeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIce_TeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIce_TeaActionPerformed

    private void jtxtCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCoffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCoffeeActionPerformed

    private void jtxtSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSpriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSpriteActionPerformed

    private void jtxtCokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCokeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCokeActionPerformed

    private void jtxtMasala_DosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMasala_DosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMasala_DosaActionPerformed

    private void jtxtRava_Masala_DosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRava_Masala_DosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRava_Masala_DosaActionPerformed

    private void jtxtPav_BhajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPav_BhajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPav_BhajiActionPerformed

    private void jtxtCheese_Pav_BhajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCheese_Pav_BhajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCheese_Pav_BhajiActionPerformed

    private void jtxtBhurji_PavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBhurji_PavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBhurji_PavActionPerformed

    private void jtxtUpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUpmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUpmaActionPerformed

    private void jtxtShiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtShiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtShiraActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Double d1=0.00,d2=0.00,d3=0.00,d4=0.00,d5=0.00,d6=0.00,f1=0.00,f2=0.00,f3=0.00,f4=0.00,f5=0.00,f6=0.00,f7=0.00,f8=0.00,f9=0.00,f10=0.00,Drinks=0.00,Meal=0.00,Delivery=0.00;
        if(jtxtApple.getText()!=null)
        {
            d1=Double.parseDouble(jtxtApple.getText())*RApple;
        }
        if(jtxtTea.getText()!=null)
        {
            d2=Double.parseDouble(jtxtTea.getText())*RTea;
        }
        if(jtxtIce_Tea.getText()!=null)
        {
            d3=Double.parseDouble(jtxtIce_Tea.getText())*RIce_Tea;
        }
        if(jtxtCoffee.getText()!=null)
        {
            d4=Double.parseDouble(jtxtCoffee.getText())*RCoffee;
        }
        if(jtxtSprite.getText()!=null)
        {
            d5=Double.parseDouble(jtxtSprite.getText())*RSprite;
        }
        if(jtxtCoke.getText()!=null)
        {
            d6=Double.parseDouble(jtxtCoke.getText())*RCoke;
        }

        if(jtxtVada_pav.getText()!=null)
        {
            f1=Double.parseDouble(jtxtVada_pav.getText())*RVada_pav;
        }
        if(jtxtSamosa.getText()!=null)
        {
            f2=Double.parseDouble(jtxtSamosa.getText())*RSamosa;
        }
        if(jtxtMendu_Vada.getText()!=null)
        {
            f3=Double.parseDouble(jtxtMendu_Vada.getText())*RMendu_Vada;
        }
        if(jtxtMasala_Dosa.getText()!=null)
        {
            f4=Double.parseDouble(jtxtMasala_Dosa.getText())*RMasala_Dosa;

        }
        if(jtxtRava_Masala_Dosa.getText()!=null)
        {
            f5=Double.parseDouble(jtxtRava_Masala_Dosa.getText())*RRava_Masala_Dosa;
        }
        if(jtxtPav_Bhaji.getText()!=null)
        {
            f6=Double.parseDouble(jtxtPav_Bhaji.getText())*RPav_Bhaji;
        }
        if(jtxtCheese_Pav_Bhaji.getText()!=null)
        {
            f7=Double.parseDouble(jtxtCheese_Pav_Bhaji.getText())*RCheese_Pav_Bhaji;

        }
        if(jtxtBhurji_Pav.getText()!=null)
        {
            f8=Double.parseDouble(jtxtBhurji_Pav.getText())*RBhurji_Pav;
        }
        if(jtxtUpma.getText()!=null)
        {
            f9=Double.parseDouble(jtxtUpma.getText())*RUpma;
        }
        if(jtxtShira.getText()!=null)
        {
            f10=Double.parseDouble(jtxtShira.getText())*RShira;
        }
        double i = 0;
        if(jChHDelivery.isSelected())
        {
            i=20;
        }
        else{
            i=0;
        }
        Drinks=d1+d2+d3+d4+d5+d6;
        Meal=f1+f2+f3+f4+f5+f6+f7+f8+f9+f10;
        Delivery=Drinks+Meal+i;

        String D = String.format("Rs. %.2f",Drinks);
        String M = String.format("Rs. %.2f",Meal);
        String Di = String.format("Rs. %.2f",Delivery);
        jlblCostOfDrinks2.setText(D);
        jlblCostOfMeal2.setText(M);
        jlblCostOfDelivery2.setText(Di);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jChCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChCashActionPerformed
if(jChCash.isSelected())
        {

            Cash=1;
        }
        else{
            Cash=0;
        }
        
    }//GEN-LAST:event_jChCashActionPerformed

    private void jChCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jChCashKeyReleased

    }//GEN-LAST:event_jChCashKeyReleased

    private void jChPaytmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChPaytmActionPerformed
        if(jChPaytm.isSelected())
        {
            jBtnCheck.setVisible(true);
            Paytm=1;
        }
        else{
            Paytm=0;
            jBtnCheck.setVisible(false);
        }
    }//GEN-LAST:event_jChPaytmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Name =jtxtName.getText();
            Time = jlblClock.getText();
            if(Cash==1){

                Pay="Cash";
            }
            else if(Paytm==1)
            {
                Pay="Paytm";
            }
            String select="Select * from customer;";
            sm=con.createStatement();
            rs=sm.executeQuery(select);

            String sql="insert into customer values(?,?,?,?,?,?)";
            jLabel2.setText("Data Not saved");
       
            while(rs.next()||loop==2)
            {
                smt1=con.createStatement();
                
                PreparedStatement prest = con.prepareStatement(sql);
                Double d1=0.00,d2=0.00,d3=0.00,d4=0.00,d5=0.00,d6=0.00,f1=0.00,f2=0.00,f3=0.00,f4=0.00,f5=0.00,f6=0.00,f7=0.00,f8=0.00,f9=0.00,f10=0.00,Drinks=0.00,Meal=0.00,Delivery=0.00;
                String ds1="",ds2="",ds3="",ds4="",ds5="",ds6="";
                if(jtxtApple.getText()!=null)
                {
                    ds1=" Apple Juice:"+jtxtApple.getText();
                    d1=Double.parseDouble(jtxtApple.getText())*RApple;
                }
                if(jtxtTea.getText()!=null)
                {
                    ds2=" Tea:"+jtxtTea.getText();
                    d2=Double.parseDouble(jtxtTea.getText())*RTea;
                }
                if(jtxtIce_Tea.getText()!=null)
                {
                    ds3=" Ice Tea:"+jtxtIce_Tea.getText();
                    d3=Double.parseDouble(jtxtIce_Tea.getText())*RIce_Tea;
                }
                if(jtxtCoffee.getText()!=null)
                {
                    ds4=" Coffee:"+jtxtCoffee.getText();
                    d4=Double.parseDouble(jtxtCoffee.getText())*RCoffee;
                }
                if(jtxtSprite.getText()!=null)
                {
                    ds5=" Sprite:"+jtxtSprite.getText();
                    d5=Double.parseDouble(jtxtSprite.getText())*RSprite;
                }
                if(jtxtCoke.getText()!=null)
                {
                    ds6=" Coke:"+jtxtCoke.getText();
                    d6=Double.parseDouble(jtxtCoke.getText())*RCoke;
                }
                String fs1="",fs2="",fs3="",fs4="",fs5="",fs6="",fs7="",fs8="",fs9="",fs10="";
                if(jtxtVada_pav.getText()!=null)
                {
                    fs1="Vada Pav:"+jtxtVada_pav.getText();
                    f1=Double.parseDouble(jtxtVada_pav.getText())*RVada_pav;
                }
                if(jtxtSamosa.getText()!=null)
                {
                    fs2=" Samsosa:"+jtxtSamosa.getText();
                    f2=Double.parseDouble(jtxtSamosa.getText())*RSamosa;
                }
                if(jtxtMendu_Vada.getText()!=null)
                {
                    fs3=" Mendu Vada:"+jtxtMendu_Vada.getText();
                    f3=Double.parseDouble(jtxtMendu_Vada.getText())*RMendu_Vada;
                }
                if(jtxtMasala_Dosa.getText()!=null)
                {
                    fs4=" Masala Dosa:"+jtxtMasala_Dosa.getText();
                    f4=Double.parseDouble(jtxtMasala_Dosa.getText())*RMasala_Dosa;

                }
                if(jtxtRava_Masala_Dosa.getText()!=null)
                {
                    fs5=" Masala Dosa:"+jtxtRava_Masala_Dosa.getText();
                    f5=Double.parseDouble(jtxtRava_Masala_Dosa.getText())*RRava_Masala_Dosa;
                }
                if(jtxtPav_Bhaji.getText()!=null)
                {
                    fs6=" Pav Bhaji:"+jtxtPav_Bhaji.getText();
                    f6=Double.parseDouble(jtxtPav_Bhaji.getText())*RPav_Bhaji;
                }
                if(jtxtCheese_Pav_Bhaji.getText()!=null)
                {
                    fs7=" Cheese Pav Bhaji:"+jtxtCheese_Pav_Bhaji.getText();
                    f7=Double.parseDouble(jtxtCheese_Pav_Bhaji.getText())*RCheese_Pav_Bhaji;

                }
                if(jtxtBhurji_Pav.getText()!=null)
                {
                    fs8=" Bhurji Pav:"+jtxtBhurji_Pav.getText();
                    f8=Double.parseDouble(jtxtBhurji_Pav.getText())*RBhurji_Pav;
                }
                if(jtxtUpma.getText()!=null)
                {
                    fs9=" Upma:"+jtxtUpma.getText();
                    f9=Double.parseDouble(jtxtUpma.getText())*RUpma;
                }
                if(jtxtShira.getText()!=null)
                {
                    fs10=" Shira:"+jtxtShira.getText();
                    f10=Double.parseDouble(jtxtShira.getText())*RShira;
                }
                dr=ds1+ds2+ds3+ds4+ds5+ds6;
                f=fs1+fs2+fs3+fs4+fs5+fs6+fs7+fs8+fs9+fs10;

                double i = 0;
                if(jChHDelivery.isSelected())
                {
                    i=20;
                }
                else{
                    i=0;
                }
                Drinks=d1+d2+d3+d4+d5+d6;
                Meal=f1+f2+f3+f4+f5+f6+f7+f8+f9+f10;
                Delivery=Drinks+Meal+i;

                String D = String.format("Cost Of Drinks: Rs. %.2f",Drinks);
                String M = String.format("Cost Of Meal: Rs. %.2f",Meal);
                String Di = String.format("Cost Of Delivery: Rs. %.2f",Delivery);
                str=D+M+Di;
                prest.setString (1, Name);
                prest.setString (2, Time);
                prest.setString (3, Pay);
                prest.setString (4, dr);
                prest.setString (5, f);
                prest.setString (6, str);
                prest.executeUpdate();
            jLabel2.setText("Saved Successfully");
            }
           
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Get_ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_ReceiptActionPerformed

        Receipt.append("\nRestuarant Management System:\n\n");

        if(Double.parseDouble(jtxtVada_pav.getText())!=0)
        {
            Receipt.append("\nVada Pav:\t\t"+jtxtVada_pav.getText());
        }
        if(Double.parseDouble(jtxtSamosa.getText())!=0)
        {
            Receipt.append("\nSamosa:\t\t"+jtxtSamosa.getText());
        }
        if(Double.parseDouble(jtxtMendu_Vada.getText())!=0)
        {
            Receipt.append("\nMendu Vada:\t\t"+jtxtMendu_Vada.getText());
        }
        if(Double.parseDouble(jtxtRava_Masala_Dosa.getText())!=0)
        {
            Receipt.append("\nRava Masala Dosa:\t"+jtxtRava_Masala_Dosa.getText());
        }
        if(Double.parseDouble(jtxtPav_Bhaji.getText())!=0)
        {
            Receipt.append("\nPav Bhaji:\t\t"+jtxtPav_Bhaji.getText());
        }
        if(Double.parseDouble(jtxtCheese_Pav_Bhaji.getText())!=0)
        {
            Receipt.append("\nCheese Pav Bhaji:\t"+jtxtCheese_Pav_Bhaji.getText());
        }
        if(Double.parseDouble(jtxtBhurji_Pav.getText())!=0)
        {
            Receipt.append("\nBhurji Pav:\t\t"+jtxtBhurji_Pav.getText());
        }
        if(Double.parseDouble(jtxtUpma.getText())!=0)
        {
            Receipt.append("\nUpma:\t\t"+jtxtUpma.getText());
        }
        if(Double.parseDouble(jtxtShira.getText())!=0)
        {
            Receipt.append("\nShira:\t\t"+jtxtShira.getText());
        }

        if(Double.parseDouble(jtxtApple.getText())!=0)
        {
            Receipt.append("\nApple Juice:		"+jtxtApple.getText());
        }
        if(Double.parseDouble(jtxtTea.getText())!=0)
        {
            Receipt.append("\nTea:\t\t"+jtxtTea.getText());
        }
        if(Double.parseDouble(jtxtIce_Tea.getText())!=0)
        {
            Receipt.append("\nIce Tea:\t\t"+jtxtIce_Tea.getText());
        }
        if(Double.parseDouble(jtxtCoffee.getText())!=0)
        {
            Receipt.append("\nCoffee:\t\t"+jtxtCoffee.getText());
        }
        if(Double.parseDouble(jtxtSprite.getText())!=0)
        {
            Receipt.append("\nSprite:\t\t"+jtxtSprite.getText());
        }
        if(Double.parseDouble(jtxtCoke.getText())!=0)
        {
            Receipt.append("\nCoke:\t\t"+jtxtCoke.getText());
        }
         
        if(jChHDelivery.isSelected())
        {
         Receipt.append("\n\nHome Delivery Charges:\t20");  
        }
        Receipt.append("\n\nCost of Drinks:              "+jlblCostOfDrinks2.getText());
        Receipt.append("\nCost Of Meal:                "+jlblCostOfMeal2.getText());
        Receipt.append("\nCost Of Delivery:            "+jlblCostOfDelivery2.getText());
    }//GEN-LAST:event_Get_ReceiptActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="+";
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="-";
    }//GEN-LAST:event_jBtnSubActionPerformed

    private void jBtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMulActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="*";
    }//GEN-LAST:event_jBtnMulActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnAORSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAORSActionPerformed
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnAORSActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackActionPerformed
        String backspace=null;
        if(jtxtDisplay.getText().length() > 0){
            StringBuilder strB = new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length()-1);
            backspace = strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_jBtnBackActionPerformed

    private void jBtnEqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqlActionPerformed
        String answer;
        secondnum=Double.parseDouble(jtxtDisplay.getText());
        if(null != operation)
        switch (operation) {
            case "+":
            result=firstnum + secondnum;
            answer=String.format("%.2f",result);
            jtxtDisplay.setText(answer);
            break;
            case "-":
            result=firstnum - secondnum;
            answer=String.format("%.2f",result);
            jtxtDisplay.setText(answer);
            break;
            case "*":
            result=firstnum * secondnum;
            answer=String.format("%.2f",result);
            jtxtDisplay.setText(answer);
            break;
            case "/":
            result=firstnum / secondnum;
            answer=String.format("%.2f",result);
            jtxtDisplay.setText(answer);
            break;
            case "%":
            result=firstnum % secondnum;
            answer=String.format("%.2f",result);
            jtxtDisplay.setText(answer);
            break;
            default:
            break;
        }
    }//GEN-LAST:event_jBtnEqlActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCActionPerformed
        jtxtDisplay.setText(null);
    }//GEN-LAST:event_jBtnCActionPerformed

    private void jBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDotActionPerformed
        jtxtDisplay.setText(jtxtDisplay.getText()+ jBtnDot.getText());
    }//GEN-LAST:event_jBtnDotActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber=jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed

    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jBtnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCheckActionPerformed
        try{
            Desktop.getDesktop().browse(URI.create("http://www.paytm.com"));
        }
        catch(IOException e){
        System.err.format("Cannot go to paytm.com", e.getMessage());
        }
    }//GEN-LAST:event_jBtnCheckActionPerformed

    private void Get_Receipt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_Receipt1ActionPerformed
    MessageFormat header=new MessageFormat("Receipt");
    MessageFormat footer=new MessageFormat("Receipt");
try{
    Receipt.print(header, footer);
    }
catch(java.awt.print.PrinterException e){
System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_Get_Receipt1ActionPerformed

    private void Get_Receipt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_Receipt2ActionPerformed
Receipt.setText(null);
    }//GEN-LAST:event_Get_Receipt2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   Menu menu=new Menu();
      new Res().setVisible(false);
   menu.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Res.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Res().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Get_Receipt;
    private javax.swing.JToggleButton Get_Receipt1;
    private javax.swing.JToggleButton Get_Receipt2;
    private javax.swing.JTextArea Receipt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnAORS;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnBack;
    private javax.swing.JButton jBtnC;
    private javax.swing.JButton jBtnCheck;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnDot;
    private javax.swing.JButton jBtnEql;
    private javax.swing.JButton jBtnMul;
    private javax.swing.JButton jBtnSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jChCash;
    private javax.swing.JCheckBox jChHDelivery;
    private javax.swing.JCheckBox jChPaytm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel jlblClock;
    private javax.swing.JLabel jlblCostOfDelivery;
    private javax.swing.JLabel jlblCostOfDelivery2;
    private javax.swing.JLabel jlblCostOfDrinks;
    private javax.swing.JLabel jlblCostOfDrinks2;
    private javax.swing.JLabel jlblCostOfMeal;
    private javax.swing.JLabel jlblCostOfMeal2;
    private javax.swing.JLabel jlblName;
    private javax.swing.JTextField jtxtApple;
    private javax.swing.JTextField jtxtBhurji_Pav;
    private javax.swing.JTextField jtxtCheese_Pav_Bhaji;
    private javax.swing.JTextField jtxtCoffee;
    private javax.swing.JTextField jtxtCoke;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtIce_Tea;
    private javax.swing.JTextField jtxtMasala_Dosa;
    private javax.swing.JTextField jtxtMendu_Vada;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPav_Bhaji;
    private javax.swing.JTextField jtxtRava_Masala_Dosa;
    private javax.swing.JTextField jtxtSamosa;
    private javax.swing.JTextField jtxtShira;
    private javax.swing.JTextField jtxtSprite;
    private javax.swing.JTextField jtxtTea;
    private javax.swing.JTextField jtxtUpma;
    private javax.swing.JTextField jtxtVada_pav;
    private javax.swing.JLabel llbl;
    // End of variables declaration//GEN-END:variables
}
