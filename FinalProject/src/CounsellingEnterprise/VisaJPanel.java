/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CounsellingEnterprise;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class VisaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VisaJPanel
     */
    public VisaJPanel() {
        initComponents();
        scaleImage1();
          scaleImage2();
          
    }
     public void scaleImage1(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\FinalAEDProject_Github\\Final_AED_Project\\FinalProject\\src\\icon\\logo.jpg");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(iconlbl.getWidth(), iconlbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        iconlbl.setIcon(scaledIcon);}
      public void scaleImage2(){
        ImageIcon icon=new ImageIcon("C:\\Users\\Deepak Sawalka\\Documents\\FinalAEDProject_Github\\Final_AED_Project\\FinalProject\\src\\icon\\visavector.jpg");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(backlbl.getWidth(), backlbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon=new ImageIcon(imgScale);
        backlbl.setIcon(scaledIcon);}
    

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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        iconlbl = new javax.swing.JLabel();
        backlbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visa Details:");
        add(jLabel1);
        jLabel1.setBounds(310, 10, 314, 68);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("2. Sevis Fees Payment:");
        add(jLabel2);
        jLabel2.setBounds(50, 160, 140, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("1. DS-160 Form:");
        add(jLabel3);
        jLabel3.setBounds(50, 120, 110, 40);

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(210, 170, 72, 23);

        jButton2.setText("Fill Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(210, 130, 76, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tips For Visa Interview:");
        add(jLabel4);
        jLabel4.setBounds(50, 240, 210, 50);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("5. Fluency and Self confidence");
        add(jLabel5);
        jLabel5.setBounds(50, 460, 250, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("1. Create a good first impression");
        add(jLabel6);
        jLabel6.setBounds(50, 300, 200, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("2. Practice active listening");
        add(jLabel7);
        jLabel7.setBounds(50, 340, 200, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("3. Ensure that you have all your documents");
        add(jLabel8);
        jLabel8.setBounds(50, 380, 250, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("4. Knowledge about your program");
        add(jLabel9);
        jLabel9.setBounds(50, 420, 250, 50);
        add(iconlbl);
        iconlbl.setBounds(60, 10, 120, 110);
        add(backlbl);
        backlbl.setBounds(300, 60, 650, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://ceac.state.gov/genniv/"));

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://fmjfee.com/i901fee/index.html"));

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel iconlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
