/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.sql.Connection;
import javax.swing.JSplitPane;

/**
 *
 * @author User
 */
public class MainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainJPanel
     */
    
    JSplitPane splitPane;
    Connection conn = null;
    
    public MainJPanel(JSplitPane splitPane, Connection conn) {
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
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        btnUniversity = new button.Button();
        btnRentals = new button.Button();
        btnGovernment = new button.Button();
        btnCompany = new button.Button();
        lblGovernment = new javax.swing.JLabel();
        lblUniversity = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblRentals = new javax.swing.JLabel();
        lblMainLogo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 630));

        kGradientPanel1.setkGradientFocus(1200);

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 255, 204));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enterprise Access");

        btnUniversity.setBackground(new java.awt.Color(254, 93, 124));
        btnUniversity.setForeground(new java.awt.Color(255, 255, 255));
        btnUniversity.setText("University");
        btnUniversity.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnUniversity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniversityActionPerformed(evt);
            }
        });

        btnRentals.setBackground(new java.awt.Color(254, 93, 124));
        btnRentals.setForeground(new java.awt.Color(255, 255, 255));
        btnRentals.setText("Housing Rentals");
        btnRentals.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnRentals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalsActionPerformed(evt);
            }
        });

        btnGovernment.setBackground(new java.awt.Color(254, 93, 124));
        btnGovernment.setForeground(new java.awt.Color(255, 255, 255));
        btnGovernment.setText("Government");
        btnGovernment.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnGovernment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovernmentActionPerformed(evt);
            }
        });

        btnCompany.setBackground(new java.awt.Color(254, 93, 124));
        btnCompany.setForeground(new java.awt.Color(255, 255, 255));
        btnCompany.setText("Company");
        btnCompany.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompanyActionPerformed(evt);
            }
        });

        lblGovernment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N

        lblUniversity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N

        lblCompany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N

        lblRentals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGovernment)
                    .addComponent(lblUniversity)
                    .addComponent(lblRentals)
                    .addComponent(lblCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRentals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUniversity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGovernment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGovernment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGovernment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(lblRentals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addComponent(btnRentals, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblMainLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nice Job Logo Main.png"))); // NOI18N

        lblName.setBackground(new java.awt.Color(254, 93, 194));
        lblName.setForeground(new java.awt.Color(255, 255, 204));
        lblName.setText("Compiled by : Aditya Sawant (002762104) | Ameya Apte (002764540) | Nainil Maladkar (002780019)");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblMainLogo)
                        .addGap(27, 27, 27)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblMainLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(lblName)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniversityActionPerformed
        // TODO add your handling code here:
        ChoiceJPanel choicePanel = new ChoiceJPanel(splitPane, conn);
        splitPane.setRightComponent(choicePanel);
    }//GEN-LAST:event_btnUniversityActionPerformed

    private void btnCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompanyActionPerformed
        // TODO add your handling code here:
        CompanyChoiceJPanel companychoicePanel = new CompanyChoiceJPanel(splitPane, conn);
        splitPane.setRightComponent(companychoicePanel);
    }//GEN-LAST:event_btnCompanyActionPerformed

    private void btnRentalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalsActionPerformed
        // TODO add your handling code here:
        HousingChoiceJPanel cscPanel = new  HousingChoiceJPanel(splitPane, conn);
        splitPane.setRightComponent(cscPanel);
    }//GEN-LAST:event_btnRentalsActionPerformed

    private void btnGovernmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovernmentActionPerformed
        // TODO add your handling code here:
        GovernmentChoiceJPanel govPanel = new GovernmentChoiceJPanel(splitPane, conn);
        splitPane.setRightComponent(govPanel);
    }//GEN-LAST:event_btnGovernmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button btnCompany;
    private button.Button btnGovernment;
    private button.Button btnRentals;
    private button.Button btnUniversity;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblGovernment;
    private javax.swing.JLabel lblMainLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRentals;
    private javax.swing.JLabel lblUniversity;
    // End of variables declaration//GEN-END:variables
}
