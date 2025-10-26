/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.studentmanagementsystem;

import com.mycompany.studentmanagementsystem.nour.MainFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.FileNotFoundException;

/**
 *
 * @author Mega
 */
public class StudentManagementSystem {

    public static void main(String[] args) throws FileNotFoundException {
        FlatDarkLaf.setup();

        new MainFrame().setVisible(true);
    }
}
