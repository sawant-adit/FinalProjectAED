/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.citysearchdir;

/**
 *
 * @author naini
 */



public class HousingChoiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Choice_JPanel
     */
    JSplitPane splitPane;
    String choice = "";
    Connection conn = null;

    
    public HousingChoiceJPanel(JSplitPane splitPane, Connection conn) {
        initComponents();
         this.splitPane = splitPane;
         this.conn = conn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnStudent = new button.Button();
        btnSystemAdmin = new button.Button();
        lblTopLogo = new javax.swing.JLabel();
        lblMainLogo = new javax.swing.JLabel();
        lblHouseRentals = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnBack = new button.Button();

        setPreferredSize(new java.awt.Dimension(1000, 630));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 0));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 153, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(100, 630));

        btnStudent.setBackground(new java.awt.Color(204, 0, 255));
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("HOUSE RENTALS");
        btnStudent.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnSystemAdmin.setBackground(new java.awt.Color(204, 0, 255));
        btnSystemAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSystemAdmin.setText("SYSTEM ADMIN");
        btnSystemAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        lblTopLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Title_Housing.png"))); // NOI18N

        lblMainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Housing_IconBig.png"))); // NOI18N

        lblHouseRentals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Housing icon 1.png"))); // NOI18N

        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin icon.png"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_3.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblMainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lblHouseRentals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblTopLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTopLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHouseRentals, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        HousingLoginJPanel cityLoginPanel = new  HousingLoginJPanel(splitPane,"user", conn);
        splitPane.setRightComponent(cityLoginPanel);
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJPanel choicePanel = new MainJPanel(splitPane, conn);
        splitPane.setRightComponent(choicePanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        // TODO add your handling code here:
        choice = "rental admin";
        AdminLoginJPanel loginPanel = new AdminLoginJPanel(splitPane, choice, conn);
        splitPane.setRightComponent(loginPanel);
    }//GEN-LAST:event_btnSystemAdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button btnBack;
    private button.Button btnStudent;
    private button.Button btnSystemAdmin;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblHouseRentals;
    private javax.swing.JLabel lblMainLogo;
    private javax.swing.JLabel lblTopLogo;
    // End of variables declaration//GEN-END:variables
}