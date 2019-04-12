/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.PersonPackage.Student;
import Business.PersonPackage.StudentDirectory;
import Business.StartBusiness;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tusiyu
 */
public class SearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPanel
     */
    private JPanel CardPanel;
    private StartBusiness start;
    //private StudentDirectory searchlist;
    //private Student student;
    public SearchPanel(JPanel CardPanel, StartBusiness start) {
        this.CardPanel = CardPanel;
        this.start = start;
        //this.searchlist = new StudentDirectory();
        //this.student = new Student();
        initComponents();
    }
    
    public void populateTable(StudentDirectory searchlist){  
        DefaultTableModel dtm = (DefaultTableModel) Jtable.getModel();
        dtm.setRowCount(0);
        
        for(Student a : searchlist.getStuDir()){
            Object[] row = new Object[9];
            row[0]=a;
            row[1]=a.getLastname();
            row[2]=a.getId();
            row[3]=a.getBirthday();
            row[4]=a.getAge();
            row[5]=a.getRegisterDate();
            row[6]=a.getMotherName();
            row[7]=a.getFatherName();
            row[8]=a.getImuDir().getImuname();
            dtm.addRow(row);
        }
    }
    
    private StudentDirectory searchStudent(String name,String minage,String maxage){
        
        StudentDirectory slist  = new StudentDirectory();
        
        for(Student s : start.getStudentDirectory().getStuDir()){
            
        	
            String name1 = s.getFirstname();
            int age = s.getAge();
            //integer required validation
            int min,max;
            if (minage.equals("")){
                min = -1;
            }else{ 
             min = Integer.parseInt(minage);
            }
            
            if (maxage.equals("")){
                max = -1;
            }else{
            max = Integer.parseInt(maxage);
            }
            if((name.equals("")) && 
               (minage.equals("")) &&
               (maxage.equals(""))    
              ) {
                
            }else
            
            if(((name.equals(name1)) || ((name.equals("")))) && 
               ((age <= max) || (maxage.equals(""))) &&
               ((age >= min) || (minage.equals(""))) 
              ) {
                
                Student s1 = slist.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(age);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                //student id might be counted automatically
            }
        
        }
        JOptionPane.showMessageDialog(null, "Student search complete");
        return slist;
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
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxAgeText = new javax.swing.JTextField();
        minAgeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Search");

        jLabel2.setText("Search by Name:");

        jLabel3.setText("Search by Age:");

        jLabel4.setText("------");

        sBtn.setText("Search");
        sBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBtnActionPerformed(evt);
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student First Name", "Student Family Name", "Student ID", "Date of Birth", "Age(month)", "Registered Date", "Mother's Name", "Father's Name", "Immulization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
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
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(minAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maxAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(sBtn))
                .addGap(18, 18, 18)
                .addComponent(bBtn)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
        CardPanel.remove(this);
        CardLayout layout = (CardLayout) CardPanel.getLayout();
        layout.previous(CardPanel);
    }//GEN-LAST:event_bBtnActionPerformed

    private void sBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBtnActionPerformed
        // TODO add your handling code here:
    	boolean y = true;
    	/*
    	if (nameText.getText().length() == 0) {
    		JOptionPane.showMessageDialog(null, "You should enter the name.");
    		y = false;
    	}
                */
    	String mi = minAgeText.getText();
        String ma = maxAgeText.getText();
        int a = 0,b = 0;
    	if (mi.equals("")&&(ma.equals(""))) {
            
        }else{
            boolean z = false;
    		try {
        		a = Integer.parseInt(minAgeText.getText());
                        z = true;
        	} catch (NumberFormatException e) {
        		JOptionPane.showMessageDialog(null, "You should enter the lower bound of age.");
        		minAgeText.setText(null); 
                y = false; z = false;
        	}
    	
    	
    	//if (y) {
    		try {
        		b = Integer.parseInt(maxAgeText.getText());
                        z = true;
        	} catch (NumberFormatException e) {
        		JOptionPane.showMessageDialog(null, "You should enter the higher bound of age.");
        		maxAgeText.setText(null); 
                y = false; z = false;
        	}
                
                if ((z == true)&&(a>=0)&&(b>=0)){
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Age shouldn't be smaller than 0.");
                    //minAgeText.setText(null);
                    //maxAgeText.setText(null); 
                    y = false; z = false;
                    
                    if ((z == true)&&(a<b)) {
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Maximum age should be larger than the minimum.");
                    minAgeText.setText(null);
                    maxAgeText.setText(null); 
                    y = false; z = false;
                }
                }
                
                
    	}
        
    	if(y) {
    		String name = nameText.getText();  //suppose name equals first name
                String minage = minAgeText.getText();
                String maxage = maxAgeText.getText();
                StudentDirectory searchlist = searchStudent(name,minage,maxage);
                populateTable(searchlist);
    	}
    }//GEN-LAST:event_sBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JButton bBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxAgeText;
    private javax.swing.JTextField minAgeText;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton sBtn;
    // End of variables declaration//GEN-END:variables
}
