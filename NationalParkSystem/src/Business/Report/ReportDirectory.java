/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Report;

import Business.Species.AnimalDirectory;
import Business.Species.AnimalIndividualDirectory;
import Business.Species.AnimalSpecies;
import Business.Species.IndividualA;
import Business.Species.IndividualP;
import Business.Species.PlantDirectory;
import Business.Species.PlantSpecies;
import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class ReportDirectory {
    
    private ArrayList<AnimalReport> reportDirectory;
    private ArrayList<PlantReport> reportDirectory1;
    private ArrayList<ClimateReport> climateReports;
    
    public ReportDirectory(){
        reportDirectory = new ArrayList<>();
        reportDirectory1 = new ArrayList<>();
        climateReports=new ArrayList<>();
    }

    public ArrayList<AnimalReport> getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ArrayList<AnimalReport> reportDirectory) {
        this.reportDirectory = reportDirectory;
    }

    public ArrayList<PlantReport> getReportDirectory1() {
        return reportDirectory1;
    }

    public void setReportDirectory1(ArrayList<PlantReport> reportDirectory1) {
        this.reportDirectory1 = reportDirectory1;
    }

    public ArrayList<ClimateReport> getClimateReports() {
        return climateReports;
    }
 
    
    public ArrayList<AnimalReport> ReportList(AnimalDirectory animalDirectory){
        for(AnimalSpecies s:animalDirectory.getAnimalList())
            for(IndividualA a:s.getAnimalIndividualDir().getAnimalList()){
                AnimalReport r = new AnimalReport();
                r.setName(a.getName());
                r.setMin_bp(a.getMin_bp());
                r.setMax_bp(a.getMax_bp());
                r.setBody_temp(a.getTemp());
                r.setWeight(a.getWeight());
                r.setHeight(a.getHeight());
                r.setStatus("Unchecked");
                r.setResearcher("Pending");
                reportDirectory.add(r);
        }      
        
        return reportDirectory;
    }   
    
     public ArrayList<PlantReport> ReportList1(PlantDirectory plantDirectory){
        for(PlantSpecies s:plantDirectory.getPlantDir())
            for(IndividualP a:s.getPlantIndividualDirectory().getPlantList()){
                PlantReport r = new PlantReport();
                r.setName(a.getName());
                r.setMin_t(a.getMin_temp());
                r.setMax_t(a.getMax_temp());
                r.setStatus("Unchecked");
                r.setResearcher("Pending");
                reportDirectory1.add(r);
        }      
        
        return reportDirectory1;
    }   

}
