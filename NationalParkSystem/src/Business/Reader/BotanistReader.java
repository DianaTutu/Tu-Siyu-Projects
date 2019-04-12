/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;

import Business.Organization.EmployeeOrganization;
import static Business.Organization.Organization.Type.Employee;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.EmployeeRole;
import Business.Role.UserRole;
import Business.Species.PlantDirectory;
import Business.Species.PlantSpecies;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tusiyu
 */
public class BotanistReader {
//    private PersonDirectory personDirectory;
    private UserAccountDirectory userDirectory;
    public BotanistReader(){
//        personDirectory = new PersonDirectory();
        userDirectory = new UserAccountDirectory();
    }

    public UserAccountDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserAccountDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

  
     public UserAccountDirectory read() throws IOException  {

             try {
                FileReader fr = new FileReader("Botanist.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        Person p = new Person();
                        p.setName(data[1]);
                        p.setTag("Botanist");
                        userDirectory.createUserAccount(data[0], data[2], p, new EmployeeRole()).setEmail(data[3]);
                      
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return userDirectory;
    }
}
