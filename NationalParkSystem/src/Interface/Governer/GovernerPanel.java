/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Governer;

import Interface.Employee.*;
import Business.Enterprise.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundingRequest;
import Business.WorkQueue.ProjectWorkRequest;
import Business.WorkQueue.ResearchWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.project.Project;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YueZheng
 */
public class GovernerPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovernerPanel
     */
    private JPanel CardPanel;

    private Enterprise enterprise;
    private UserAccount account;

    public GovernerPanel(JPanel CardPanel, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.enterprise = enterprise;
        this.CardPanel = CardPanel;
        this.setBackground(null);
        this.setOpaque(false);
        populateTable();
    }

    public void populateTable() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        DefaultTableModel model = (DefaultTableModel) project.getModel();
        model.setRowCount(0);

        for (FundingRequest request : enterprise.getOrganizationDirectory().getOrganizationList().get(0).getWorkQueue().getFundingRequestList()) {
//            System.out.println(request.getReceiver().getPerson().getName());
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getFunding();
            row[2] = sdf.format(request.getRequestDate());
            row[3] = request.getSender().getUsername();
            row[4] = request.getDescription();
            row[5] = request.getStatus();
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
        approve = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        decline = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel1.setText("Governor Decision");

        project.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        project.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Funding", "Expecting Date", "Processor", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        project.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(project);

        approve.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        approve.setText("Approve");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        decline.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        decline.setText("Decline");
        decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189)
                            .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decline, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        // TODO add your handling code here:
        int selectedRow = project.getSelectedRow();
        if (selectedRow >= 0){ 
        FundingRequest a = (FundingRequest)project.getValueAt(selectedRow, 0);
        if(a.getStatus()=="Approved"||a.getStatus()=="Decline"){
            JOptionPane.showMessageDialog(null, "Already processes!");
        }
        else{
        a.setStatus("Approved");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
       populateTable();
    }//GEN-LAST:event_approveActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineActionPerformed
        // TODO add your handling code here:
        int selectedRow = project.getSelectedRow();
        if (selectedRow >= 0){ 
        FundingRequest a = (FundingRequest)project.getValueAt(selectedRow, 0);
        if(a.getStatus()=="Approved"||a.getStatus()=="Decline"){
            JOptionPane.showMessageDialog(null, "Already processes!");
        }
        else{
        a.setStatus("Decline");
        }}
        else{
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
       populateTable();
        
    }//GEN-LAST:event_declineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton decline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable project;
    // End of variables declaration//GEN-END:variables
}