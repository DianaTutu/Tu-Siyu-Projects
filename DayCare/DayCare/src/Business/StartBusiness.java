/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.PersonPackage.Student;
import Business.PersonPackage.StudentDirectory;
import Business.PersonPackage.Teacher;
import Business.PersonPackage.TeacherDirectory;
import Business.ServicePackage.ClassRoom;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ferrari
 */
public class StartBusiness {

    private StudentDirectory studentDirectory;
    private Date now;
    private TeacherDirectory teacherDirectory;
    private ClassRoom classroom;
    private StudentDirectory slist6;
    private StudentDirectory slist13;
    private StudentDirectory slist25;
    private StudentDirectory slist36;
    private StudentDirectory slist48;
    private StudentDirectory slist60;
    private TeacherDirectory t6;
    private TeacherDirectory t13;
    private TeacherDirectory t25;
    private TeacherDirectory t36;
    private TeacherDirectory t48;
    private TeacherDirectory t60;
    
    //private ImuDirectory imudirectory;

    public StartBusiness() {

        this.studentDirectory = new StudentDirectory();
        this.now = new Date();
        this.teacherDirectory = new TeacherDirectory();
        this.classroom = new ClassRoom();
        this.slist6 = new StudentDirectory();
        this.slist13 = new StudentDirectory();
        this.slist25 = new StudentDirectory();
        this.slist36 = new StudentDirectory();
        this.slist48 = new StudentDirectory();
        this.slist60 = new StudentDirectory();
        
        this.t6 = new TeacherDirectory();
        this.t13 = new TeacherDirectory();
        this.t25 = new TeacherDirectory();
        this.t36 = new TeacherDirectory();
        this.t48 = new TeacherDirectory();
        this.t60 = new TeacherDirectory();
        
        
        //classifyStu();
        //classifyTea(); 
        //assign();
        //this.imudirectory = new ImuDirectory();
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }
    
// other methods    
    
    public void classifyStu(){

        for(Student s : studentDirectory.getStuDir()){
            
            int compare = s.getAge();
            if(6<=compare && 12>=compare) {
                
                Student s1 = slist6.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());//set id for other "slistXXX"
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            if(13<=compare && 24>=compare) {
                
                Student s1 = slist13.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            if(25<=compare && 35>=compare) {
                
                Student s1 = slist25.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            if(36<=compare && 47>=compare) {
                
                Student s1 = slist36.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            if(48<=compare && 59>=compare) {
                
                Student s1 = slist48.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            if(60<=compare) {
                
                Student s1 = slist60.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setId(s.getId());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
            
            /*
            if(6<=compare && 12>=compare) {
                
                Student s1 = slist60.addStudent();
                
                s1.setFirstname(s.getFirstname());
                s1.setLastname(s.getLastname());
                s1.setAge(compare);
                s1.setBirthday(s.getBirthday());
                s1.setRegisterDate(s.getRegisterDate());
                s1.setFatherName(s.getFatherName());
                s1.setMotherName(s.getMotherName());
                s1.setImuDir(s.getImuDir());
                
            }
                    */
        
        }
        
    }
    
    public void classifyTea(){
       
        for(Teacher tea : teacherDirectory.getTeaDir()){
            if(tea.getMin_age()==6)
            {
               Teacher t = t6.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
               
            }
            if(tea.getMin_age()==13)
            {
               Teacher t = t13.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
            }
            if(tea.getMin_age()==25)
            {
               Teacher t = t25.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
            }
            if(tea.getMin_age()==36)
            {
               Teacher t = t36.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
            }
            if(tea.getMin_age()==48)
            {
               Teacher t = t48.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
            }if(tea.getMin_age()==60)
            {
               Teacher t = t60.addTeacher();
               
               t.setFirstname(tea.getFirstname());
               t.setClaseroom(tea.getClaseroom());
               t.setGroup(tea.getGroup());
               t.setMax_age(tea.getMax_age());
               t.setMax_s(tea.getMax_s());
               t.setMin_age(tea.getMin_age());
            }           
        }
    }

    public void assign() {
        for (Teacher t : t6.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist6.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        
        for (Teacher t : t13.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist13.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        
        for (Teacher t : t25.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist25.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        
        for (Teacher t : t36.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist36.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        
        for (Teacher t : t48.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist48.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        
        for (Teacher t : t60.getTeaDir()){
            int i = 0;
            while(i<t.getMax_s()){
                for (Student s : slist60.getStuDir()){
                    s.setTeacher(t.getFirstname());
                    s.setClassr(t.getClaseroom());
                    s.setGroup(t.getGroup());
                    //when this kind of teachers' avaliable numbers weren't enough, those students left behind would be deleted as line 269 running
                }
                i++;
                
            }
            
        }
        //studentDirectory = new StudentDirectory();
        studentDirectory.getStuDir().clear();
        studentDirectory.getStuDir().addAll(slist6.getStuDir());
        studentDirectory.getStuDir().addAll(slist13.getStuDir());
        studentDirectory.getStuDir().addAll(slist25.getStuDir());
        studentDirectory.getStuDir().addAll(slist36.getStuDir());
        studentDirectory.getStuDir().addAll(slist48.getStuDir());
        studentDirectory.getStuDir().addAll(slist60.getStuDir());
        //studentDirectory.getStuDir().addAll(slist13.getStuDir());
        
    }
}
