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
public class IsIdVerifier extends InputVerifier{
    @Override
    public boolean verify(JComponent input)
    {
        JTextField field=(JTextField) input;
        if(Validation.isEmpty(field.getText()))
        {
            JOptionPane.showMessageDialog(input,"Id cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(Validation.isPositiveInt(field.getText()))
        {
            JOptionPane.showMessageDialog(input,"Invalid Id format!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
