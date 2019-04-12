/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class ImuDirectory {
    
    private ArrayList <Immune> immuDir;

    public ImuDirectory() {
        immuDir = new ArrayList<Immune>();
    }

    
    public ArrayList<Immune> getImmuDir() {
        return immuDir;
    }
    
    public Immune getSpecifiedType(String type)
    {
        for(Immune imm:immuDir)
        {
            if(imm.getName().equals(type))
            {
                return imm;
            }
        }
        return null;
    }
    
    public String  getImuname()
    {
        String name="";
        for(Immune imm:immuDir)
        {
            name =name+ imm.getName()+",";
        }
        name = name.substring(0, name.length()-1);
        return name;
    }
            
    
}
