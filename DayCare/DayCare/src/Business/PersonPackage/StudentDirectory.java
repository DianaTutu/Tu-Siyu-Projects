/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

//import Business.PersonPackage.Student;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class StudentDirectory {
    
    //private Student student;
    private ArrayList<Student> stuDir;

    public StudentDirectory() {
        
        this.stuDir = new ArrayList<Student>();
        //this.student = new Student();
    }

    public ArrayList<Student> getStuDir() {
        return stuDir;
    }

    public void setStuDir(ArrayList<Student> stuDir) {
        this.stuDir = stuDir;
    }

    //-----other methods-----
    public Student addStudent(){
        Student newStudent = new Student();
        stuDir.add(newStudent);
        return newStudent;
    }
    
    public void deleteStudent(Student student){
        stuDir.remove(student);
    }
    
    public Student searchStudent(String name){  //Search by name
        for(Student s : this.stuDir){
            if(s.getFirstname().equals(name)) {  //may not work unless all parameters are correct 
                return s;
            }
        }
        return null;
    }
    
    public ArrayList<Student> getImmList(String type){
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student stu:stuDir)
        {
            if(stu.getImuDir().getSpecifiedType(type)!=null)
            {
                list.add(stu);
            }
        }
        return list;
    }
    
    
}
