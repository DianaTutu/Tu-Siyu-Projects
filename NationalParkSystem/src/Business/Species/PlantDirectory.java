/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Species;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class PlantDirectory {
    
    private List<PlantSpecies> plantDir;

    public PlantDirectory() {
        plantDir = new ArrayList<>();
    }

    public List<PlantSpecies> getPlantDir() {
        return plantDir;
    }

    public void setPlantDir(List<PlantSpecies> plantDir) {
        this.plantDir = plantDir;
    }
    
       public void delete(PlantSpecies v)
    {
         plantDir.remove(v);
    }

   
}
