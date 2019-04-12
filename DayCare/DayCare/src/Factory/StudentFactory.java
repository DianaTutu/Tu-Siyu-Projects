/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Business.PersonPackage.Person;
import Business.PersonPackage.Student;

/**
 *
 * @author tusiyu
 */
public class StudentFactory extends AbstractPeopleAbstractAPI {
    @Override
    public Person getPerson(){
        return new Student();
    }
    
}
