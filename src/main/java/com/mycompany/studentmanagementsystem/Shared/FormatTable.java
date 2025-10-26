/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.Shared;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Mega
 */
public class FormatTable {

    public static void center(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void customizeSorter(JTable table) {
        // 1. Create a custom sorter
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());

        // 2. Configure it
        sorter.setSortable(0, true);   // ID
        sorter.setSortable(1, true);   // Name
        sorter.setSortable(2, false);  // Age
        sorter.setSortable(3, false);  // Gender
        sorter.setSortable(4, false);  // Department
        sorter.setSortable(5, true);  // GPA
        table.setRowSorter(sorter);
    }
}
