/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author tusiyu
 */
public class TeacherDirectory {
    
    private ArrayList<Teacher> teaDir;
    private HashMap<String,ArrayList<Student>> T2S;

    public TeacherDirectory() {
        teaDir = new ArrayList<Teacher>();
        T2S = new HashMap<String,ArrayList<Student>>();
    }

    public ArrayList<Teacher> getTeaDir() {
        return teaDir;
    }
    
     public Teacher addTeacher(){
        Teacher newTeacher  = new Teacher();
        teaDir.add(newTeacher);
        return newTeacher;
    }
     
    public HashMap<String, ArrayList<Student>> getT2S() {
        return T2S;
    }

    public void setT2S(HashMap<String, ArrayList<Student>> T2S) {
        this.T2S = T2S;
    }
    
    /*
    public void addTeacher(Teacher t){
        teaDir.add(t);
    }
    */
    
}
