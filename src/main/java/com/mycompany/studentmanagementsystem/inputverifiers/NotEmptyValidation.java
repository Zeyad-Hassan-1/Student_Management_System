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
 * @author HP
 */
public class NotEmptyValidation extends InputVerifier{
    private String fieldName;
    public NotEmptyValidation(String fieldName)
    {
        this.fieldName=fieldName;
    }
    @Override
    public boolean verify(JComponent input)
    {
        JTextField field=(JTextField) input;
        if(field.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(input, fieldName+"cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
}
