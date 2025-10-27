/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.inputverifiers;

import com.mycompany.studentmanagementsystem.database.StudentDatabase;
import java.io.FileNotFoundException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hazem
 */
public class IsUniqueIdVerifier extends IsIdVerifier{
    
    private StudentDatabase database;
    
    public IsUniqueIdVerifier(StudentDatabase database)
    {
        this.database = database;
    }
    
    @Override
    public boolean verify(JComponent input)
    {
        if(super.verify(input))
        {
            JTextField field=(JTextField) input;
            try {
                database.readFromFile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(input,e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(database.searchStudent(Integer.parseInt(field.getText()))==null)
            {
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(input,"Id already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
}
