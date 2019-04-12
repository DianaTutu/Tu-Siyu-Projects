/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class ProjectDirectory {
    
    private List<Project> projectDir;
    
    public ProjectDirectory(){
        projectDir = new ArrayList<>();
    }

    public List<Project> getProjectDir() {
        return projectDir;
    }

    public void setProjectDir(List<Project> projectDir) {
        this.projectDir = projectDir;
    }
    
}
