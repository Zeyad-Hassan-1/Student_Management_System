/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validitions;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class AgeValidation extends InputVerifier {
    @Override
         public boolean verify(JComponent input) {
        JTextField field = (JTextField) input;
        String text = field.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(input, "Age cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            int age = Integer.parseInt(text);
            if (age < 1 || age > 100) {
                JOptionPane.showMessageDialog(input, "Age must be between 1 and 100!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(input, "Age must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    
}
