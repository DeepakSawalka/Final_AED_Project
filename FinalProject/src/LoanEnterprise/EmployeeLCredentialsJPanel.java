/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package LoanEnterprise;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janhvi Shah
 */
public class EmployeeLCredentialsJPanel extends javax.swing.JPanel {
private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int i,q;
    String type,n;
            int deleteItem;
    /**
     * Creates new form EmployeeLCredentialsJPanel
     */
    public EmployeeLCredentialsJPanel() {
        initComponents();
    }
public void upDateDb()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from employeeloancredentials");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
         DefaultTableModel recordTable=(DefaultTableModel) credentialstbl.getModel();
         recordTable.setRowCount(0);
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  
                  columnData.add(rs.getString("EmployeeType"));
                  columnData.add(rs.getString("Username"));
                  columnData.add(rs.getString("Password"));
                }         
            
             recordTable.addRow(columnData);
         }
         
} 
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
    }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        credentialstbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        createbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        modifybtn = new javax.swing.JButton();
        typetxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        credentialstbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EmployeeType", "Username", "Password"
            }
        ));
        credentialstbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                credentialstblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(credentialstbl);

        jLabel1.setText("Type");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        modifybtn.setText("Modify");
        modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createbtn)
                    .addComponent(usernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(passwordtxt)
                    .addComponent(typetxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(modifybtn)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(viewbtn)
                        .addGap(496, 496, 496))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(modifybtn)))
                .addGap(39, 39, 39)
                .addComponent(viewbtn)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(typetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(createbtn)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void credentialstblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_credentialstblMouseClicked
        // TODO add your handling code here:
        DefaultTableModel recordTable = (DefaultTableModel) credentialstbl.getModel();
        int SelectedRows= credentialstbl.getSelectedRow();

        typetxt.setText(recordTable.getValueAt(SelectedRows, 1).toString());
        usernametxt.setText(recordTable.getValueAt(SelectedRows, 1).toString());
        passwordtxt.setText(recordTable.getValueAt(SelectedRows, 2).toString());
    }//GEN-LAST:event_credentialstblMouseClicked

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataconn,username,password);
            pst=sqlConn.prepareStatement("INSERT INTO employeeloancredentials(EmployeeType,Username,Password)values(?,?,?)");
            pst.setString(1,typetxt.getText());
            pst.setString(2,usernametxt.getText());
            pst.setString(3,passwordtxt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Credentials Added Successfully");
            upDateDb();
            typetxt.setText("");
            usernametxt.setText("");
            passwordtxt.setText("");
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataconn,username,password);
            pst=sqlConn.prepareStatement("select * from employeeloancredentials");

            rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)credentialstbl.getModel();
            model.setRowCount(0);
            while(rs.next())
            {

                String employeetype=String.valueOf(rs.getString("EmployeeType"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));

                String tbdata[]={employeetype,username,password};

                model.addRow(tbdata);
            }

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_createbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataconn,username,password);
            pst=sqlConn.prepareStatement("select * from employeeloancredentials");

            rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)credentialstbl.getModel();
            model.setRowCount(0);
            while(rs.next())
            {

                String employeetype=String.valueOf(rs.getString("EmployeeType"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));

                String tbdata[]={employeetype,username,password};

                model.addRow(tbdata);
            }

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void modifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybtnActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataconn,username,password);
            pst=sqlConn.prepareStatement("update employeeloancredentials set EmployeeType=?,Username=?,Password=? where Password=?");

            pst.setString(1,typetxt.getText());
            pst.setString(2,usernametxt.getText());
            pst.setString(3,passwordtxt.getText());
            pst.setString(4,passwordtxt.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Credentials Updated Successfully");
            upDateDb();
            typetxt.setText("");
            usernametxt.setText("");
            passwordtxt.setText("");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataconn,username,password);
            pst=sqlConn.prepareStatement("select * from employeeloancredentials");

            rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)credentialstbl.getModel();
            model.setRowCount(0);
            while(rs.next())
            {

                String employeetype=String.valueOf(rs.getString("EmployeeType"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));

                String tbdata[]={employeetype,username,password};

                model.addRow(tbdata);
            }

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_modifybtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createbtn;
    private javax.swing.JTable credentialstbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifybtn;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField typetxt;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
