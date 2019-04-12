/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import Business.PersonPackage.Student;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author sdzh4
 */
    public class DayCompare implements Comparator<Student>{
    private Date now;
    private String type;
    public DayCompare(Date date,String type)
    {
        now = date;
        this.type = type;
    }

    @Override
    public int compare(Student o1, Student o2) {
       int o1d =o1.getImuDir().getSpecifiedType(type).getLeftdays(now);
       int o2d = o2.getImuDir().getSpecifiedType(type).getLeftdays(now);
         if ( o1d<o2d) return -1;
        if (o1d>o2d) return 1;
        else return 0;
    }

    
}
