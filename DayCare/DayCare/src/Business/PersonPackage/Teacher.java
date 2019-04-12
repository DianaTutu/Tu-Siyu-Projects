package Business.PersonPackage;

import Business.PersonPackage.StudentDirectory;
import Business.PersonPackage.Person;

public class Teacher extends Person{
    //private int id;
   // private static int count =0;
    private StudentDirectory stuDir;
    private int min_age;
    private int max_age;
    private String group;
    private String claseroom;
    private int max_s;
	
	public Teacher () {
		super();
                this.firstname = firstname;
                this.max_age = max_age;
                this.min_age = min_age;
                this.group = group;
                this.claseroom = claseroom;
                this.max_s = max_s;
                //count++;
                //stuDir = new StudentDirectory();               
	}

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getClaseroom() {
        return claseroom;
    }

    public void setClaseroom(String claseroom) {
        this.claseroom = claseroom;
    }

    public StudentDirectory getStuDir() {
        return stuDir;
    }

    /*public int getId() {
        id = count;
        return id;
    }*/

    public int getMax_s() {
        return max_s;
    }

    public void setMax_s(int max_s) {
        this.max_s = max_s;
    }

        
}
