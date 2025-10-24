/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

import com.formdev.flatlaf.FlatDarkLaf;

/**
 *
 * @author Mega
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
