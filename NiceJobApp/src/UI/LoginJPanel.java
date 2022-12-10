/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.UniCareerAdvisor;
import model.UniCareerAdvisorDir;
import model.UniCollege;
import model.UniCollegeDir;
import model.UniDepartment;
import model.UniDepartmentDir;
import model.UniExamCell;
import model.UniExamCellDir;
import model.UniStudent;
import model.UniStudentDir;
import model.University;
import model.UniversityDir;

/**
 *
 * @author naini
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Choice_JPanel
     */
    JSplitPane splitPane;
    String choice = "";
    Connection conn = null;
    String masterPassword = "#monga235";
    
    UniStudent selectedStudent = new UniStudent();
    UniCollegeDir uniColleges = new UniCollegeDir();
    UniversityDir universities = new UniversityDir();
    UniDepartmentDir uniDepartments = new UniDepartmentDir();
    UniStudentDir uniStudents = new UniStudentDir();
    UniCareerAdvisorDir uniAdvisors = new UniCareerAdvisorDir();
    UniCareerAdvisor advisor = new UniCareerAdvisor();
    UniExamCell uniExamCell = new UniExamCell();
    UniExamCellDir uniExamCellDir = new UniExamCellDir();
    public LoginJPanel(JSplitPane splitPane, String choice, Connection conn) {
        initComponents();
        
        this.splitPane = splitPane;
        this.choice = choice;
        this.conn = conn;
        
        getAllUniversityData();
        getAllStudents();
        getAllCareerAdvisors();
        getAllExamCells();
        
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
        btnLogin = new button.Button();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        clkDisplay = new clock.Clock();
        lblCentralLoginDesk = new javax.swing.JLabel();
        back_btn = new button.Button();
        jLabel2 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 51));

        btnLogin.setBackground(new java.awt.Color(0, 204, 204));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setPreferredSize(new java.awt.Dimension(250, 60));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");

        lblUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username");

        passwordField.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCentralLoginDesk.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        lblCentralLoginDesk.setForeground(new java.awt.Color(255, 255, 255));
        lblCentralLoginDesk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCentralLoginDesk.setText("Central Login Desk");

        back_btn.setBackground(new java.awt.Color(204, 204, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_3.png"))); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Title University small.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(clkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCentralLoginDesk, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(119, 119, 119))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblCentralLoginDesk)
                        .addGap(31, 31, 31)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clkDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = "";
        String password = "";
        
        if(choice.equalsIgnoreCase("advisor")){
            advisor = uniAdvisors.searchByUsername(txtUsername.getText());
            if(advisor==null){
                JOptionPane.showMessageDialog(this, "Invalid username. Advisor does not exist");
            }else{
                if(advisor.getPassword().equals(new String(passwordField.getPassword())) || masterPassword.equals(new String(passwordField.getPassword()))){
                    UniCareerAdvisorJPanel advisorPanel = new UniCareerAdvisorJPanel(splitPane, conn, advisor);
                    splitPane.setRightComponent(advisorPanel);
                }else{
                    JOptionPane.showMessageDialog(this, "Password incorrect. Please try again.");
                }
            }
        }else if(choice.equalsIgnoreCase("examCell")){
            
            uniExamCell = uniExamCellDir.searchByUsername(txtUsername.getText());
            if(uniExamCell==null){
                JOptionPane.showMessageDialog(this, "Invalid username. Exam Cell does not exist");
            }else{
                if(uniExamCell.getPassword().equals(new String(passwordField.getPassword())) || masterPassword.equals(new String(passwordField.getPassword()))){
                    UniExamCellJPanel examCellPanel = new UniExamCellJPanel(splitPane, conn,uniExamCell);
                    splitPane.setRightComponent(examCellPanel);
                }else{
                    JOptionPane.showMessageDialog(this, "Password incorrect. Please try again.");
                }
            }
        }else if(choice.equalsIgnoreCase("admin")){
            SystemAdminCompanyJPanel sysAdminComp = new SystemAdminCompanyJPanel(splitPane, conn);
            splitPane.setRightComponent(sysAdminComp);
        }else{
            selectedStudent = uniStudents.searchBySevisId(txtUsername.getText());
            if(selectedStudent == null){
                JOptionPane.showMessageDialog(this, "User does not exist");
            }else{
                if(selectedStudent.getPassword().equals(new String(passwordField.getPassword())) || masterPassword.equals(new String(passwordField.getPassword()))){
                    UniStudentJPanel studentPanel = new UniStudentJPanel(splitPane, conn, selectedStudent);
                    splitPane.setRightComponent(studentPanel);
                }else{
                    JOptionPane.showMessageDialog(this, "Password incorrect. Please try again.");
                }
            }
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if(res == 0) {
            ChoiceJPanel choicePanel = new ChoiceJPanel(splitPane, conn);
            splitPane.setRightComponent(choicePanel);
        }
        else{
            //Pressed No
        }
    }//GEN-LAST:event_back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button back_btn;
    private button.Button btnLogin;
    private clock.Clock clkDisplay;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCentralLoginDesk;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField txtUsername;
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
                    dept.setAdvisorId(rsDepartment.getInt("uni_advisor_id"));
                    for(UniCollege college : uniColleges.getUniCollegeList()){
                        if(college.getId() == rsDepartment.getInt("uni_college_id")){
                            dept.setCollege(college);
                        }
                    }

                }
                stDepartment.close();

            } catch (SQLException ex) {
                System.out.println("An error occurred. Maybe user/password is invalid");
                ex.printStackTrace();
        }       
    }
    
    public void getAllStudents(){
        try {
            String queryStudents = "SELECT * FROM uni_student";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(queryStudents);                
                while (rs.next())
                {
                    UniStudent student = uniStudents.addUniStudent();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setSevisId(rs.getString("student_gov_id"));
                    student.setContactNo(rs.getLong("contact_no"));
                    student.setEmailId(rs.getString("email"));
                    student.setGpa(rs.getDouble("gpa"));
                    student.setIntake(rs.getString("intake"));
                    student.setSemester(rs.getInt("semester"));
                    student.setCourse(rs.getString("course"));
                    student.setJdWatchAccess(rs.getBoolean("jd_watch_eligible"));
                    student.setPassword(rs.getString("password"));
                    
                    //new fields
                    if(rs.getString("country_of_origin")!=null){
                        student.setCountryOfOrigin(rs.getString("country_of_origin"));
                    }
                    if(rs.getString("gender")!=null){
                        student.setGender(rs.getString("gender"));
                    }
                    if(Integer.valueOf(rs.getInt("age"))!=null){
                        student.setAge(rs.getInt("age"));
                    }
                    if(rs.getString("academic_summary")!=null){
                        student.setAcademicSummary(rs.getString("academic_summary"));
                    }
                    if(rs.getString("start_date") != null){
                        student.setStartDate(LocalDate.parse(rs.getString("start_date")));
                    }
                    if(rs.getString("end_date") != null){
                        student.setEndDate(LocalDate.parse(rs.getString("end_date")));
                    }
                    if(rs.getString("comments") != null){
                        student.setComments(rs.getString("comments"));
                    }
                    
                    UniDepartment department = uniDepartments.searchById(rs.getInt("uni_department_id"));
                    student.setDepartment(department);
                }
                st.close();
        } catch (SQLException ex) {
            Logger.getLogger(UniExamCellJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAllCareerAdvisors(){
        try {
            String queryAdvisors = "SELECT * FROM uni_career_advisor";
            Statement stAdv = conn.createStatement();
            ResultSet rs = stAdv.executeQuery(queryAdvisors);                
                while (rs.next())
                {
                    UniCareerAdvisor advisor = uniAdvisors.addUniCareerAdvisor();
                    UniDepartment filteredDept = uniDepartments.searchByAdvisorId(rs.getInt("id"));
                    advisor.setDepartment(filteredDept);
                    advisor.setId(rs.getInt("id"));
                    advisor.setName(rs.getString("name"));
                    advisor.setPassword(rs.getString("password"));
                    advisor.setUsername(rs.getString("username"));
                    advisor.setUniversityId(rs.getInt("university_id"));
                }
                stAdv.close();
        } catch (SQLException ex) {
            Logger.getLogger(UniExamCellJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getAllExamCells(){
        try {
            String queryExamCells = "SELECT * FROM uni_exam_center";
            Statement stExamcell = conn.createStatement();
            ResultSet rs = stExamcell.executeQuery(queryExamCells);                
                while (rs.next())
                {
                    UniExamCell uniExamCellNew = uniExamCellDir.addUniExamCell();
                    uniExamCellNew.setEmail(rs.getString("email"));
                    uniExamCellNew.setId(rs.getInt("id"));
                    uniExamCellNew.setName(rs.getString("name"));
                    uniExamCellNew.setPassword(rs.getString("password"));
                    uniExamCellNew.setUsername(rs.getString("username"));
                    uniExamCellNew.setUniversityId(rs.getInt("university_id"));
                    
                }
                stExamcell.close();
        } catch (SQLException ex) {
            Logger.getLogger(UniExamCellJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
