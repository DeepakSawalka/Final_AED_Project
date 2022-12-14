/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CounsellingEnterprise;


import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class IntegerVerifier extends InputVerifier {
   
/**
 *
 * @author vatsal
 */

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                input.setBackground(Color.white);
                if(i<=0)
                {
                    input.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(input, "Please enter positive"
                            + " integer value", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.RED);
                JOptionPane.showMessageDialog(input, "Please enter integer"
                        + " value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
 

