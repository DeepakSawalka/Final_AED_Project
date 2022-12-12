/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CounsellingEnterprise;
import Ecosystem.AdminLogin;
import Ecosystem.EmployeeLogin;
import Ecosystem.EnterpriseAdminLogin;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Deepak
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setTitle("Overseas Educational Consultant System");
        this.setSize(1300,500 );
        
      scaleImage();
      scaleImage1();
      scaleImage2();
      scaleImage3();
    }
    public void scaleImage(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\NetBeansProjects\\FinalProject\\src\\icon\\chatbot.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(chatbotbtn.getWidth(), chatbotbtn.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        chatbotbtn.setIcon(scaledIcon);
        
    }
   public void scaleImage1(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\Final_AED_Project\\FinalProject\\src\\icon\\emailicon.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(emailicon.getWidth(), emailicon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        emailicon.setIcon(scaledIcon);
        
    }
   public void scaleImage2(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\FinalAEDProject_Github\\Final_AED_Project\\FinalProject\\src\\icon\\fulllogo.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(logolbl.getWidth(), logolbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        logolbl.setIcon(scaledIcon);
        
    }
    public void scaleImage3(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\FinalAEDProject_Github\\Final_AED_Project\\FinalProject\\src\\icon\\banner.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(bannerlbl.getWidth(), bannerlbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        bannerlbl.setIcon(scaledIcon);
        
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
        videolbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        contactusbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        adminbtn = new javax.swing.JButton();
        studentbtn = new javax.swing.JButton();
        enterprisebtn = new javax.swing.JButton();
        employeebtn = new javax.swing.JButton();
        logolbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emailicon = new javax.swing.JLabel();
        chatbotbtn = new javax.swing.JButton();
        vlbl = new javax.swing.JLabel();
        bannerlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        videolbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\NetBeansProjects\\FinalProject\\src\\icon\\20.11_compressed.gif")); // NOI18N
        videolbl.setPreferredSize(new java.awt.Dimension(1200, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        contactusbtn.setBackground(new java.awt.Color(255, 153, 51));
        contactusbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        contactusbtn.setText("Contact Us");
        contactusbtn.setBorder(null);
        contactusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("G+");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        adminbtn.setBackground(new java.awt.Color(255, 153, 51));
        adminbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        adminbtn.setText("Admin");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });

        studentbtn.setBackground(new java.awt.Color(255, 153, 51));
        studentbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        studentbtn.setText("Student");
        studentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbtnActionPerformed(evt);
            }
        });

        enterprisebtn.setBackground(new java.awt.Color(255, 153, 51));
        enterprisebtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        enterprisebtn.setText("Enterprise");
        enterprisebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisebtnActionPerformed(evt);
            }
        });

        employeebtn.setBackground(new java.awt.Color(255, 153, 51));
        employeebtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        employeebtn.setText("Employee");
        employeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeebtnActionPerformed(evt);
            }
        });

        logolbl.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(enterprisebtn)
                .addGap(18, 18, 18)
                .addComponent(adminbtn)
                .addGap(18, 18, 18)
                .addComponent(employeebtn)
                .addGap(18, 18, 18)
                .addComponent(studentbtn)
                .addGap(18, 18, 18)
                .addComponent(contactusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(studentbtn)
                    .addComponent(employeebtn)
                    .addComponent(adminbtn)
                    .addComponent(enterprisebtn))
                .addGap(27, 27, 27))
            .addComponent(logolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("info@imperial-overseas.com");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(emailicon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1015, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        chatbotbtn.setBackground(new java.awt.Color(255, 153, 51));
        chatbotbtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        chatbotbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chatbot.png"))); // NOI18N
        chatbotbtn.setToolTipText("Hey!! Do u need any help?");
        chatbotbtn.setOpaque(true);
        chatbotbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatbotbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1191, 1191, 1191)
                        .addComponent(vlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bannerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chatbotbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1812, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(videolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bannerlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(chatbotbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addComponent(vlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1316, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        ContactUs c =new ContactUs();
        c.setVisible(true);

    }//GEN-LAST:event_contactusbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://www.imperial-overseas.com/about.php"));

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_jLabel1MouseClicked

    private void chatbotbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatbotbtnActionPerformed
        // TODO add your handling code here:
        ChatBot chat=new ChatBot();
        chat.setVisible(true);
    }//GEN-LAST:event_chatbotbtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox"));

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);}
                                        

    }//GEN-LAST:event_jLabel3MouseClicked

    private void enterprisebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisebtnActionPerformed
        // TODO add your handling code here:
        dispose();
            EnterpriseAdminLogin l =new EnterpriseAdminLogin();
            l.setVisible(true);
    }//GEN-LAST:event_enterprisebtnActionPerformed

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        // TODO add your handling code here:
        dispose();
            AdminLogin l =new AdminLogin();
            l.setVisible(true);
            l.backbtn.setOpaque(false);
        l.backbtn.setContentAreaFilled(false);
        l.backbtn.setBorderPainted(false);
    }//GEN-LAST:event_adminbtnActionPerformed

    private void employeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeebtnActionPerformed
        // TODO add your handling code here:
        dispose();
            EmployeeLogin e =new EmployeeLogin();
            e.setVisible(true);
    }//GEN-LAST:event_employeebtnActionPerformed

    private void studentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbtnActionPerformed
        // TODO add your handling code here:
             dispose();
            StudentLogin l =new StudentLogin();
            l.setVisible(true);
    }//GEN-LAST:event_studentbtnActionPerformed


    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JLabel bannerlbl;
    private javax.swing.JButton chatbotbtn;
    private javax.swing.JButton contactusbtn;
    private javax.swing.JLabel emailicon;
    private javax.swing.JButton employeebtn;
    private javax.swing.JButton enterprisebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logolbl;
    private javax.swing.JButton studentbtn;
    private javax.swing.JLabel videolbl;
    private javax.swing.JLabel vlbl;
    // End of variables declaration//GEN-END:variables
}
