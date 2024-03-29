/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Administrator;

import Business.Enterprise.Enterprise;
import Business.Person.Person;
import Business.Role.EmployeeRole;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class AddEmployee extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    private JPanel CardPanel;
    private Enterprise enterprise;
    public AddEmployee(JPanel CardPanel, Enterprise enterprise) {
        initComponents();
        this.CardPanel = CardPanel;
        this.enterprise = enterprise;
        this.setBackground(null);
        this.setOpaque(false);
        subBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     public boolean namePatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z\\s]{0,8}[a-zA-Z]{1}$");
        Matcher m = p.matcher(ntxt.getText());
        boolean b = m.matches();
        if (b == false) {
            return false;
        }
        return true;
    }
     
     public boolean usernamePatternCorrect() {
        String PATTERN ="^[a-zA-Z][a-zA-Z0-9]{2,15}$";
               Pattern patt =Pattern.compile(PATTERN);
               Matcher m=patt.matcher(untxt.getText());
          
        boolean b =m.matches();
        if(b == false)
        {
            return false;
        } 
        return true;
}
     public boolean emailPatternCorrect() {
        Pattern p = Pattern.compile("^([a-z0-9A-Z]+[._a-z0-9A-Z]?[a-z0-9A-Z]+)@([a-z0-9A-Z]+[a-z0-9A-Z_]?[a-z0-9A-Z]+\\.)+[a-zA-Z]{2,}$");
        Matcher m = p.matcher(etxt.getText());
        boolean b = m.matches();
        if (b == false) {
            return false;
        }
        return true;
    }
     
     public boolean passwordCorrect() {
        String PATTERN ="^[A-Za-z0-9_+$]{6,8}$";
               Pattern patt =Pattern.compile(PATTERN);
               Matcher m=patt.matcher(iptxt.getText());
        boolean b =m.matches();
        if(b == false)
        {
            return false;
        } 
        return true;
     }
     
     public void checkButton() {
        if (ntxt.getText().isEmpty()) {
            subBtn.setEnabled(false);
            return;
        }
        if (untxt.getText().isEmpty()) {
            subBtn.setEnabled(false);
            return;
        }
        if (etxt.getText().isEmpty()) {
            subBtn.setEnabled(false);
            return;
        }
       if(iptxt.getText().isEmpty()){
           subBtn.setEnabled(false);
       }
        
        if (!iptxt.getText().equals(cptxt.getText())) {
            subBtn.setEnabled(false);
            return;
        }
       
         if (combo.getSelectedItem() == "Select A Type") {
            subBtn.setEnabled(false);
            return;
        }
       
        subBtn.setEnabled(true);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ntxt = new javax.swing.JTextField();
        untxt = new javax.swing.JTextField();
        etxt = new javax.swing.JTextField();
        iptxt = new javax.swing.JTextField();
        cptxt = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox();
        subBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Al Bayan", 1, 24)); // NOI18N
        jLabel1.setText("New Employee");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel3.setText("User Name:");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel5.setText("Initial Password: ");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel6.setText("Confirm Password: ");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 2, 18)); // NOI18N
        jLabel7.setText("Account Type:");

        iptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iptxtKeyReleased(evt);
            }
        });

        cptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cptxtActionPerformed(evt);
            }
        });
        cptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cptxtKeyReleased(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select A Type", "vet", "botanist", "geologist" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        subBtn.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        subBtn.setText("Sumbit");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Al Bayan", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(ntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(untxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(157, 157, 157)
                .addComponent(etxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addComponent(iptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addComponent(cptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(untxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(etxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(iptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cptxtActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        // TODO add your handling code here:
        if(!namePatternCorrect()){
              JOptionPane.showMessageDialog(null, "Wrong name pattern!");
              return;
           }
          
         if(!usernamePatternCorrect()){
               JOptionPane.showMessageDialog(null, "Wrong user name pattern!");
             return;
          }
           if (!emailPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Wrong email pattern!");
            return;
        }
           if(!passwordCorrect()){
                JOptionPane.showMessageDialog(null, "Your password should have 6 to 8 digits and could contain 0-9，a-z，A-Z，+_$");
            return;
               
           }

        String name = ntxt.getText();
        String uname = untxt.getText();
        String email = etxt.getText();
        String ip = iptxt.getText();
        String cp = cptxt.getText();
        String type = String.valueOf(combo.getSelectedItem());
        if (type=="Select A Type") {
            JOptionPane.showMessageDialog(null, "Please select a type");
        }
        else{
        System.out.print(type);
        Person p = new Person();
        p.setName(name);
        p.setTag(type);
        p.setSalary(0.0);
        enterprise.getOrganizationDirectory().getOrganizationList().get(1).getUserAccountDirectory().createUserAccount(uname,cp, p, new EmployeeRole()).setEmail(email);
        JOptionPane.showMessageDialog(null, "A New Employee account is created!");
         ntxt.setText("");
        untxt.setText("");
        etxt.setText("");
        iptxt.setText("");
        cptxt.setText("");
        subBtn.setEnabled(false);
        cptxt.setBackground(Color.white);
        }
    }//GEN-LAST:event_subBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardPanel.remove(this);
        Component[] componentArray = CardPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerPanel dwjp = (ManagerPanel) component;
        dwjp.populateEmployee();
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
        checkButton();
    }//GEN-LAST:event_comboActionPerformed

    private void iptxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iptxtKeyReleased
        // TODO add your handling code here:
         checkButton();
        if (cptxt.getText().isEmpty()) {
            return;
        }
        if (cptxt.getText().equals(iptxt.getText())) {
            cptxt.setBackground(Color.green);
        } else {
            cptxt.setBackground(Color.red);
        }
    }//GEN-LAST:event_iptxtKeyReleased

    private void cptxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cptxtKeyReleased
        // TODO add your handling code here:
        checkButton();
        if (iptxt.getText().equals(cptxt.getText())) {
            cptxt.setBackground(Color.green);
        } else {
            cptxt.setBackground(Color.red);
        }
    }//GEN-LAST:event_cptxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField cptxt;
    private javax.swing.JTextField etxt;
    private javax.swing.JTextField iptxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField ntxt;
    private javax.swing.JButton subBtn;
    private javax.swing.JTextField untxt;
    // End of variables declaration//GEN-END:variables
}
