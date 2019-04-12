/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Administrator;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class RequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPanel
     */
    private JPanel CardPanel;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem system;

    public RequestPanel(JPanel CardPanel, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.account = account;
        this.CardPanel = CardPanel;
        this.enterprise = enterprise;
        this.system = system;
        this.setBackground(null);
        this.setOpaque(false);
        reqbtn.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

//    public boolean titlePatternCorrect() {
//        Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z\\\\s]{0,9}[a-zA-Z0-9]{1,5}$");
//        Matcher m = p.matcher(title.getText());
//        boolean b = m.matches();
//        if (b == false) {
//            return false;
//        }
//        return true;
//    }

    public boolean fundPatternCorrect() {
        Pattern p = Pattern.compile("^[1-9]\\d*$");
        Matcher m = p.matcher(funding.getText());
        boolean b = m.matches();
        if (b == false) {
            return false;
        }
        return true;
    }

    public void checkButton() {
        if (funding.getText().isEmpty() || title.getText().isEmpty() || description.getText().isEmpty() || date.getDate() == null) {
            reqbtn.setEnabled(false);
            return;
        }
        reqbtn.setEnabled(true);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        funding = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        reqbtn = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        fundlab = new javax.swing.JLabel();
        titlelab = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel4.setText("Funding Request");

        jLabel15.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel15.setText("Title:");

        title.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                titleKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel11.setText("Expect Date: ");

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel12.setText("Funding:");

        funding.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fundingKeyReleased(evt);
            }
        });

        jLabel14.setText("$");

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel13.setText("Description: ");

        description.setColumns(20);
        description.setRows(5);
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descriptionKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(description);

        reqbtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        reqbtn.setText("Request");
        reqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqbtnActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        fundlab.setForeground(new java.awt.Color(255, 51, 51));
        fundlab.setText("                        ");

        titlelab.setForeground(new java.awt.Color(255, 51, 51));
        titlelab.setText("                   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(funding, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fundlab, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlelab, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(reqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlelab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(funding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(fundlab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reqbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqbtnActionPerformed
        // TODO add your handling code here:
//        if (!titlePatternCorrect()) {
//            JOptionPane.showMessageDialog(null, "Wrong title pattern!");
//            return;
//        }

        if (!fundPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Wrong fund pattern!");
            return;
        }
        if (date.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Select a date!");
            return;
        }
        if (title.getText()== null || title.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a title!");
            return;
        }
        if (funding.getText()== null) {
            JOptionPane.showMessageDialog(null, "Please enter a fund number!");
            return;
        }
        if (description.getText()== null) {
            JOptionPane.showMessageDialog(null, "Please enter a description!");
            return;
        }        FundingRequest frequest = new FundingRequest();
        frequest.setMessage(title.getText());
        frequest.setRequestDate(date.getDate());
        frequest.setFunding(Double.parseDouble(funding.getText()));
        frequest.setDescription(description.getText());
        frequest.setSender(account);
        frequest.setStatus("Pending");
        Enterprise enterprise1 = system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(1);
        enterprise1.getWorkQueue().getFundingRequestList().add(frequest);

        JOptionPane.showMessageDialog(null, "Request sent");
        title.setText("");
        funding.setText("");
        description.setText("");
        date.setDate(null);
    }//GEN-LAST:event_reqbtnActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //CardPanel.remove(this);
        //CardLayout layout = (CardLayout) CardPanel.getLayout();
        //layout.previous(CardPanel);
        CardPanel.remove(this);
        Component[] componentArray = CardPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerPanel dwjp = (ManagerPanel) component;
        dwjp.populateRequest();
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void titleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleKeyReleased
        // TODO add your handling code here:
        checkButton();
//        if (!titlePatternCorrect()) {
//            titlelab.setText("Title is incorrect!");
//        } else {
//            titlelab.setText(null);
//        }

    }//GEN-LAST:event_titleKeyReleased

    private void fundingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fundingKeyReleased
        // TODO add your handling code here:
        checkButton();
        if (!fundPatternCorrect()) {
            fundlab.setText("Fund is incorrect!");
        } else {
            fundlab.setText(null);
        }
    }//GEN-LAST:event_fundingKeyReleased

    private void descriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyReleased
        // TODO add your handling code here:
//        if (!titlePatternCorrect()) {
//            return;
//        }
        if (!fundPatternCorrect()) {
            return;
        }
        if (date.getDate() == null) {
            return;
        }
        if (description.getText().isEmpty()) {
            return;
        }
        reqbtn.setEnabled(true);
    }//GEN-LAST:event_descriptionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField funding;
    private javax.swing.JLabel fundlab;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton reqbtn;
    private javax.swing.JTextField title;
    private javax.swing.JLabel titlelab;
    // End of variables declaration//GEN-END:variables
}
