/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Species;

/**
 *
 * @author tusiyu
 */
public class AnimalSpecies extends Species {
    
    private String id;
    private int number;
    private static int count = 0;
    private double min_bloodPressure;
    private double max_bloodPressure;
    private double min_temperature;
    private double max_temperature;
    private double min_weight;
    private double max_weight;
    private double min_height;
    private double max_height;
    private AnimalIndividualDirectory animalIndividualDir;
    
    public AnimalSpecies() {
        super();
        number = count++;
        id = "A"+ number;
        
    }
    public double getMin_bloodPressure() {
        return min_bloodPressure;
    }

    public void setMin_bloodPressure(double min_bloodPressure) {
        this.min_bloodPressure = min_bloodPressure;
    }

    public double getMax_bloodPressure() {
        return max_bloodPressure;
    }

    public void setMax_bloodPressure(double max_bloodPressure) {
        this.max_bloodPressure = max_bloodPressure;
    }

    public double getMin_temperature() {
        return min_temperature;
    }

    public void setMin_temperature(double min_temperature) {
        this.min_temperature = min_temperature;
    }

    public double getMax_temperature() {
        return max_temperature;
    }

    public void setMax_temperature(double max_temperature) {
        this.max_temperature = max_temperature;
    }

    public double getMin_weight() {
        return min_weight;
    }

    public void setMin_weight(double min_weight) {
        this.min_weight = min_weight;
    }

    public double getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(double max_weight) {
        this.max_weight = max_weight;
    }

    public double getMin_height() {
        return min_height;
    }

    public void setMin_height(double min_height) {
        this.min_height = min_height;
    }

    public double getMax_height() {
        return max_height;
    }

    public void setMax_height(double max_height) {
        this.max_height = max_height;
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

    public AnimalIndividualDirectory getAnimalIndividualDir() {
        return animalIndividualDir;
    }

    public void setAnimalIndividualDir(AnimalIndividualDirectory animalIndividualDir) {
        this.animalIndividualDir = animalIndividualDir;
    }

        
    @Override
    public String toString(){
        return id;
    }
   

    
}
