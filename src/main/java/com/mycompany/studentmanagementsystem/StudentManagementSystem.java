/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.studentmanagementsystem;

import com.mycompany.studentmanagementsystem.nour.MainFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Mega
 */
public class StudentManagementSystem {

    public static void main(String[] args) throws FileNotFoundException {
        FlatDarkLaf.setup();

        new MainFrame().setVisible(true);
    }

    public void saveToFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean deleteStudentById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Student> returnAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
