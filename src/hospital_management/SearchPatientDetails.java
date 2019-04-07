/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arunbh
 */
public class SearchPatientDetails extends javax.swing.JFrame {

    /**
     * Creates new form SearchPatientDetails
     */
    public SearchPatientDetails() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("img/icon.png"));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("  SEARCH PATIENT DETAILS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Gender", "Address", "Doctor Assigned", "Room Admitted", "Date Admitted", "Date Dischargedl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEARCH BY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Name");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Patient ID");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(101, 101, 101)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField1)
                .addGap(76, 76, 76)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("BACK ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("CLEAR FIELDS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new HospitalMang().setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextField1.setText(null);
jRadioButton1.setSelected(true);

DefaultTableModel model=(DefaultTableModel) jTable1.getModel();  
int rows=model.getRowCount();
if(rows>0)
{
    for(int i=0;i<rows;i++)
    {
        model.removeRow(0);
    }
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String hg=jTextField1.getText();
         if(hg.equals(""))
         {
             JOptionPane.showMessageDialog(this,"Please Search a valid data value");
         }
         else{
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsprojects", "root", "root");
            Statement stmt = conn.createStatement();
            String str, query, query1, query2, query3;
            ResultSet rs, rs1, rs2, rs3, rs4;
            int eid, i=0 , j=0;
            if (jRadioButton1.isSelected() == true) {
                str = jTextField1.getText();
                query = "Select pid from patient where fname like \"%" + str + "%\";";
                rs = stmt.executeQuery(query);
                int k = 0;
                int empidf[] = new int[1000];
                if (rs.next()) {
                    rs.previous();
                i=0;
                    while (rs.next()) {
                        empidf[k] = rs.getInt(1);
                        k++;
                    }
                    for (int x = 0; x < k; x++) {
                        eid = empidf[x];
                        query = "SELECT pid,CONCAT(fname,\" \", lname),"
                                + "gender,CONCAT(Hno,\" \",Street,\" \", City,\" \",State),doc_id FROM patient WHERE pid=" + eid + ";";
                        rs4 = stmt.executeQuery(query);
                        System.out.println(""+query);
                        if (rs4.next()) {
                            model.addRow(new Object[]{"" + rs4.getInt(1), rs4.getString(2), rs4.getString(3),
                                rs4.getString(4), rs4.getString(5),});
                        }
                        query = "Select arrival_date,discharge_date,rid from in_patient where pid=" + eid + " and "
                                + "discharge_date =(Select max(discharge_date) from in_patient where pid="+eid+");";
                        System.out.println(""+query);
                        rs2 = stmt.executeQuery(query);
                        System.out.println(""+query);
                        if (rs2.next()) {
                            model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 5);
                             model.setValueAt(rs2.getString(2), model.getRowCount() - 1, 6);
                              model.setValueAt(rs2.getString(3), model.getRowCount() - 1, 4);
                        }
                        else
                                {
                                query="Select arrival_date from out_patient where pid="+eid+";";
                                rs2=stmt.executeQuery(query);
                                if (rs2.next()) {
                            model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 5);
                             model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 6);
                              model.setValueAt("NULL", model.getRowCount() - 1, 4);
                        }
                                }
                         rs2.close();
                        
                    }
                } 
                else
                {
                    i=10;
                }
                          if(i==10)
              {
                  i=0;
                  JOptionPane.showMessageDialog(null,"Record Not Found!");
              }
                          rs.close();
            
            } else if (jRadioButton2.isSelected() == true) {
                eid = Integer.parseInt(jTextField1.getText());
                query = "Select pid from patient where pid=" + eid + ";";
                System.out.println(""+query);
                rs = stmt.executeQuery(query);
                if (rs.next()) {
                    i=0;
                    query = "SELECT pid,CONCAT(fname,\" \", lname),"
                                + "gender,CONCAT(Hno,\" \",Street,\" \", City,\" \",State),doc_id FROM patient WHERE pid=" + eid + ";";
                    rs4 = stmt.executeQuery(query);
                   System.out.println(""+query);
                      if (rs4.next()) {
                            model.addRow(new Object[]{"" + rs4.getInt(1), rs4.getString(2), rs4.getString(3),
                                rs4.getString(4), rs4.getString(5),});
                        }
                        rs4.close();
                        query = "Select arrival_date,discharge_date,rid from in_patient where pid=" + eid + " and "
                                + "discharge_date =(Select max(discharge_date) from in_patient where pid="+eid+");";
                        System.out.println(""+query);
                        rs2 = stmt.executeQuery(query);
                        System.out.println(""+query);
                        if (rs2.next()) {
                            model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 5);
                             model.setValueAt(rs2.getString(2), model.getRowCount() - 1, 6);
                              model.setValueAt(rs2.getString(3), model.getRowCount() - 1, 4);
                        }
                        else
                                {
                                query="Select arrival_date from out_patient where pid="+eid+";";
                                System.out.println(""+query);
                                rs2=stmt.executeQuery(query);
                                if (rs2.next()) {
                            model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 5);
                             model.setValueAt(rs2.getString(1), model.getRowCount() - 1, 6);
                              model.setValueAt("NULL", model.getRowCount() - 1, 4);
                        }
                                }
                         rs2.close();
                }
             else
                {
                    i=10;
                }
                          if(i==10)
              {
                  i=0;
                  JOptionPane.showMessageDialog(null,"Record Not Found!");
              }
                           rs.close();
            }
           
            stmt.close();
            conn.close();
jTextField1.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        } 
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jTextField1.setText("");
jRadioButton1.setSelected(true);
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SearchPatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPatientDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPatientDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
