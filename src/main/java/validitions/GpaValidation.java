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
public class GpaValidation extends InputVerifier {
     @Override
    public boolean verify(JComponent input) {
        JTextField field = (JTextField) input;
        String text = field.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(input, "GPA cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            double gpa = Double.parseDouble(text);
            if (gpa < 0.0 || gpa > 4.0) {
                JOptionPane.showMessageDialog(input, "GPA must be between 0.0 and 4.0!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(input, "GPA must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
}
