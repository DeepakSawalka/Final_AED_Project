/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ecosystem;
import CounsellingEnterprise.*;
import CoachingEnterprise.*;
import LoanEnterprise.LoanRepresentativeRole;
import VisaEnterprise.AgentRole;
import java.awt.Image;
import javax.swing.ImageIcon;
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
 * @author Deepak
 */
public class EmployeeLogin extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeLogin
     */
    private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int i,q;
    String enterprise,n;
            int deleteItem;
    public EmployeeLogin() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        piclbl = new javax.swing.JLabel();
        adminlbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login to Continue");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Password:");

        usernametxt.setBackground(new java.awt.Color(255, 153, 153));

        passwordtxt.setBackground(new java.awt.Color(255, 153, 153));

        submitbtn.setBackground(new java.awt.Color(255, 102, 102));
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernametxt)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitbtn)
                .addGap(179, 179, 179))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(submitbtn)
                .addGap(44, 44, 44))
        );

        adminlbl.setBackground(new java.awt.Color(255, 102, 0));
        adminlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminlbl.setForeground(new java.awt.Color(255, 102, 51));
        adminlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminlbl.setText("Employee  Login");
        adminlbl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(piclbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(adminlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(piclbl, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:
        String user=usernametxt.getText();
        String password=passwordtxt.getText();

        if(user.equals("counsellor") && password.equals("counsellor123")){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","Rajkumar123#");
            String s= "select * from employeecounsellingcredentials where Username=? and Password=?";
            PreparedStatement ps=conn.prepareStatement(s);
            ps.setString(1, usernametxt.getText());
            ps.setString(2, passwordtxt.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this,"Login Successfull!!");
                dispose();
                new CounsellorRole().setVisible(true);
                
            
            }
            else{
               JOptionPane.showMessageDialog(this,"Please Enter Correct Details.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }}
        // community admin crud operation page
        else if(user.equals("admission") && password.equals("admission123")){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","Rajkumar123#");
            String s= "select * from employeecounsellingcredentials where Username=? and Password=?";
            PreparedStatement ps=conn.prepareStatement(s);
            ps.setString(1, usernametxt.getText());
            ps.setString(2, passwordtxt.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this,"Login Successfull!!");
                dispose();
                new AdmissionRole().setVisible(true);
                
            
            }
            else{
               JOptionPane.showMessageDialog(this,"Please Enter Correct Details.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }}
        else if(user.equals("employee") && password.equals("employee123")){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","Rajkumar123#");
            String s= "select * from employeecoachingcredentials where Username=? and Password=?";
            PreparedStatement ps=conn.prepareStatement(s);
            ps.setString(1, usernametxt.getText());
            ps.setString(2, passwordtxt.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this,"Login Successfull!!");
                dispose();
                new EmployeeRole().setVisible(true);
                
            
            }
            else{
               JOptionPane.showMessageDialog(this,"Please Enter Correct Details.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }}
        
        else if(user.equals("agent") && password.equals("agent123")){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","Rajkumar123#");
            String s= "select * from employeevisacredentials where Username=? and Password=?";
            PreparedStatement ps=conn.prepareStatement(s);
            ps.setString(1, usernametxt.getText());
            ps.setString(2, passwordtxt.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this,"Login Successfull!!");
                dispose();
                new AgentRole().setVisible(true);
                
            
            }
            else{
               JOptionPane.showMessageDialog(this,"Please Enter Correct Details.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }}
        else if(user.equals("loan") && password.equals("loan123")){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject","root","Rajkumar123#");
            String s= "select * from employeeloancredentials where Username=? and Password=?";
            PreparedStatement ps=conn.prepareStatement(s);
            ps.setString(1, usernametxt.getText());
            ps.setString(2, passwordtxt.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next()==true)
            {
                JOptionPane.showMessageDialog(this,"Login Successfull!!");
                dispose();
                new LoanRepresentativeRole().setVisible(true);
                
            
            }
            else{
               JOptionPane.showMessageDialog(this,"Please Enter Correct Details.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }}
        
        else {
            JOptionPane.showMessageDialog(this,"Please Enter all the details.");
        }
       
    }//GEN-LAST:event_submitbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        MainFrame m=new MainFrame();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JLabel piclbl;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
