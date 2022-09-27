/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
import java.time.LocalDate;
import java.util.Date;
/**
 *
 * @author DELL VOSTRO V131
 */
public class Manager2 extends javax.swing.JFrame {

    Connection conn = null;
    private String currentUser;
    PreparedStatement pst = null;
    ResultSet rs = null;
 
    /**
     * Creates new form Manager2
     */
    public Manager2() {
        initComponents();
    }
    
    public Manager2(String currentUser) {
        initComponents();
        this.currentUser = currentUser;
    }
    
    public String getUser() {
        return this.currentUser;
    }
    
    public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
        return java.sql.Date.valueOf(dateToConvert);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Username", "Evaluator ID", "Job ID ", "Grade", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Click to see the evaluations' results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Salary", "Edra", "Position Title", "Announce Date", "Submission Date", "Evaluator ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("View the available jobs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Change the salary of the available jobs:");

        jLabel2.setText("Salary:");

        jButton3.setText("Enter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Job ID:");

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter your report for a job evaluation of an employee: ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel5.setText("Employee User: ");

        jLabel6.setText("Job ID: ");

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(89, 89, 89)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jButton3))
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.setRowCount(0);
        conn = MySqlConnect.ConnectDB();
        String afm = "";
        String mysql1;
        String str = getUser();
        String mysql = "SELECT AFM_firm FROM manager WHERE managerUsername LIKE ?";
        try {
            pst = conn.prepareStatement(mysql);
            pst.setString(1, str);
            rs = pst.executeQuery();
            while(rs.next()) {
                afm = rs.getString("AFM_firm");
            }
                mysql1 = "SELECT * FROM evaluation_result WHERE AFM LIKE ?";
                pst = conn.prepareStatement(mysql1);
                pst.setString(1, afm);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    int s = rs.getInt("IDeval");
                    String ideval = String.valueOf(s);
                    int a = rs.getInt("jobID");
                    String jobid = String.valueOf(a);
                    int b = rs.getInt("grade");
                    String grade = String.valueOf(b);
                    String comments = rs.getString("comments");
                    
                String dbData[] = {username, ideval, jobid, grade, comments};
                tblModel.addRow(dbData);
                
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        tblModel.setRowCount(0);        
        conn = MySqlConnect.ConnectDB();
        Date date1 = convertToDateViaSqlDate(LocalDate.now());
        String str = getUser();
        String mysql2 = "SELECT AFM_firm FROM manager WHERE managerUsername LIKE ?";
        String mysql = "SELECT * FROM job WHERE comp_AFM LIKE ?";
        String c = "";
        try {
            pst = conn.prepareStatement(mysql2);
            pst.setString(1, str);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = rs.getString("AFM_firm");
            }  
            
            pst = conn.prepareStatement(mysql);
            pst.setString(1, c);
            rs = pst.executeQuery();
            while (rs.next()) {
               Date date2 = rs.getDate("submission_date");
               Date date3 = rs.getDate("announce_date");
                if (date1.after(date3) && date1.before(date2)) {                      
                String id = String.valueOf(rs.getInt("jobID"));
                String salary = rs.getString("salary");
                String edra = rs.getString("edra");
                String title = rs.getString("pos_title");
                String adate = rs.getString("announce_date");
                String sdate = rs.getString("submission_date");
                String ideval = rs.getString("IDeval");
                
                String dbData[] = {id, salary, edra, title, adate, sdate, ideval};
                tblModel.addRow(dbData);              
                }               
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        conn = MySqlConnect.ConnectDB();
        Date date2 = null;
        Date date3 = null;
        int k = 0;
        String salary = jTextField1.getText();
        float salar = Float.parseFloat(salary);  
        String jobid = jTextField2.getText();
        int jobd = Integer.parseInt(jobid);
        String str = getUser();
        Date date1 = convertToDateViaSqlDate(LocalDate.now());
        String  mysql = "UPDATE job SET salary = ? WHERE jobID = ?";
        String mysql1 = "SELECT jobID, submission_date, announce_date FROM job WHERE jobID = ?";
        String sql = "INSERT INTO tempuser(username) VALUES(?)";
        try {
            pst = conn.prepareStatement(mysql1);
            pst.setInt(1, jobd);
            rs = pst.executeQuery();
            while (rs.next()) {
                k = rs.getInt("jobID");
                date2 = rs.getDate("submission_date");
                date3 = rs.getDate("announce_date");
            }
                if (k == jobd) {
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, str);
                    int y = pst.executeUpdate();
                    
                    pst = conn.prepareStatement(mysql);
                    pst.setFloat(1, salar);
                    pst.setInt(2, jobd);
                    if (date1.after(date3) && date1.before(date2)) {
                        int i = pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "The salary has changed.");
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jButton2ActionPerformed(evt);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Check the dates of the job, you've entered.");
                    }
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "The id you've entered doens't match with any of the available jobs.");
                }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String str = getUser();
        this.toBack();
        MenuManager mm = new MenuManager(str);
        mm.setVisible(true);
        mm.toFront();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        conn = MySqlConnect.ConnectDB();
        
        int mid = 0;
        String report = jTextArea1.getText();
        String ename = jTextField3.getText();
        String jid = jTextField4.getText();
        int id = Integer.parseInt(jid);
        String str = getUser();
        int ide = 0;
        
        try {
            pst = conn.prepareStatement("SELECT IDeval FROM evaluation_grades WHERE job_ID = ? AND employee_usr LIKE ? AND managerUsername LIKE ?");
            pst.setInt(1, id);
            pst.setString(2, ename);
            pst.setString(3, str);
            rs = pst.executeQuery();
            if (rs.next()) {
                ide = rs.getInt("IDeval");
                pst = conn.prepareStatement("SELECT IDmanager FROM manager WHERE managerUsername LIKE ?");
                pst.setString(1, str);
                rs = pst.executeQuery();
                if (rs.next()) {
                    mid = rs.getInt("IDmanager");
                }
                pst = conn.prepareStatement("UPDATE evaluation_grades SET report_manager = ? WHERE job_ID = ? AND employee_usr LIKE ? AND IDmanager = ?");
                pst.setString(1, report);
                pst.setInt(2, id);
                pst.setString(3, ename);
                pst.setInt(4, mid);
                int i = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your report has been successfully inserted");
                jTextArea1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jButton2ActionPerformed(evt);
                CallableStatement cstmt = conn.prepareCall("{call evaluationComplete(?, ?)}");
                cstmt.setInt(1, id);
                cstmt.setInt(2, ide);
                cstmt.executeUpdate();
            }
            else {
                JOptionPane.showMessageDialog(null, "Check the job ID and/or the employee username, you gave");
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}