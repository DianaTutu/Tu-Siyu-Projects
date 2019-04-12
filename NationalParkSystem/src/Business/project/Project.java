/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.project;

import Business.Species.Species;

/**
 *
 * @author tusiyu
 */
public class Project {
    
    private String id;
    private int number;
    private static int count=1;
    private String projectName;
    private String researcher;
    private String description;
    private int memberNum;
    private String status;
    private int availableNum;

   public Project(){
      number = count++;
      availableNum = this.getMemberNum();
   }
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    public String getId() {
        return "Project "+number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(int availableNum) {
        this.availableNum = availableNum;
    }

    
    
    @Override
    public String toString(){
        return this.getProjectName();
    }
   
    
   
}
