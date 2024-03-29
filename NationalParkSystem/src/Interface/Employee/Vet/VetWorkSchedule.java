/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Employee.Vet;

import Interface.Employee.Vet.EnterVitalSignsJPanel;
import Business.Enterprise.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalReportRequest;
import Business.WorkQueue.ProjectWorkRequest;
import Business.WorkQueue.ResearchWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.project.Project;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YueZheng
 */
public class VetWorkSchedule extends javax.swing.JPanel {

    /**
     * Creates new form ResearcherWorkSchedule
     */
    private JPanel CardPanel;
    private EmployeeOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;

    public VetWorkSchedule(JPanel CardPanel, UserAccount account, EmployeeOrganization organization, Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.CardPanel = CardPanel;

        populateTable();
        populateAnimalWorkRequestTable();
        this.setOpaque(false);
    }

    public void populateAnimalWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) animalWorkRequestTable.getModel();
        model.setRowCount(0);
        for (AnimalReportRequest request : account.getWorkQueue().getAnimalReportRequestList()) {
            Object[] row = new Object[2];
            row[0] = request;
            row[1] = request.getReport().getStatus();
            model.addRow(row);
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) project.getModel();

        model.setRowCount(0);
        for (ProjectWorkRequest request : account.getWorkQueue().getProjectRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getProject().getMemberNum();
            row[2] = request.getStatus();
            row[3] = request.getProject().getDescription();
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        project = new javax.swing.JTable();
        finishBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        animalWorkRequestTable = new javax.swing.JTable();
        processBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel1.setText("Work Schedule");

        project.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        project.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work", "Member Number", "Status", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        project.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(project);

        finishBtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        finishBtn.setText("Finish");
        finishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel2.setText("Volunteer Projects:");

        animalWorkRequestTable.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        animalWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(animalWorkRequestTable);

        processBtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel3.setText("Animal Vital Signs Assignments:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finishBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel3))))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(finishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void finishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = project.getSelectedRow();
        if (selectedRow >= 0) {
            ProjectWorkRequest a = (ProjectWorkRequest) project.getValueAt(selectedRow, 0);
            if(a.getProject().getStatus().equalsIgnoreCase("Finished")){
                JOptionPane.showMessageDialog(null, "Already finished!");
            }
            else{
            a.getProject().setStatus("Finished");
            a.setStatus("Done");
        }} else {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
        populateTable();
    }//GEN-LAST:event_finishBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = animalWorkRequestTable.getSelectedRow();
        if (selectedRow >= 0) {
            AnimalReportRequest a = (AnimalReportRequest) animalWorkRequestTable.getValueAt(selectedRow, 0);
            if(a.getReport().getStatus().equalsIgnoreCase("Checked")){
                JOptionPane.showMessageDialog(null, "Already Checked");
            }
            else{
            EnterVitalSignsJPanel evsjp = new EnterVitalSignsJPanel(CardPanel, a);
            CardPanel.add("EnterVitalSignsJPanel", evsjp);
            CardLayout layout = (CardLayout) CardPanel.getLayout();
            layout.next(CardPanel);

        } }else {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
    }//GEN-LAST:event_processBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable animalWorkRequestTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton finishBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processBtn;
    private javax.swing.JTable project;
    // End of variables declaration//GEN-END:variables
}
