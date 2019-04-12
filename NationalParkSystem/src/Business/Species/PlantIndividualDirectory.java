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
public class PlantIndividualDirectory {
    
    private ArrayList<IndividualP> plantList;
    
    public PlantIndividualDirectory(){
        plantList = new ArrayList<>();
    }

    public ArrayList<IndividualP> getPlantList() {
        return plantList;
    }

    public void setPlantList(ArrayList<IndividualP> plantList) {
        this.plantList = plantList;
    }
    public IndividualP createPlant(){
        IndividualP p = new IndividualP();
      
       plantList.add(p);
        return p;
    }
}
