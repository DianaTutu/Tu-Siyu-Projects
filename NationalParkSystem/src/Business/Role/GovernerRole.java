/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Governer.GovernerPanel;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class GovernerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel CardPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new GovernerPanel(CardPanel, account, enterprise);
    }
    
}
