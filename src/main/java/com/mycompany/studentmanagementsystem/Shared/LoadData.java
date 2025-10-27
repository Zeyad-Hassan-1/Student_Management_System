/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.Shared;

import com.mycompany.studentmanagementsystem.frontend.Student;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mega
 */
public class LoadData {

    public static void loadStudentsIntoTable(ArrayList<Student> studentList, DefaultTableModel model) {
        // 1. Clear existing rows
        model.setRowCount(0);

        // 2. Add each student as a row
        for (Student s : studentList) {
            Object[] row = {
                s.getStudentId(),
                s.getFullName(),
                s.getAge(),
                s.getGender(),
                s.getDepartment(),
                s.getGPA()
            };
            model.addRow(row);
        }
    }
}
