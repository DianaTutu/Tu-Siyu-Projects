/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.GovernerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class GovernerOrganization extends Organization{

    public GovernerOrganization() {
        super(Organization.Type.Governer.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernerRole());
        return roles;
    }
    
}
