/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;
import Business.Species.AnimalSpecies;
import Business.Species.AnimalDirectory;
import Business.Species.IndividualA;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tusiyu
 */
public class AnimalReader {
    
    private AnimalDirectory animalDirectory;

    public AnimalReader(){
        animalDirectory = new AnimalDirectory();
    }

    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    public void setAnimalDirectory(AnimalDirectory animalDirectory) {
        this.animalDirectory = animalDirectory;
    }
    
    
    public AnimalDirectory read() throws IOException  {

             try {
                FileReader fr = new FileReader("Animals.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        AnimalSpecies a = new AnimalSpecies();
                        a.setName(data[0]);
                        a.setQuantity(Integer.parseInt(data[1]));
                        a.setGenus(data[2]);
                        a.setMin_bloodPressure(Double.parseDouble(data[3]));
                        a.setMax_bloodPressure(Double.parseDouble(data[4]));
                        a.setMin_temperature(Double.parseDouble(data[5]));
                        a.setMax_temperature(Double.parseDouble(data[6]));
                        a.setMin_weight(Double.parseDouble(data[7]));
                        a.setMax_weight(Double.parseDouble(data[8]));
                        a.setMin_height(Double.parseDouble(data[9]));
                        a.setMax_height(Double.parseDouble(data[10]));
                        animalDirectory.getAnimalList().add(a);
                    }
                    
                }
                for(AnimalSpecies a :animalDirectory.getAnimalList()){
                    if(a.getName().equalsIgnoreCase("AfricanElephant")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setAnimalIndividualDir(aeReader.readElephant());
                    }
                    else if(a.getName().equalsIgnoreCase("Panda")){
                        IndividualReader pReader = new IndividualReader();
                        a.setAnimalIndividualDir(pReader.readPanda());
                    }
                    else if(a.getName().equalsIgnoreCase("BlackJaguar")){
                        IndividualReader bjReader = new IndividualReader();
                        a.setAnimalIndividualDir(bjReader.readBlackJaguar());
                    }
                    else if(a.getName().equalsIgnoreCase("Gorilla")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setAnimalIndividualDir(aeReader.readGorilla());
                    }
                    else if(a.getName().equalsIgnoreCase("Orangutan")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setAnimalIndividualDir(aeReader.readOrangutan());
                    }else if(a.getName().equalsIgnoreCase("Redfox")){
                        IndividualReader aeReader = new IndividualReader();
                        a.setAnimalIndividualDir(aeReader.readRedfox());
                    }
                }
              
//                for(IndividualA ad:animalDirectory.getAnimalList().get(0).getAnimalIndividualDir().getAnimalList()){
//                    System.out.println(ad.getName());
//                }
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return animalDirectory;
    }
}
