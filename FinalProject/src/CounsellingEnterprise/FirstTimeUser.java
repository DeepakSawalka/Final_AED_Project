/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CounsellingEnterprise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class FirstTimeUser extends javax.swing.JFrame {

    /**
     * Creates new form FirstTimeUser
     */
    private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
     int q,i;
     String branch;
     String enterprise;
     String timeslot;
     String status;
    public FirstTimeUser() {
        initComponents();
        addVerifiers();
    }
    
   private void addVerifiers(){
     InputVerifier integerVerifier=new IntegerVerifier();
     mobiletxt.setInputVerifier(integerVerifier);
     InputVerifier stringVerifier=new StringVerifier();
     nametxt.setInputVerifier(stringVerifier);
     
     
 }
   
   
   private Boolean checkBlankInput(){
    if(nametxt.getText().length()==0|| emailtxt.getText().length()==0||mobiletxt.getText().length()==0)
    {return false;}
        else{
                return true;
                }
        
    }
public void upDateDb()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("select * from firsttime");
         
         rs=pst.executeQuery();
         ResultSetMetaData stData= rs.getMetaData();
         q=stData.getColumnCount();
         
         
         while (rs.next())
         {
            Vector columnData = new Vector();
            
            
                for(i=1;i<q;i++){
                  columnData.add(rs.getString("UserID"));
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("Mobile"));
                  columnData.add(rs.getString("Branch"));
                  columnData.add(rs.getString("Enterprise"));
                  columnData.add(rs.getString("Date"));
                  columnData.add(rs.getString("TimeSlot"));
                  columnData.add(rs.getString("status"));
                }         
            
            
         }
         
} 
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
    }
    
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        mobilelbl = new javax.swing.JLabel();
        mobiletxt = new javax.swing.JTextField();
        branchlbl = new javax.swing.JLabel();
        branchcbox = new javax.swing.JComboBox<>();
        enterpriselbl = new javax.swing.JLabel();
        enterprisecbox = new javax.swing.JComboBox<>();
        aptdatelbl = new javax.swing.JLabel();
        timeslotlbl = new javax.swing.JLabel();
        timeslotcbox = new javax.swing.JComboBox<>();
        registerbtn = new javax.swing.JButton();
        aptdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        namelbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        namelbl.setText("Name");

        nametxt.setBackground(new java.awt.Color(255, 153, 51));

        emaillbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        emaillbl.setText("Email");

        emailtxt.setBackground(new java.awt.Color(255, 153, 0));

        mobilelbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        mobilelbl.setText("Mobile No.");

        mobiletxt.setBackground(new java.awt.Color(255, 153, 51));
        mobiletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiletxtActionPerformed(evt);
            }
        });

        branchlbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        branchlbl.setText("Branch");

        branchcbox.setBackground(new java.awt.Color(255, 153, 51));
        branchcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Mumbai", "Bangalore" }));
        branchcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchcboxActionPerformed(evt);
            }
        });

        enterpriselbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        enterpriselbl.setText("Enterprise");

        enterprisecbox.setBackground(new java.awt.Color(255, 153, 0));
        enterprisecbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Career Counselling", "Test Preparation", "Visa", "Loan" }));

        aptdatelbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        aptdatelbl.setText("Appointment Date");

        timeslotlbl.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        timeslotlbl.setText("Time Slot");

        timeslotcbox.setBackground(new java.awt.Color(255, 153, 0));
        timeslotcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Time--", " " }));

        registerbtn.setBackground(new java.awt.Color(255, 153, 0));
        registerbtn.setText("Register");
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(branchlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriselbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mobilelbl)
                                .addComponent(emaillbl)
                                .addComponent(namelbl)
                                .addComponent(emailtxt)
                                .addComponent(nametxt)
                                .addComponent(mobiletxt, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                        .addContainerGap(454, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(timeslotcbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterprisecbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)
                            .addComponent(branchcbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(registerbtn)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aptdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeslotlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aptdatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(namelbl)
                .addGap(18, 18, 18)
                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emaillbl)
                .addGap(18, 18, 18)
                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mobilelbl)
                .addGap(18, 18, 18)
                .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(branchlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(branchcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerbtn))
                .addGap(19, 19, 19)
                .addComponent(enterpriselbl)
                .addGap(18, 18, 18)
                .addComponent(enterprisecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(aptdatelbl)
                .addGap(18, 18, 18)
                .addComponent(aptdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeslotlbl)
                .addGap(18, 18, 18)
                .addComponent(timeslotcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobiletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobiletxtActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        // TODO add your handling code here:
            try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("INSERT INTO firsttime(Name,Email,Mobile,Branch,Enterprise,Date,Timeslot,status)values(?,?,?,?,?,?,?,?)");
         
          pst.setString(1,nametxt.getText());
          pst.setString(2,emailtxt.getText());
          pst.setString(3,mobiletxt.getText());
          branch=branchcbox.getSelectedItem().toString();
          pst.setString(4,branch);
          enterprise=enterprisecbox.getSelectedItem().toString();
          pst.setString(5,enterprise);
          SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
        String apt=sdf.format(aptdate.getDate());
        pst.setString(6,apt);
          timeslot=timeslotcbox.getSelectedItem().toString();
          pst.setString(7,timeslot);
          status="Requested an Appointment";
          pst.setString(8,status);
          pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Appointment Booked Successfully");
        upDateDb();
        
    }                                         
catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
        }
     
        nametxt.setText("");
        emailtxt.setText("");
        mobiletxt.setText("");
         branchcbox.setSelectedItem("--Select--");
         enterprisecbox.setSelectedItem("--Select--");
        aptdate.setDate(null);
        timeslotcbox.setSelectedItem("--Select Time--");
         
        
        
    }//GEN-LAST:event_registerbtnActionPerformed

    private void branchcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchcboxActionPerformed
        // TODO add your handling code here:
        try{
        if(branchcbox.getSelectedItem().equals("Mumbai")){
            timeslotcbox.removeAllItems();
            
            timeslotcbox.addItem("11.00 am");
            timeslotcbox.addItem("12.15 pm");
            timeslotcbox.addItem("1.00 pm");
            timeslotcbox.addItem("2.30 pm");
            timeslotcbox.addItem("4.00 pm");
            timeslotcbox.addItem("5.30 pm ");
            timeslotcbox.addItem("6.15 pm");
            timeslotcbox.addItem("7.30 pm ");
            //timeslotcbox.setSelectedItem(null);
        }
       
        else if (branchcbox.getSelectedItem().equals("Bangalore")){
            timeslotcbox.removeAllItems();
           
           timeslotcbox.addItem("11.30 am");
            timeslotcbox.addItem("12.45 pm");
            timeslotcbox.addItem("1.30 pm");
            timeslotcbox.addItem("2.15 pm");
            timeslotcbox.addItem("3.00 pm");
            timeslotcbox.addItem("4.30 pm ");
            timeslotcbox.addItem("5.45 pm");
            timeslotcbox.addItem("7.15 pm ");
            //timeslotcbox.setSelectedItem(null);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_branchcboxActionPerformed

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
    private com.toedter.calendar.JDateChooser aptdate;
    private javax.swing.JLabel aptdatelbl;
    private javax.swing.JComboBox<String> branchcbox;
    private javax.swing.JLabel branchlbl;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JComboBox<String> enterprisecbox;
    private javax.swing.JLabel enterpriselbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobilelbl;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton registerbtn;
    private javax.swing.JComboBox<String> timeslotcbox;
    private javax.swing.JLabel timeslotlbl;
    // End of variables declaration//GEN-END:variables
}
