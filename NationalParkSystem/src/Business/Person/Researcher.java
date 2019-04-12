/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.project.ProjectDirectory;

/**
 *
 * @author tusiyu
 */
public class Researcher extends Person {
    
    private ProjectDirectory projectDir;
    public Researcher(){
        super();
        projectDir = new ProjectDirectory();
    }

    public ProjectDirectory getProjectDir() {
        return projectDir;
    }

    public void setProjectDir(ProjectDirectory projectDir) {
        this.projectDir = projectDir;
    }
    
}
