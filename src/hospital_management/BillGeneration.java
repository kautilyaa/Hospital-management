/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.awt.Toolkit;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arunbh
 */
public class BillGeneration extends javax.swing.JFrame {

    /**
     * Creates new form BillGeneration
     */
    public BillGeneration() {
        setLayout(null);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("img/icon.png"));
        setSize(1150,680);
        setLocation(80,10);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("BILL GENERATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(386, 11, 168, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter Patient ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 58, 100, 15);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(198, 46, 183, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setText("Name");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender");

        jLabel5.setText("Address");

        jTextField3.setEditable(false);

        jLabel6.setText("Disease Treated");

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField18))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 82, 393, 214);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicines Given", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo.", "Medicine Name", "Quantity", "Cost", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total Medicines Cost");

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Rs.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(167, 167, 167)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 312, 597, 234);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("ROOM BILL");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(820, 380, 69, 15);

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField15);
        jTextField15.setBounds(952, 373, 158, 23);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("Rs.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(897, 376, 21, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("Other Charges");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(800, 430, 88, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Rs.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(897, 426, 21, 17);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField16);
        jTextField16.setBounds(952, 423, 158, 23);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("Total Payable Amount");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(733, 483, 152, 17);

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField17);
        jTextField17.setBounds(952, 480, 158, 23);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setText("Rs.");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(903, 483, 21, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("GENERATE BILL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(514, 581, 175, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("CLEAR FIELDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(949, 581, 161, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1029, 0, 81, 31);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo.", "Test Name", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(658, 82, 452, 224);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 102));
        jLabel23.setText("Total Tests Cost");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(790, 310, 99, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(950, 312, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Rs.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(900, 310, 40, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/Medical_Bill_.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1160, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new HospitalMang().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        model=(DefaultTableModel)jTable2.getModel();
          rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField14.setText(null);
        jTextField15.setText(null);
        jTextField16.setText(null);
        jTextField17.setText(null);
        jTextField18.setText(null);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost
    int testid[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int medid[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int medqty[] = new int[1000];
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        char ch = evt.getKeyChar();
        String sd = jTextField1.getText();
        if (ch == '\n' && !sd.equals("")) {
            int p = Integer.parseInt(jTextField1.getText());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
            try {
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsprojects", "root", "root");
                Statement stmt = conn.createStatement();
                String query, query1, a, b;
                query = "Select CONCAT(fname,\" \", lname),gender,CONCAT(HNo,\" \", Street, \" \",City, \" \",State) from patient where pid=" + p + ";";
                ResultSet rs = stmt.executeQuery(query);
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "Please,Enter a valid Patient ID");
                }
                jTextField2.setText("" + rs.getString(1));
                jTextField3.setText("" + rs.getString(2));
                jTextField18.setText("" + rs.getString(3));
                query = "Select pid from in_patient where pid=" + p + " and discharge_date is null;";
                ResultSet rs2 = stmt.executeQuery(query);
                System.out.println("" + query);
                if (!rs2.next()) {
                    query = "insert into out_patient values(" + p + ",CURRENT_TIMESTAMP,null);";
                    System.out.println("" + query);
                    stmt.executeUpdate(query);
                    System.out.println("" + query);
                    query = "Select tid from hadtest where pid=" + p + " and DATE(testdate)=CURRENT_DATE;";
                    System.out.println("" + query);
                    ResultSet rs1 = stmt.executeQuery(query);
                    Arrays.fill(testid, 0);
                    while (rs1.next()) {
                        int i = rs1.getInt(1);
                        testid[i - 1] = 1;
                    }
                    System.out.println("" + query);
                    int sno = 1;
                    float tf = 0;
                    for (int x = 0; x < 10; x++) {
                        System.out.println("" + x);
                        if (testid[x] == 1) {
                            System.out.println("" + testid[x]);
                            query = "Select tname ,tcost from test where tid=" + (x + 1) + ";";
                            System.out.println("" + query);
                            ResultSet rs3 = stmt.executeQuery(query);
                            if (rs3.next()) {
                                model1.addRow(new Object[]{sno, rs3.getString(1), rs3.getFloat(2)});
                                tf += rs3.getFloat(2);
                                sno++;
                            }
                        }
                    }
                    System.out.println("" + tf);
                    jTextField5.setText("" + tf);
                    jTextField15.setText("0");
                    jTextField16.setText("200");
                    query = "Select mid,qty from had_medicine where pid=" + p + " and DATE(med_date)=CURRENT_DATE;";
                    System.out.println("" + query);
                    rs1 = stmt.executeQuery(query);
                    System.out.println("" + query);
                     Arrays.fill(medid, 0);                      
                    while (rs1.next()) {
                        int i = rs1.getInt(1);
                        medid[i - 1] = 1;
                        medqty[i - 1] = rs1.getInt(2);
                    }
                    sno = 1;
                    float fl = 0;
                    for (int x = 0; x < 50; x++) {
                        if (medid[x] == 1) {
                            query = "Select mname ,mcost from medicine where mid=" + (x + 1) + ";";
                              System.out.println("" + query);
                            ResultSet rs3 = stmt.executeQuery(query);
                            System.out.println("" + query);
                            if (rs3.next()) {
                                model.addRow(new Object[]{ sno, rs3.getString(1), medqty[x],rs3.getFloat(2), (medqty[x]) * (rs3.getFloat(2))});
                                fl += (medqty[x]) * (rs3.getFloat(2));
                                sno++;
                            }
                        }
                    }
                    jTextField14.setText("" + fl);
                    float hg = tf + fl + 200;
                    jTextField17.setText("" + hg);
                    rs1.close();
                    rs.close();
                } else {
                    int roomcosttot=0;
                    query = "Select disease,rid, Date(arrival_date) from in_patient where pid=" + p + " and discharge_date is null;";
                    ResultSet rs1 = stmt.executeQuery(query);
                    String gfd = "";
                    int dsd = 0, dfg = 0;
                    if (rs1.next()) {
                        query = "Select  DATEDIFF(CURRENT_DATE," + "" + rs1.getString(3) + "\";";
                        dsd = rs1.getInt(2);
                        gfd = rs1.getString(1);
                    }
                    ResultSet rs10 = stmt.executeQuery(query);
                    if (rs10.next()) {
                        dfg = rs10.getInt(1);
                        query = "Select rtype from room where rid=" + dsd + ";";
                    }
                    ResultSet rs8 = stmt.executeQuery(query);
                    if (rs8.next()) {
                        query = "Select rcost from room_cost where roomtype=\"" + rs8.getString(1) + "\";";
                        rs8 = stmt.executeQuery(query);
                    }
                    if (rs8.next()) {
                        roomcosttot = dfg * rs8.getInt(1);
                        jTextField15.setText("" + roomcosttot);
                        jTextField4.setText("" + gfd);
                    }
                    rs1.close();
                    query = "Select tid from hadtest,in_patient where pid=" + p + " and dicharge_date is null;";
                    rs1 = stmt.executeQuery(query);
                    Arrays.fill(testid, 0);
                    while (rs1.next()) {
                        int i = rs1.getInt(1);
                        testid[i - 1] = 1;
                    }
                    int sno = 1;
                    float tf = 0;
                    jTextField16.setText("1000");
                    for (int x = 0; x < 10; x++) {
                        if (testid[x] == 1) {
                            query = "Select tname ,tcost from test where tid=" + (x + 1) + ";";
                            ResultSet rs3 = stmt.executeQuery(query);
                            if (rs3.next()) {
                                model1.addRow(new Object[]{"" + sno, rs3.getString(1), "" + rs3.getFloat(2)});
                                tf += rs3.getFloat(2);
                                sno++;
                            }
                        }
                    }
                    jTextField5.setText("" + tf);
                    query = "Select mid,qty from had_medicine,in_patient where pid=" + p + " and dicharge_date is null;";
                    rs1 = stmt.executeQuery(query);
                    sno = 1;
                    float fl = 0;
                    Arrays.fill(medid, 0);
                    Arrays.fill(medqty, 0);
                    while (rs1.next()) {
                        int i = rs1.getInt(1);
                        medid[i - 1] = 1;
                        medqty[i - 1] = rs1.getInt(2);

                    }
                    for (int x = 0; x < 50; x++) {
                        if (medid[x] == 1) {
                            query = "Select mname ,mcost from medicine where mid=" + (x + 1) + ";";
                            ResultSet rs3 = stmt.executeQuery(query);
                            if (rs3.next()) {
                                model.addRow(new Object[]{"" + sno, rs3.getString(1), "" + medqty[x], "" + rs3.getFloat(2), "" + (medqty[x]) * (rs3.getFloat(2))});
                                fl += (medqty[x]) * (rs3.getFloat(2));
                            }
                            sno++;
                        }
                    }
                    jTextField14.setText("" + fl);
                float hg = fl + tf + 1000 + roomcosttot;
                jTextField17.setText("" + hg);
             
                }
                
                     
            }
        
        catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in connectivity");
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str = jTextField4.getText();
        if(str.equals("")){
                JOptionPane.showMessageDialog(this, "Please,Enter the disease treated");
        }
        else{
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsprojects", "root", "root");
            Statement stmt = conn.createStatement();
            String query, a, b;
            int p = Integer.parseInt(jTextField1.getText());
            ResultSet rs;
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd.hh:mm:ss");
            Date da = new Date();
            a = df.format(da);
            String query1;
             str = jTextField4.getText();
            query1 = "update out_patient SET disease=\"" + str + "\" where pid=" + p + " and Date(arrival_date)=CURRENT_DATE;";
            System.out.println(query1);
            stmt.executeUpdate(query1);
            query="Select pid from in_patient where pid="+p+" and discharge_date is null;";
              System.out.println(query);
             rs=stmt.executeQuery(query);
             if(rs.next()){
            query1 = "update in_patient set discharge_date=\"" + a + "\" where pid=" + p + " and discharge_date is null;";
             System.out.println(""+query1);
            stmt.executeUpdate(query1);
             }
            float mcost, tcost, rchg, other;
            mcost = Float.parseFloat(jTextField14.getText());
            tcost = Float.parseFloat(jTextField5.getText());
            rchg = Float.parseFloat(jTextField15.getText());
            other = Float.parseFloat(jTextField16.getText());
            query1 = "insert into bill values(" + p + "," + mcost + "," + tcost + "," + rchg + "," + other + ",\"" + a + "\");";
            System.out.println(""+query1);
            stmt.executeUpdate(query1);
            JOptionPane.showMessageDialog(null,"Give the receipt");
            jButton2.doClick();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bill already generated");
        }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(BillGeneration.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGeneration.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGeneration.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGeneration.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGeneration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
