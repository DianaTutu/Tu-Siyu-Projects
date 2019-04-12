/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;

import Business.Person.Person;
import Business.Role.EmployeeRole;
import Business.Role.FieldRole;
import Business.UserAccount.UserAccountDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tusiyu
 */
public class FieldGroupReader {
     private UserAccountDirectory userDirectory;
    public FieldGroupReader(){
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
                FileReader fr = new FileReader("FieldGroup.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        Person p = new Person();
                        p.setName(data[0]);
                        p.setTag("FieldGroup");
                        userDirectory.createUserAccount(data[0], data[1], p, new EmployeeRole());
                      
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return userDirectory;
    }
}
