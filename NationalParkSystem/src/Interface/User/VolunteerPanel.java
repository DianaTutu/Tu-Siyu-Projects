/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.User;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProjectWorkRequest;
import Business.WorkQueue.VolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.project.Project;
import Business.project.ProjectDirectory;
import java.awt.CardLayout;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gong
 */
public class VolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerJPanel
     */
    public JPanel CardPanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private String projectName;
    private String vet;

    public VolunteerPanel(JPanel CardPanel, UserAccount userAccount, Enterprise enterprise) {
        this.CardPanel = CardPanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        initComponents();
        displayCombo();
        confirm.setEnabled(false);
        apply.setEnabled(false);
        this.setOpaque(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volCoB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apply = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();

        volCoB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));
        volCoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volCoBActionPerformed(evt);
            }
        });
        volCoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                volCoBKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel1.setText("Volunteer");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel2.setText(" Activity project");

        apply.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        apply.setText("Apply");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        cancelbtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        cancelbtn.setText("Back");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jScrollPane2.setWheelScrollingEnabled(false);

        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        jScrollPane2.setViewportView(description);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(volCoB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volCoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        volCoB.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void volCoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volCoBActionPerformed
        // TODO add your handling code here:
        if (volCoB.getSelectedItem() == "select") {
            confirm.setEnabled(false);
            apply.setEnabled(false);

        } else {
            confirm.setEnabled(true);

        }

    }//GEN-LAST:event_volCoBActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        // TODO add your handling code here:
        boolean b = false;
        Project p = (Project) volCoB.getSelectedItem();
        if (userAccount.getWorkQueue().getVolunteerRequestList().size() == 0) {
            if (p.getAvailableNum() <= 0) {
                JOptionPane.showMessageDialog(null, "The project is full!");
                apply.setEnabled(false);
                return;
            }
            VolunteerWorkRequest volunteer = new VolunteerWorkRequest();
            volunteer.setProject(p);
            volunteer.setStatus("Under Review");

            for (Project pro : enterprise.getProjectDirectory().getProjectDir()) {
                if (pro.getProjectName() == projectName) {
                    vet = pro.getResearcher();
                }
            }
            for (UserAccount uu : enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList()) {
                if (uu.getPerson().getName().equalsIgnoreCase(vet)) {
                    volunteer.setReceiver(uu);
                }
            }

            volunteer.setSender(userAccount);
            volunteer.setType("vol");
            Organization org = null;
            Organization orgg = null;
            org = enterprise.getOrganizationDirectory().getOrganizationList().get(0);
            orgg = enterprise.getOrganizationDirectory().getOrganizationList().get(1);
            org.getWorkQueue().getVolunteerRequestList().add(volunteer);
            orgg.getWorkQueue().getVolunteerRequestList().add(volunteer);
            userAccount.getWorkQueue().getVolunteerRequestList().add(volunteer);
            JOptionPane.showMessageDialog(null, "Apply successfully.");
            apply.setEnabled(false);

        } else {
            Iterator<VolunteerWorkRequest> iterator = userAccount.getWorkQueue().getVolunteerRequestList().iterator();
            while (iterator.hasNext()) {
                VolunteerWorkRequest volunteerWorkRequest = iterator.next();
                if (volunteerWorkRequest.getProject() == p) {
                    JOptionPane.showMessageDialog(null, "You've already applied");
                    apply.setEnabled(false);
                    return;
                }
            }
            if (p.getAvailableNum() <= 0) {
                JOptionPane.showMessageDialog(null, "The project is fully registered.\n Please select another project!");
                apply.setEnabled(false);
                return;
            }
            VolunteerWorkRequest volunteer = new VolunteerWorkRequest();
            volunteer.setProject(p);
            volunteer.setStatus("Under Review");

            for (Project pro : enterprise.getProjectDirectory().getProjectDir()) {
                if (pro.getProjectName() == projectName) {
                    vet = pro.getResearcher();
                }
            }
            for (UserAccount uu : enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().getUserAccountList()) {
                if (uu.getPerson().getName().equalsIgnoreCase(vet)) {
                    volunteer.setReceiver(uu);
                }
            }

            volunteer.setSender(userAccount);
            volunteer.setType("vol");
            Organization org = null;
            Organization orgg = null;
            org = enterprise.getOrganizationDirectory().getOrganizationList().get(0);
            orgg = enterprise.getOrganizationDirectory().getOrganizationList().get(1);
            org.getWorkQueue().getVolunteerRequestList().add(volunteer);
            orgg.getWorkQueue().getVolunteerRequestList().add(volunteer);
            userAccount.getWorkQueue().getVolunteerRequestList().add(volunteer);
            JOptionPane.showMessageDialog(null, "Apply successfully.");
            apply.setEnabled(false);

        }


    }//GEN-LAST:event_applyActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        String des = "";
        if (String.valueOf(volCoB.getSelectedItem()) == "select") {
            des = "Please select a porject";
            description.setText(des);
            return;
        }
        volCoB.getSelectedItem();
        Project ppp = (Project) volCoB.getSelectedItem();
        for (Project pp : enterprise.getProjectDirectory().getProjectDir()) {
            if (pp == ppp) {
                des = pp.getDescription();
                projectName = pp.getProjectName();
            }
        }
        description.setText(des);
        apply.setEnabled(true);
    }//GEN-LAST:event_confirmActionPerformed

    private void volCoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_volCoBKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_volCoBKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton confirm;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox volCoB;
    // End of variables declaration//GEN-END:variables

    //private void populateRequestTable() {
    //    DefaultTableModel model = (DefaultTableModel) volunteer.getModel();
    //    model.setRowCount(0);
    //    for (VolunteerWorkRequest request : userAccount.getWorkQueue().getVolunteerRequestList()) {
    //        if (request.getType() == "vol") {
    //            Object[] row = new Object[3];
    //            row[0] = request;
    //            row[1] = request.getProject().getResearcher();
    //            row[2] = request.getStatus();
    //            model.addRow(row);
    //        }
    //    }
    //}
    private void displayCombo() {
        ProjectDirectory pro = enterprise.getProjectDirectory();
        for (Project p : pro.getProjectDir()) {
            if (p.getResearcher() != "" && !p.getStatus().equalsIgnoreCase("Finished")) {
                volCoB.addItem(p);
            }
        }
    }
}
