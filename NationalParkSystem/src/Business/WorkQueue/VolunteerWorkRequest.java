/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.project.Project;

/**
 *
 * @author tusiyu
 */
public class VolunteerWorkRequest extends ProjectWorkRequest{
    
    
    private int availableNum;
    private String reminder;

//    public VolunteerWorkRequest(Project project){
//        availableNum = project.getMemberNum();
//    }
    public int getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(int availableNum) {
        this.availableNum = availableNum;
    }


    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    @Override
    public  String toString(){
        return this.getProject().getProjectName();
    }
    
}
