/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.studentmanagementsystem.nour;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author afifi.store
 */
public class Mainpanel extends javax.swing.JPanel {

    private MainFrame parentFrame;

    /**
     * Creates new form Mainpanel
     */
    public Mainpanel(MainFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();

        try {

            Color panelColor = new Color(40, 40, 50);
            Color textColor = new Color(235, 235, 240);

            if (lblWelcome != null) {
                lblWelcome.setText("Student Management System");
                lblWelcome.setFont(new Font("Segoe UI", Font.BOLD, 36));

            }

            JButton[] btns = new JButton[]{
                (btnAddStudent == null ? null : btnAddStudent),
                (btnViewStudents == null ? null : btnViewStudents),
                (btnUpdateStudent == null ? null : btnUpdateStudent),
                (btnDeleteStudent == null ? null : btnDeleteStudent)
            };

            // Gradient-inspired modern colors 
            //codes for colors 
            Color[] colors = new Color[]{
                new Color(255, 99, 132), // coral pink 
                new Color(0, 181, 204), // bright cyan
                new Color(155, 89, 182), // violet purple
                new Color(255, 159, 67) // orange
            };

            for (int idx = 0; idx < btns.length; idx++) {
                final JButton b = btns[idx];
                if (b == null) {
                    continue;
                }
                final Color base = colors[idx];

                b.setBackground(base);
                b.setForeground(Color.WHITE);
                b.setFont(new Font("Segoe UI", Font.BOLD, 21));
                b.setFocusPainted(false);
                b.setCursor(new Cursor(Cursor.HAND_CURSOR));
                b.setOpaque(true);
                b.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(70, 70, 80), 1, true),
                        BorderFactory.createEmptyBorder(12, 20, 12, 20)
                ));

                b.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        b.setBackground(base.brighter());
                        b.setForeground(new Color(30, 30, 30));
                        b.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 60), 1, true));
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        b.setBackground(base);
                        b.setForeground(Color.WHITE);
                        b.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 80), 1, true));
                    }
                });
            }

            if (btnLogout != null) {
                btnLogout.setBackground(new Color(80, 20, 20));
                btnLogout.setForeground(new Color(255, 85, 85));
                btnLogout.setFont(new Font("Segoe UI", Font.BOLD, 24));
                btnLogout.setFocusPainted(false);
                btnLogout.setCursor(new Cursor(Cursor.HAND_CURSOR));
                btnLogout.setOpaque(true);
                btnLogout.setBorder(BorderFactory.createLineBorder(new Color(90, 40, 40), 1));

                btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        btnLogout.setBackground(new Color(200, 50, 50));
                        btnLogout.setForeground(Color.WHITE);
                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        btnLogout.setBackground(new Color(80, 20, 20));
                        btnLogout.setForeground(new Color(255, 85, 85));
                    }
                });
            }

            UIManager.put("ToolTip.background", panelColor);
            UIManager.put("ToolTip.foreground", textColor);
            UIManager.put("ToolTip.font", new Font("Segoe UI", Font.PLAIN, 15));

        } catch (Exception ex) {
        }

//            setBackground(Color.WHITE);
//        setLayout(new java.awt.BorderLayout());
//
//        JLabel welcomeLabel = new JLabel("Welcome to Student Management System", SwingConstants.CENTER);
//        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
//        welcomeLabel.setForeground(new Color(0, 102, 204));
//
//        add(welcomeLabel, java.awt.BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblWelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnViewStudents = new javax.swing.JButton();
        btnUpdateStudent = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(51, 204, 255));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Student Management System");
        lblWelcome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 8, 0, 6);
        add(lblWelcome, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 255, 255), null, null));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        btnAddStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnViewStudents.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnViewStudents.setText("View Students");
        btnViewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentsActionPerformed(evt);
            }
        });

        btnUpdateStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateStudent.setText("Update Student");
        btnUpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudentActionPerformed(evt);
            }
        });

        btnDeleteStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteStudent.setText("Delete Student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 6);
        add(jPanel2, gridBagConstraints);

        btnLogout.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 657, 24, 6);
        add(btnLogout, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        parentFrame.getCardLayout().show(parentFrame.getAddStudentPanel(),"addStudent");
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to logout?",
                "Confirm Logout",
                javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            parentFrame.getCardLayout().show(parentFrame.getMainPanel(), "login");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentsActionPerformed
        // TODO add your handling code here:
        parentFrame.getCardLayout().show(parentFrame.getMainPanel(), "viewStudents");

    }//GEN-LAST:event_btnViewStudentsActionPerformed

    private void btnUpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudentActionPerformed
        // TODO add your handling code here:
        parentFrame.getCardLayout().show(parentFrame.getMainPanel(), "searchAndUpdate");

    }//GEN-LAST:event_btnUpdateStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateStudent;
    private javax.swing.JButton btnViewStudents;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
