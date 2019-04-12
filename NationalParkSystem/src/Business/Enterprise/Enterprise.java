/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Species.AnimalDirectory;
import Business.Species.PlantDirectory;
import Business.project.ProjectDirectory;
import Business.Report.ReportDirectory;
import Business.WorkQueue.AbnormalAnimalsRequest;
import Business.WorkQueue.AbnormalPlantsRequest;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private AnimalDirectory animalDirectory;//new
    private PlantDirectory plantDirectory;
    private ProjectDirectory projectDirectory;
    private ReportDirectory reportDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        animalDirectory = new AnimalDirectory();
        plantDirectory = new PlantDirectory();
        projectDirectory = new ProjectDirectory();
        reportDirectory = new ReportDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        NationalPark("NationalPark"), Government("Government");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    public void setAnimalDirectory(AnimalDirectory animalDirectory) {
        this.animalDirectory = animalDirectory;
    }

    public PlantDirectory getPlantDirectory() {
        return plantDirectory;
    }

    public void setPlantDirectory(PlantDirectory plantDirectory) {
        this.plantDirectory = plantDirectory;
    }

    public ProjectDirectory getProjectDirectory() {
        return projectDirectory;
    }

    public void setProjectDirectory(ProjectDirectory projectDirectory) {
        this.projectDirectory = projectDirectory;
    }

    public ReportDirectory getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ReportDirectory reportDirectory) {
        this.reportDirectory = reportDirectory;
    }

    
    

}
