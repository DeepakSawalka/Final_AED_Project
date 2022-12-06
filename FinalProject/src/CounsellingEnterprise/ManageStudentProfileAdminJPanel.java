/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CounsellingEnterprise;
import java.awt.Color;
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
public class ManageStudentProfileAdminJPanel extends javax.swing.JPanel {
private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
     int q,i;
     String branch;
     String enterprise;
     String name,pass;
     byte[] image;
     DefaultTableModel recordTable;
    /**
     * Creates new form ManageStudentProfileAdminJPanel
     */
    public ManageStudentProfileAdminJPanel() {
        initComponents();
    }
public void upDateDb()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from createstudentprofile");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
   
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  
                  columnData.add(rs.getString("ID"));
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Age"));
                  columnData.add(rs.getString("Gender"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("Mobile"));
                  columnData.add(rs.getString("Branch"));
                  columnData.add(rs.getString("Enterprise"));
                  columnData.add(rs.getString("Degree"));
                  columnData.add(rs.getString("Countries"));
                  columnData.add(rs.getString("Image"));
                  columnData.add(rs.getString("Username"));
                  columnData.add(rs.getString("Password"));
                }         
            
             
         }
         
} 
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
    }}

public void upDateDb1()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from managestudentprofilecounsellor");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
   
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  
                  columnData.add(rs.getString("ID"));
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Age"));
                  columnData.add(rs.getString("Gender"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("Mobile"));
                  columnData.add(rs.getString("Branch"));
                  columnData.add(rs.getString("Enterprise"));
                  columnData.add(rs.getString("Degree"));
                  columnData.add(rs.getString("Countries"));
                  columnData.add(rs.getString("Image"));
                  columnData.add(rs.getString("Username"));
                  columnData.add(rs.getString("Password"));
                }         
            
             
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
        managetbl = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();

        managetbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Email", "Mobile", "Branch", "Enterprise", "Degree", "Countries", "Image", "Username", "Password"
            }
        ));
        managetbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managetblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(managetbl);

        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(viewbtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(viewbtn)
                .addContainerGap(241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from createstudentprofile");
            
             rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel)managetbl.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                
                
                String id=String.valueOf(rs.getString("ID"));
                String name=String.valueOf(rs.getString("Name"));
                String age=String.valueOf(rs.getString("Age"));
                String gender=String.valueOf(rs.getString("Gender"));
                String email=String.valueOf(rs.getString("Email"));
                String mobile=String.valueOf(rs.getString("Mobile"));
                String branch=String.valueOf(rs.getString("Branch"));
                String enterprise=String.valueOf(rs.getString("Enterprise"));
                String degree=String.valueOf(rs.getString("Degree"));
                String countries=String.valueOf(rs.getString("Countries"));
                String image =String.valueOf(rs.getBytes("Image"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));
                
                String tbdata[]={id,name,age,gender,email,mobile,branch,enterprise,degree,countries,image,username,password};
                
                model.addRow(tbdata);
            }
           
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_viewbtnActionPerformed

    private void managetblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managetblMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model=(DefaultTableModel)managetbl.getModel();
         int SelectedRows= managetbl.getSelectedRow();
         
        int response=JOptionPane.showConfirmDialog(this, "Payment Status Completed?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          if(response==JOptionPane.YES_OPTION){
             
          
managetbl.setSelectionBackground(Color.green);
       managetbl.setSelectionForeground(Color.black);
        MessageJFrame m=new MessageJFrame();
        m.userlbl.setText(model.getValueAt(SelectedRows, 1).toString() + " your Credentials are:");
        m.usernamelbl.setText(model.getValueAt(SelectedRows, 4).toString());
        m.passwordlbl.setText(model.getValueAt(SelectedRows, 5).toString());
              m.setVisible(true);
        
              
               try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("update createstudentprofile set ID=?,Name=?,Age=?,Gender=?,Email=?,Mobile=?,Branch=?, Enterprise=?,Degree=?,Countries=?,Image=?,Username=?,Password=? where ID=?");
         
       pst.setString(1,model.getValueAt(SelectedRows, 0).toString());
        pst.setString(2,model.getValueAt(SelectedRows, 1).toString());
        pst.setString(3,model.getValueAt(SelectedRows, 2).toString());
        pst.setString(4,model.getValueAt(SelectedRows, 3).toString());
        pst.setString(5,model.getValueAt(SelectedRows, 4).toString());
        pst.setString(6,model.getValueAt(SelectedRows, 5).toString());
        pst.setString(7,model.getValueAt(SelectedRows, 6).toString());
        pst.setString(8,model.getValueAt(SelectedRows, 7).toString());
        pst.setString(9,model.getValueAt(SelectedRows, 8).toString());
        pst.setString(10,model.getValueAt(SelectedRows, 9).toString());
        pst.setString(11,model.getValueAt(SelectedRows, 10).toString());
        pst.setString(12,model.getValueAt(SelectedRows, 4).toString());
        pst.setString(13,model.getValueAt(SelectedRows, 5).toString());
        pst.setString(14,model.getValueAt(SelectedRows, 0).toString());
   
         pst.executeUpdate();
         //JOptionPane.showMessageDialog(this,"Credentials Alloted Successfully");
         upDateDb();}                    
catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
         
    }
               try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from createstudentprofile");
            
             rs=pst.executeQuery();
            
            model.setRowCount(0);
            while(rs.next())
            {
                
                
                String id=String.valueOf(rs.getString("ID"));
                String name=String.valueOf(rs.getString("Name"));
                String age=String.valueOf(rs.getString("Age"));
                String gender=String.valueOf(rs.getString("Gender"));
                String email=String.valueOf(rs.getString("Email"));
                String mobile=String.valueOf(rs.getString("Mobile"));
                String branch=String.valueOf(rs.getString("Branch"));
                String enterprise=String.valueOf(rs.getString("Enterprise"));
                String degree=String.valueOf(rs.getString("Degree"));
                String countries=String.valueOf(rs.getString("Countries"));
                String image=String.valueOf(rs.getBytes("Image"));
                String username=String.valueOf(rs.getString("Username"));
                String password=String.valueOf(rs.getString("Password"));
                
                String tbdata[]={id,name,age,gender,email,mobile,branch,enterprise,degree,countries,image,username,password};
                
                model.addRow(tbdata);
                
            }
           
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
           try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("INSERT INTO managestudentprofilecounsellor(ID,Name,Age,Gender,Email,Mobile,Branch,Enterprise,Degree,Countries,Image,Username,Password)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
         pst.setString(1,model.getValueAt(SelectedRows, 0).toString());
        pst.setString(2,model.getValueAt(SelectedRows, 1).toString());
        pst.setString(3,model.getValueAt(SelectedRows, 2).toString());
        pst.setString(4,model.getValueAt(SelectedRows, 3).toString());
        pst.setString(5,model.getValueAt(SelectedRows, 4).toString());
        pst.setString(6,model.getValueAt(SelectedRows, 5).toString());
        pst.setString(7,model.getValueAt(SelectedRows, 6).toString());
        pst.setString(8,model.getValueAt(SelectedRows, 7).toString());
        pst.setString(9,model.getValueAt(SelectedRows, 8).toString());
        pst.setString(10,model.getValueAt(SelectedRows, 9).toString());
        pst.setString(11,model.getValueAt(SelectedRows, 10).toString());
        pst.setString(12,model.getValueAt(SelectedRows, 11).toString());
        pst.setString(13,model.getValueAt(SelectedRows, 12).toString());
         pst.executeUpdate();
         
         upDateDb1();
         
         
    }                                       
catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
          }
          else {
              JOptionPane.showMessageDialog(this, "Please make your Payment");
          }
          
              
     
          
          
          
    }//GEN-LAST:event_managetblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable managetbl;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
