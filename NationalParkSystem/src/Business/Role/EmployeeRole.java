/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EmployeeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Employee.Botanist.BotanistWorkAreaJPanel;
import Interface.Employee.FieldTeam.FieldTeamWorkAreaJPanel;
import Interface.Employee.Geologist.GeologistWorkAreaJPanel;
import Interface.Employee.Vet.VetWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class EmployeeRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel CardPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        if (account.getPerson().getTag().equalsIgnoreCase("vet")) {
            return new VetWorkAreaJPanel(CardPanel, account, (EmployeeOrganization) organization, enterprise);
        }
        if (account.getPerson().getTag().equalsIgnoreCase("botanist")) {
            return new BotanistWorkAreaJPanel(CardPanel, account);
        }
        if (account.getPerson().getTag().equalsIgnoreCase("geologist")) {
            return new GeologistWorkAreaJPanel(CardPanel, enterprise, account);
        }
        if (account.getPerson().getTag().equalsIgnoreCase("FieldGroup")) {
            return new FieldTeamWorkAreaJPanel(CardPanel, account,enterprise);
        }
        
        return null;

    }

}
