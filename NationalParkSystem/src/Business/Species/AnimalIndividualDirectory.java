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
public class AnimalIndividualDirectory {
    
    private ArrayList<IndividualA> animalList;
    
    public AnimalIndividualDirectory(){
        animalList = new ArrayList<>();
    }

    public ArrayList<IndividualA> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<IndividualA> animalList) {
        this.animalList = animalList;
    }
    
    public IndividualA createAnimal(){
        IndividualA a = new IndividualA();
       // a.setName(name);
       // a.setHeight(height);
       // a.setMax_bp(max_bp);
       // a.setMin_bp(min_bp);
        //a.setTemp(temp);
        //a.setWeight(weight);
        animalList.add(a);
        return a;
    }
    
    
}

