/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mega
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainFrame().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
