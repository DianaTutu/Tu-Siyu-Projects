/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Employee.getValue())){
            organization = new EmployeeOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Governer.getValue())){
            organization = new GovernerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Finacial.getValue())){
            organization = new FinacialOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}