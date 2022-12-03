/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.UniCollege;
import model.UniCollegeDir;
import model.UniDepartment;
import model.UniDepartmentDir;
import model.University;
import model.UniversityDir;

/**
 *
 * @author naini
 */
public class UniExamCellJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Uni_ExamCell_JPanel
     */
    JSplitPane splitPane;
    UniCollegeDir uniColleges = new UniCollegeDir();
    UniversityDir universities = new UniversityDir();
    UniDepartmentDir uniDepartments = new UniDepartmentDir();

    Integer selectedUniversityId = 0;
    Integer selectedCollegeId = 0;
    Integer selectedDepartmentId = 0;
    
    Connection conn = null;
    
    public UniExamCellJPanel(JSplitPane splitPane, Connection conn) {
        initComponents();
        
        this.splitPane = splitPane;
        this.conn = conn;
        tblStudentDetails.getTableHeader().setFont( new Font( "Trebuchet MS" , Font.PLAIN, 18 ));
        
        getAllUniversityData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        DEPT_jComboBox = new javax.swing.JComboBox<>();
        txtCollegeId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new button.Button();
        btnDelete = new button.Button();
        btnSearch = new button.Button();
        btnRefreshTable = new button.Button();
        btnClear = new button.Button();
        btnViewSelected = new button.Button();
        txtStudentName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        btnLogOut = new button.Button();
        jLabel1 = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sliderGPA = new javax.swing.JSlider();
        txtCollegeId1 = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        DEPT_jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 102));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 51, 51));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1005, 700));

        tblStudentDetails.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        tblStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "College ID", "Student Name", "Contact No", "Email ID", "Semester", "Course", "GPA", "Work Eligible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentDetails);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department");

        DEPT_jComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DEPT_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical Engineering", "Software Comuter Engineering", "MultiDisciplinary", "Project Management", "Regulatory Affairs" }));

        txtCollegeId.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCollegeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCollegeIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact No.");

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_5.png"))); // NOI18N
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_6.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_7.png"))); // NOI18N

        btnRefreshTable.setBackground(new java.awt.Color(204, 255, 204));
        btnRefreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_4.png"))); // NOI18N

        btnClear.setBackground(new java.awt.Color(204, 255, 204));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_8.png"))); // NOI18N

        btnViewSelected.setBackground(new java.awt.Color(204, 255, 204));
        btnViewSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_9.png"))); // NOI18N
        btnViewSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSelectedActionPerformed(evt);
            }
        });

        txtStudentName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        txtContactNo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        email_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        btnLogOut.setBackground(new java.awt.Color(204, 204, 255));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_3.png"))); // NOI18N
        btnLogOut.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MASS(100 × 50 px) (1).png"))); // NOI18N

        lblStudentName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblStudentName.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentName.setText("Student Name");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("College ID");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Email ID");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Intake");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Course");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("GPA");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("STUDENT DETAILS");

        txtCollegeId1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCollegeId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCollegeId1ActionPerformed(evt);
            }
        });

        txtGPA.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtGPA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGPA.setEnabled(false);

        DEPT_jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        DEPT_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrical Engineering", "Software Comuter Engineering", "MultiDisciplinary", "Project Management", "Regulatory Affairs" }));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("Save");

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtCollegeId1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(sliderGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(DEPT_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DEPT_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCollegeId, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addGap(12, 12, 12))))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnRefreshTable, btnSearch, btnViewSelected});

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {email_txt, txtContactNo, txtStudentName});

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUpdate, jButton1});

        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefreshTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnViewSelected, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblStudentName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEPT_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCollegeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtCollegeId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(DEPT_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12)
                    .addComponent(sliderGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnRefreshTable, btnSearch, btnViewSelected});

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {email_txt, txtCollegeId, txtContactNo, txtStudentName});

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sliderGPA, txtGPA});

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUpdate, jButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewSelectedActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtCollegeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCollegeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCollegeIdActionPerformed

    private void txtCollegeId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCollegeId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCollegeId1ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(res == 0) {
            ChoiceJPanel choicePanel = new ChoiceJPanel(splitPane, conn);
            splitPane.setRightComponent(choicePanel);
        }
        else{
            //Pressed No
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        newEntry();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DEPT_jComboBox;
    private javax.swing.JComboBox<String> DEPT_jComboBox1;
    private button.Button btnAdd;
    private button.Button btnClear;
    private button.Button btnDelete;
    private button.Button btnLogOut;
    private button.Button btnRefreshTable;
    private button.Button btnSearch;
    private javax.swing.JButton btnUpdate;
    private button.Button btnViewSelected;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JSlider sliderGPA;
    private javax.swing.JTable tblStudentDetails;
    private javax.swing.JTextField txtCollegeId;
    private javax.swing.JTextField txtCollegeId1;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables

    public void getAllUniversityData(){
         try {
                //Universities
                String queryUniversity = "SELECT * FROM university";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(queryUniversity);                
                while (rs.next())
                {
                    University university = universities.addUniversity();
                    university.setId(rs.getInt("id"));
                    university.setName(rs.getString("name"));
                    university.setDistrict(rs.getString("district"));
                    university.setState(rs.getString("state"));
                    university.setCountry(rs.getString("country"));
                    university.setPincode(rs.getLong("pincode"));
                }
                st.close();

                //Colleges
                String queryCollege = "SELECT * FROM uni_college";
                Statement stCollege = conn.createStatement();
                ResultSet rsCollege = stCollege.executeQuery(queryCollege);                
                while (rsCollege.next())
                {
                    UniCollege college = uniColleges.addUniCollege();
                    college.setId(rsCollege.getInt("id"));
                    college.setName(rsCollege.getString("name"));

                    for(University uni : universities.getUniversityList()){
                        if(uni.getId() == rsCollege.getInt("university_id")){
                            college.setUniversity(uni);
                        }
                    }

                }
                stCollege.close();

                //Departments
                String queryDepartment = "SELECT * FROM uni_department";
                Statement stDepartment = conn.createStatement();
                ResultSet rsDepartment = stDepartment.executeQuery(queryDepartment);                
                while (rsDepartment.next())
                {
                    UniDepartment dept = uniDepartments.addUniDepartment();
                    dept.setId(rsDepartment.getInt("id"));
                    dept.setName(rsDepartment.getString("name"));

                    for(UniCollege college : uniColleges.getUniCollegeList()){
                        if(college.getId() == rsDepartment.getInt("uni_college_id")){
                            dept.setCollege(college);
                        }
                    }

                }
                stCollege.close();

            } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }       
    }
    
    public void newEntry(){
        try{
                System.out.println(LocalTime.now());
                String queryUniversity = "INSERT into university (name, district, state, country, pincode) VALUES ('Charles','ABCD','EFGH','USA','02215')";
                Statement st = conn.createStatement();
                st.executeUpdate(queryUniversity);                
                System.out.println(LocalTime.now());
        }catch(SQLException ex){
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }       
    }
    
}
