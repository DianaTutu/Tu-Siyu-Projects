/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;

import Business.Species.PlantDirectory;
import Business.Species.PlantSpecies;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tusiyu
 */
public class PlantReader {
     private PlantDirectory plantDirectory;

    public PlantReader(){
        plantDirectory = new PlantDirectory();
    }

    public PlantDirectory getPlantDirectory() {
        return plantDirectory;
    }

    public void setPlantDirectory(PlantDirectory plantDirectory) {
        this.plantDirectory = plantDirectory;
    }

   
    
    public PlantDirectory read() throws IOException  {

             try {
                FileReader fr = new FileReader("Plants.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        PlantSpecies a = new PlantSpecies();
                        a.setName(data[0]);
                        a.setQuantity(Integer.parseInt(data[1]));
                        a.setGenus(data[2]);
                        a.setMin_temperate(Double.parseDouble(data[3]));
                        a.setMax_temperate(Double.parseDouble(data[4]));
                        plantDirectory.getPlantDir().add(a);
                    }
                    
                    for(PlantSpecies a :plantDirectory.getPlantDir()){
                    if(a.getName().equalsIgnoreCase("TasmaniaTiger")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setPlantIndividualDirectory(aeReader.readTasmaniaTiger());
                    }
                    else if(a.getName().equalsIgnoreCase("Dixter")){
                        IndividualReader pReader = new IndividualReader();
                        a.setPlantIndividualDirectory(pReader.readDixter());
                    }
                    else if(a.getName().equalsIgnoreCase("Blackbird")){
                        IndividualReader bjReader = new IndividualReader();
                        a.setPlantIndividualDirectory(bjReader.readBlackbird());
                    }
                    else if(a.getName().equalsIgnoreCase("Chameleon")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setPlantIndividualDirectory(aeReader.readChameleon());
                    }
                    else if(a.getName().equalsIgnoreCase("Koa")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setPlantIndividualDirectory(aeReader.readKoa());
                    }else if(a.getName().equalsIgnoreCase("Rosemallows")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setPlantIndividualDirectory(aeReader.readRosemallows());
                    }
                }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return plantDirectory;
    }
}
