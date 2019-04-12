/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServicePackage;

import Business.PersonPackage.Teacher;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class Group {
    private ArrayList <Teacher> teacherDir;

    public Group() {
        teacherDir = new ArrayList<>();
    }

    public ArrayList<Teacher> getTeacherDir() {
        return teacherDir;
    }
    
    
    
}
