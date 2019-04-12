/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

import Business.ServicePackage.Immune;
import Business.ServicePackage.ImuDirectory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author tusiyu
 */
public class Student extends Person implements AddStudent {
 
    private String lastname;
    private String fatherName;
    private String motherName;
    private String Birthday;
    private String RegisterDate;
    private int age;
    private ImuDirectory imuDir;
    public int id;
    //private static int count=0;
    private ArrayList<String> VaccineList;
    private String teacher = "";
    private String classr = "";
    private String group = "";

    public Student() {
        super();
        this.lastname =lastname;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.Birthday = Birthday;
        this.RegisterDate = RegisterDate;
        this.age =age;
        this.id = id;
         //count++;
         //id = count;
         imuDir = new ImuDirectory();
         VaccineList = new ArrayList<String>();
         
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public String getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(String RegisterDate) {
        this.RegisterDate = RegisterDate;
    }

    public ImuDirectory getImuDir() {
        return imuDir;
    }

    public void setImuDir(ImuDirectory imuDir) {
        this.imuDir = imuDir;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
	}
 
    public int getAge() {
        return age;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassr() {
        return classr;
    }

    public void setClassr(String classr) {
        this.classr = classr;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    
    //-----other methods-----
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void setAge(Date now, String birthDay) throws ParseException {
        Date birth = parser(birthDay);
        int aa = getMonthDiff(now, birth);
        this.age = aa;
    }
    
    public static int getMonthDiff(Date now, Date birth) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(now);
        c2.setTime(birth);
        if (c1.getTimeInMillis() < c2.getTimeInMillis()) {
            return 0;
        }
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        int yearInterval = year1 - year2;
        if (month1 < month2 || month1 == month2 && day1 < day2) {
            yearInterval--;
        }
        int monthInterval = (month1 + 12) - month2;
        if (day1 < day2) {
            monthInterval--;
        }
        monthInterval %= 12;
        int age = yearInterval * 12 + monthInterval;
        return age;
    }
    
    @Override
    public Date parser(String birthDay) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
        return sdf.parse(birthDay);
    }
    
    //
    @Override
    public ImuDirectory readImu(String immunetype,String period,
            String rit,String ide,String its) {
        
        //ImuDirectory Result = new ImuDirectory();
        
        Immune imu = new Immune();
        imu.setName(immunetype);
        addVaccineList(immunetype);

        imu.setInterval(Integer.parseInt(period));

        //int times = Integer.valueOf(StudentData[8 + i * 5]);
        imu.setInoculationTImes(Integer.parseInt(rit));

        try {
            Date Dateofinoculation = parse(ide);
            imu.setDateofinoculation(Dateofinoculation);
        } catch (ParseException e) {

        }

        //int NumberofInoculationtimes = Integer.valueOf(StudentData[10 + i * 5]);
        imu.setNumberofInoculationtimes(Integer.parseInt(its));

        //Result.getImmuDir().add(imu);
        //}

        //return Result;
        imuDir.getImmuDir().add(imu);
        
        return imuDir;
    }
    
    @Override
    public void addVaccineList(String type) {
        int n = 0;
        for (String s : VaccineList) {
            if (s.equals(type)) {
                n++;
            }
        }
        if (n != VaccineList.size()) {
            VaccineList.add(type);
        }
        if (n == 0) {
            VaccineList.add(type);
        }
    }
    
    @Override
    public Date parse(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD");
        return sdf.parse(date);
    }
    

}
