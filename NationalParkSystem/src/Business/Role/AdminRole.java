/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Organization.UserOrganization;
import Business.UserAccount.UserAccount;
import Interface.Administrator.AdminMain;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel CardPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        CardPanel.setBackground(null);
        CardPanel.setOpaque(false);
        
        return new AdminMain(CardPanel,enterprise,account,system);
        
    }
    
  
    
}
