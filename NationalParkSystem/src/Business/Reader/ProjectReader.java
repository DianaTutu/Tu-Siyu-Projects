/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;

import Business.Species.PlantSpecies;
import Business.project.Project;
import Business.project.ProjectDirectory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tusiyu
 */
public class ProjectReader {
    private ProjectDirectory projectDirectory;
    public ProjectReader(){
        projectDirectory = new ProjectDirectory();
    }

    public ProjectDirectory getProjectDirectory() {
        return projectDirectory;
    }

    public void setProjectDirectory(ProjectDirectory projectDirectory) {
        this.projectDirectory = projectDirectory;
    }
    
    public ProjectDirectory read() throws IOException{
          try {
                FileReader fr = new FileReader("Projects.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split("/");
                        Project p = new Project();
                        p.setProjectName(data[0]);
                        p.setMemberNum(Integer.parseInt(data[1]));
                        p.setDescription(data[2]);
                        p.setResearcher("");
                        p.setStatus("Not assigned");
                        p.setAvailableNum(p.getMemberNum());
                        projectDirectory.getProjectDir().add(p);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return projectDirectory;
    }

    
}
