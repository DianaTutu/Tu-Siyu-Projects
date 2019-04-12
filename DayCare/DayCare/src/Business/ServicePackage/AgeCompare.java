/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import Business.PersonPackage.Student;
import java.util.Comparator;

/**
 *
 * @author sdzh4
 */
public class AgeCompare implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()<o2.getAge()) return -1;
        if(o1.getAge()>o2.getAge()) return 1;
        else return 0;
    }
    
}
