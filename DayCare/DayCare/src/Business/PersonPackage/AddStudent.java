/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

import Business.ServicePackage.ImuDirectory;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author ferrari
 */
public interface AddStudent {
    public void setAge(int age) ;
    public void setAge(Date now, String birthDay) throws ParseException;
    public Date parser(String birthDay) throws ParseException;
    public ImuDirectory readImu(String immunetype,String period,
            String rit,String ide,String its);
    public void addVaccineList(String type);
    public Date parse(String date) throws ParseException;
}
