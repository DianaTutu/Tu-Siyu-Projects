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
import Interface.Employee.Vet.VetWorkSchedule;
import javax.swing.JPanel;

/**
 *
 * @author tusiyu
 */
public class VetRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel CardPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
              return new VetWorkSchedule(CardPanel, account, (EmployeeOrganization)organization, enterprise);
    }
    
}
