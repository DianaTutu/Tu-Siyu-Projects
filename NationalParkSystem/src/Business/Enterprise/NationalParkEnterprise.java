/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class NationalParkEnterprise extends Enterprise{

    public NationalParkEnterprise(String name){
        super(name,EnterpriseType.NationalPark);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
