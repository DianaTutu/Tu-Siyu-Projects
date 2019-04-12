/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import java.util.Comparator;

/**
 *
 * @author sdzh4
 */
public class DayCompare2 implements Comparator<Object[]>{

    @Override
    public int compare(Object[] o1, Object[] o2) {
        if((int)o1[4]<(int)o2[4]) return 1;
        if((int)o1[4]>(int)o2[4]) return -1;
        else return 0;
        
    }
    
}
