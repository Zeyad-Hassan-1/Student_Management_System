/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.frontend.home;

import javax.swing.JFrame;

/**
 *
 * @author afifi.store
 */
public class NavigationHelper{

    public static void goBack(JFrame current, JFrame target) {
        if (current != null) {
            current.dispose(); // close the current frame---------------------------
        }

        if (target != null) {
            target.setVisible(true); // open the target frame-----------------------
            target.setLocationRelativeTo(null); // center it
        }
    }

}
