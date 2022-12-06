/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CounsellingEnterprise;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Deepak
 */
public class CreateStudentProfile extends javax.swing.JFrame {
private static final String username="root"; 
    private static final String password="Rajkumar123#";
    private static final String dataconn="jdbc:mysql://localhost:3306/finalproject";
    
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int i,q;
    String employeetype,n;
    String filename=null;
    private byte[] person_image;
    String gender,enterprise,branch,degree,countries;
            String name,userpassword;
            
            
    /**
     * Creates new form CreateStudentProfile
     */
    public CreateStudentProfile() {
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
                  
                  
                  columnData.add(rs.getString("Name"));
                  columnData.add(rs.getString("Age"));
                  columnData.add(rs.getString("Gender"));
                  columnData.add(rs.getString("Email"));
                  columnData.add(rs.getString("Mobile"));
                  columnData.add(rs.getString("Branch"));
                  columnData.add(rs.getString("Enterprise"));
                  columnData.add(rs.getString("Degree"));
                  columnData.add(rs.getString("Countries"));
                  columnData.add(rs.getBlob("Image"));
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

        genderbtn = new javax.swing.ButtonGroup();
        studybtn = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        malerad = new javax.swing.JRadioButton();
        femalerad = new javax.swing.JRadioButton();
        otherrad = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobiletxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        branchcbox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        enterprisecbox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bachelorsbtn = new javax.swing.JCheckBox();
        mastersbtn = new javax.swing.JCheckBox();
        phdbtn = new javax.swing.JCheckBox();
        mbabtn = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        uk = new javax.swing.JCheckBox();
        usa = new javax.swing.JCheckBox();
        canada = new javax.swing.JCheckBox();
        germany = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        imglbl = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        uploadbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(615, 700));

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        genderbtn.add(malerad);
        malerad.setText("Male");

        genderbtn.add(femalerad);
        femalerad.setText("Female");

        genderbtn.add(otherrad);
        otherrad.setText("Other");

        jLabel4.setText("Email");

        jLabel5.setText("Mobile No.");

        jLabel6.setText("Branch");

        branchcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Mumbai", "Bangalore" }));

        jLabel7.setText("Enterprise");

        enterprisecbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Career Counselling", "Test Preparation", "Visa", "Loan" }));

        jLabel8.setText("Degree");

        studybtn.add(bachelorsbtn);
        bachelorsbtn.setText("Bachelors");

        studybtn.add(mastersbtn);
        mastersbtn.setText("Masters");

        studybtn.add(phdbtn);
        phdbtn.setText("Phd");

        mbabtn.setText("MBA");

        jLabel9.setText("Countries");

        uk.setText("UK");

        usa.setText("USA");

        canada.setText("Canada");

        studybtn.add(germany);
        germany.setText("Germany");

        jLabel10.setText("Image");

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        uploadbtn.setText("Upload");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nametxt)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(agetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(malerad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(femalerad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otherrad))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(branchcbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 165, Short.MAX_VALUE)
                                .addComponent(mobiletxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailtxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterprisecbox, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bachelorsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phdbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(canada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mbabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mastersbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(germany, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(savebtn)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(uploadbtn)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterprisecbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bachelorsbtn)
                                    .addComponent(mastersbtn))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phdbtn)
                                    .addComponent(mbabtn))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(malerad)
                                    .addComponent(femalerad)
                                    .addComponent(otherrad))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(usa)))
                    .addComponent(canada))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(germany)
                            .addComponent(uk))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(branchcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(uploadbtn)
                .addGap(34, 34, 34)
                .addComponent(savebtn)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        
          try
    {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn=DriverManager.getConnection(dataconn,username,password);
         pst=sqlConn.prepareStatement("INSERT INTO createstudentprofile(Name,Age,Gender,Email,Mobile,Branch,Enterprise,Degree,Countries,Image,Username,Password)values(?,?,?,?,?,?,?,?,?,?,?,?)");
         
          pst.setString(1,nametxt.getText());
          pst.setString(2,agetxt.getText());
             if(malerad.isSelected())
         {
             gender="Male";
         }
         if(femalerad.isSelected())
         {
             gender="Female";
         }
         if(otherrad.isSelected())
         {
             gender="Others";
         }
         pst.setString(3, gender);
         pst.setString(4,emailtxt.getText());
          pst.setString(5,mobiletxt.getText());
          branch=branchcbox.getSelectedItem().toString();
          pst.setString(6,branch);
          enterprise=enterprisecbox.getSelectedItem().toString();
          pst.setString(7,enterprise);
         if(bachelorsbtn.isSelected()){
            degree=bachelorsbtn.getText()+"";
         }
 if(mastersbtn.isSelected()){
            degree=mastersbtn.getText()+"";}
            if(phdbtn.isSelected()){
            degree=phdbtn.getText()+"";}
            if(mbabtn.isSelected()){
            degree=mbabtn.getText()+"";}
        
  
    pst.setString(8,degree);
    
    if(usa.isSelected()){
            countries=usa.getText()+"";
         }
 if(canada.isSelected()){
            countries=canada.getText()+"";
         }
  if(uk.isSelected()){
            countries=uk.getText()+"";
         }
   if(germany.isSelected()){
            countries=germany.getText()+"";
         }
   if(usa.isSelected() && canada.isSelected()){
            countries=((usa.getText())+","+(canada.getText())) ;
         }
   if(usa.isSelected() && uk.isSelected()){
            countries=((usa.getText())+","+(uk.getText())) ;
         }
   if(usa.isSelected() && germany.isSelected()){
            countries=((usa.getText())+","+(germany.getText())) ;
         }
   if(canada.isSelected() && uk.isSelected()){
            countries=((canada.getText())+","+(uk.getText())) ;
         }
   if(canada.isSelected() && germany.isSelected()){
            countries=((canada.getText())+","+(germany.getText())) ;
         }
   if(uk.isSelected() && germany.isSelected()){
            countries=((uk.getText())+","+(germany.getText())) ;
         }
   if(usa.isSelected() && canada.isSelected() && uk.isSelected()){
            countries=((usa.getText())+","+(canada.getText())+","+(uk.getText())) ;
         }
    if(usa.isSelected() && canada.isSelected() && germany.isSelected()){
            countries=((usa.getText())+","+(canada.getText())+","+(germany.getText())) ;
         }
     if(usa.isSelected() && uk.isSelected() && germany.isSelected()){
            countries=((usa.getText())+","+(uk.getText())+","+(germany.getText())) ;
         }
     if(usa.isSelected() && uk.isSelected() && germany.isSelected() && canada.isSelected() ){
            countries=((usa.getText())+","+(canada.getText())+","+(uk.getText())+","+(germany.getText())) ;
         }
     pst.setString(9,countries);
   pst.setBytes(10, person_image);
    name="Pending";
       pst.setString(11,name);
       userpassword="Pending";
       pst.setString(12,userpassword);
          pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Student Profile Created Successfully");
        upDateDb();
        
    }                                         
catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    
        }
        
        
        
        dispose();
        CounsellorRole cs=new CounsellorRole();
        cs.setVisible(true);
    }//GEN-LAST:event_savebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(imglbl.getWidth(), imglbl.getHeight(), Image.SCALE_SMOOTH) );
        imglbl.setIcon(imageicon);
        try{
            File image =new File(filename);
            FileInputStream fis =new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for (int readNum;( readNum=fis.read(buf))!=-1;){
        bos.write(buf, 0, readNum);
        }
            person_image=bos.toByteArray();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
      
        /*JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter fnwf=new  FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        chooser.addChoosableFileFilter(fnwf);
        int load=chooser.showOpenDialog(null);
        if(load==chooser.APPROVE_OPTION){
            f=chooser.getSelectedFile();
            path=f.getAbsolutePath();
              ImageIcon imageicon=new ImageIcon(path);
              Image img=imageicon.getImage().getScaledInstance(imglbl.getWidth(), imglbl.getHeight(), Image.SCALE_SMOOTH);
        imglbl.setIcon(new ImageIcon(img));
        
        }*/
      
    }//GEN-LAST:event_uploadbtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField agetxt;
    private javax.swing.JCheckBox bachelorsbtn;
    public javax.swing.JComboBox<String> branchcbox;
    private javax.swing.JCheckBox canada;
    public javax.swing.JTextField emailtxt;
    public javax.swing.JComboBox<String> enterprisecbox;
    private javax.swing.JRadioButton femalerad;
    private javax.swing.ButtonGroup genderbtn;
    private javax.swing.JCheckBox germany;
    private javax.swing.JLabel imglbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton malerad;
    private javax.swing.JCheckBox mastersbtn;
    private javax.swing.JCheckBox mbabtn;
    public javax.swing.JTextField mobiletxt;
    public javax.swing.JTextField nametxt;
    private javax.swing.JRadioButton otherrad;
    private javax.swing.JCheckBox phdbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.ButtonGroup studybtn;
    private javax.swing.JCheckBox uk;
    private javax.swing.JButton uploadbtn;
    private javax.swing.JCheckBox usa;
    // End of variables declaration//GEN-END:variables
}
