/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.SysAdmin.SystemAdmin;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel CardPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        CardPanel.setBackground(null);
        CardPanel.setOpaque(false);
        return new SystemAdmin(CardPanel, system);
}
    
}
