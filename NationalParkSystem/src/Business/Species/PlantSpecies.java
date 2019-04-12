/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Species;

import java.util.ArrayList;

/**
 *
 * @author tusiyu
 */
public class PlantSpecies extends Species {


    private String id;
    private int number;
    private static int count = 0;
    private double min_temperate;
    private double max_temperate;
    private PlantIndividualDirectory plantIndividualDirectory;

    public PlantSpecies() {
        super();
       number = count++;
       id = "P"+ number;
    }
 

    public double getMin_temperate() {
        return min_temperate;
    }

    public void setMin_temperate(double min_temperate) {
        this.min_temperate = min_temperate;
    }

    public double getMax_temperate() {
        return max_temperate;
    }

    public void setMax_temperate(double max_temperate) {
        this.max_temperate = max_temperate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlantIndividualDirectory getPlantIndividualDirectory() {
        return plantIndividualDirectory;
    }

    public void setPlantIndividualDirectory(PlantIndividualDirectory plantIndividualDirectory) {
        this.plantIndividualDirectory = plantIndividualDirectory;
    }

    
    @Override
    public String toString(){
       return id;
    }
}
