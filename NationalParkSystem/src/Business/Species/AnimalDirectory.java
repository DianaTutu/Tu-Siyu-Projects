/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Species;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class AnimalDirectory {
    
   private List<AnimalSpecies> animalList;
   
    public AnimalDirectory(){
        animalList = new ArrayList();
        
    }
    public List<AnimalSpecies> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<AnimalSpecies> animalList) {
        this.animalList = animalList;
    }
     public void delete(AnimalSpecies v)
    {
         animalList.remove(v);
    }
    
}
