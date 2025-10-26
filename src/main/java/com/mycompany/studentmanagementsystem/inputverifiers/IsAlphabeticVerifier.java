/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.inputverifiers;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hazem
 */
public class IsAlphabeticVerifier extends InputVerifier{
    private String fieldName;
    public IsAlphabeticVerifier(String fieldName)
    {
        this.fieldName=fieldName;
    }
    @Override
    public boolean verify(JComponent input)
    {
        JTextField field=(JTextField) input;
        int validationResult = Validation.isAlphabetic(field.getText());
        if(validationResult==-1)
        {
            JOptionPane.showMessageDialog(input, fieldName+"cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(validationResult == 0)
        {
            JOptionPane.showMessageDialog(input, fieldName+"MUST be alphabetical only", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
