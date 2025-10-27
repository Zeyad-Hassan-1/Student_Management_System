/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.Shared;

import com.mycompany.studentmanagementsystem.nour.MainFrame;

/**
 *
 * @author Mega
 */
public class SwitchPanels {
        public static void showHome(MainFrame mainFrame) {
        mainFrame.getCardLayout().show(mainFrame.getMainPanel(), "home");
    }
}
