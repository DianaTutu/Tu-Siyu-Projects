/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Business.PersonPackage.Student;
import Business.PersonPackage.StudentDirectory;
import Business.PersonPackage.Teacher;
import Business.PersonPackage.TeacherDirectory;
import Business.StartBusiness;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tusiyu
 */

public class ManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePanel
     */
    private StartBusiness start;
    //private StudentDirectory studentDir;
    private JPanel CardPanel;
    private StudentDirectory studentDir;
    private TeacherDirectory teacherDir;
    public ManagePanel(JPanel CardPanel,StartBusiness start) {
        this.CardPanel = CardPanel;
        this.start = start;
        studentDir = start.getStudentDirectory();
        teacherDir = start.getTeacherDirectory();
        //this.studentDir = studentDir;
        initComponents();
        assignGroup();
        //start.classifyStu();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aBtn = new javax.swing.JButton();
        uBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Student List");

        aBtn.setText("Add");
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        uBtn.setText("Update");
        uBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uBtnActionPerformed(evt);
            }
        });

        dBtn.setText("Delete");
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        bBtn.setText("Back");
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        Jtable.setBackground(new java.awt.Color(255, 255, 153));
        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student First Name", "Student Family Name", "Student ID", "Date of Birth", "Age(month)", "Registered Date", "Mother's Name", "Father's Name", "Immulization", "teacher", "group", "class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(uBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(409, 409, 409)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(aBtn)
                .addGap(30, 30, 30)
                .addComponent(dBtn)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uBtn)
                    .addComponent(bBtn))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void assignGroup(){
            
       TeacherDirectory t6 = new TeacherDirectory();
       TeacherDirectory t13 = new TeacherDirectory();
       TeacherDirectory t25 = new TeacherDirectory();
       TeacherDirectory t36 = new TeacherDirectory();
       TeacherDirectory t48 = new TeacherDirectory();
       TeacherDirectory t60 = new TeacherDirectory();
        for(Teacher tea : teacherDir.getTeaDir()){
            if(tea.getMin_age()==6)
            {
               t6.addTeacher();
            }
            if(tea.getMin_age()==6)
            {
               t13.addTeacher();
            }
            if(tea.getMin_age()==6)
            {
               t25.addTeacher();
            }
            if(tea.getMin_age()==6)
            {
               t36.addTeacher();
            }
            if(tea.getMin_age()==6)
            {
               t48.addTeacher();
            }if(tea.getMin_age()==6)
            {
               t60.addTeacher();
            }           
        }
        
        int i =0;
        
        for(Student s : studentDir.getStuDir())
        {
            if(s.getAge()>=6&&s.getAge()<=12)
           {
           for(Teacher t: t6.getTeaDir())
               while(i<t.getMax_s()){
                   i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
            if(s.getAge()>=13&&s.getAge()<=24)
           {
           for(Teacher t: t13.getTeaDir())
               while(i<t.getMax_s()){
                     i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
             if(s.getAge()>=25&&s.getAge()<=35)
           {
           for(Teacher t: t25.getTeaDir())
               while(i<t.getMax_s()){
                     i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
             if(s.getAge()>=36&&s.getAge()<=47)
           {
           for(Teacher t: t36.getTeaDir())
               while(i<t.getMax_s()){
                     i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
             if(s.getAge()>=48&&s.getAge()<=59)
           {
           for(Teacher t: t48.getTeaDir())
               while(i<t.getMax_s()){
                     i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
             if(s.getAge()>=60)
           {
           for(Teacher t: t60.getTeaDir())
               while(i<t.getMax_s()){
                     i++;
                s.setTeacher(t.getFirstname());
                s.setGroup(t.getGroup());
                s.setClassr(t.getClaseroom());
               }
           }
        
        }
    }
    
    
    public void populateTable(){  
   
        DefaultTableModel dtm = (DefaultTableModel) Jtable.getModel();
        dtm.setRowCount(0);
        
        for(Student a : start.getStudentDirectory().getStuDir()){
            Object[] row = new Object[12];
            row[0]=a;
            row[1]=a.getLastname();
            row[2]=a.getId();
            row[3]=a.getBirthday();
            row[4]=a.getAge();
            row[5]=a.getRegisterDate();
            row[6]=a.getMotherName();
            row[7]=a.getFatherName();
            row[8]=a.getImuDir().getImuname();
            row[9]=a.getTeacher();
            row[10]=a.getGroup();
            row[11]=a.getClassr();
            dtm.addRow(row);
        }
    }
    
    public void populateT2S()
    {
        for(Teacher t:start.getTeacherDirectory().getTeaDir())
        {
            start.getTeacherDirectory().getT2S().put(t.getFirstname(), new ArrayList<Student>());
        }
        for(Student stu:start.getStudentDirectory().getStuDir())
        {
            //start.getTeacherDirectory().getT2S().get(stu.getTeacher()).add(stu);
            
        }
    }

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        // TODO add your handling code here:
        AddPanel panel = new AddPanel(CardPanel,start);
        CardPanel.add("AddPanel", panel);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.next(CardPanel);
    }//GEN-LAST:event_aBtnActionPerformed

    private void uBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uBtnActionPerformed
        // TODO add your handling code here:
        UpdatePanel panel = new UpdatePanel(CardPanel);
        CardPanel.add("UpdatePanel", panel);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.next(CardPanel);
    }//GEN-LAST:event_uBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_bBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton uBtn;
    // End of variables declaration//GEN-END:variables
}