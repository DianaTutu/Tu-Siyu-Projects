/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reader;

import Business.Species.AnimalDirectory;
import Business.Species.AnimalIndividualDirectory;
import Business.Species.AnimalSpecies;
import Business.Species.IndividualA;
import Business.Species.IndividualP;
import Business.Species.PlantIndividualDirectory;
import Business.Species.PlantSpecies;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tusiyu
 */
public class IndividualReader {
     
    private AnimalIndividualDirectory individualDirectory;
    private PlantIndividualDirectory individualDirectory1;

    public IndividualReader(){
        individualDirectory = new AnimalIndividualDirectory();
        individualDirectory1 = new PlantIndividualDirectory();
    }

    public AnimalIndividualDirectory getIndividualDirectory() {
        return individualDirectory;
    }

    public void setIndividualDirectory(AnimalIndividualDirectory individualDirectory) {
        this.individualDirectory = individualDirectory;
    }    

    public PlantIndividualDirectory getIndividualDirectory1() {
        return individualDirectory1;
    }

    public void setIndividualDirectory1(PlantIndividualDirectory individualDirectory1) {
        this.individualDirectory1 = individualDirectory1;
    }
    
    
    public AnimalIndividualDirectory readElephant() throws IOException  {

             try {
                FileReader fr = new FileReader("AfricanElephant.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     public AnimalIndividualDirectory readPanda() throws IOException  {

             try {
                FileReader fr = new FileReader("Panda.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     
     public AnimalIndividualDirectory readBlackJaguar() throws IOException  {

             try {
                FileReader fr = new FileReader("BlackJaguar.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     
     public AnimalIndividualDirectory readGorilla() throws IOException  {

             try {
                FileReader fr = new FileReader("Gorilla.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     
     public AnimalIndividualDirectory readOrangutan() throws IOException  {
             try {
                FileReader fr = new FileReader("Orangutan.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     
     public AnimalIndividualDirectory readRedfox() throws IOException  {
             try {
                FileReader fr = new FileReader("Redfox.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualA a = new IndividualA();
                        a.setName(data[0]);
                        a.setMin_bp(Double.parseDouble(data[1]));
                        a.setMax_bp(Double.parseDouble(data[2]));
                        a.setTemp(Double.parseDouble(data[3]));                        
                        a.setWeight(Double.parseDouble(data[4]));                       
                        a.setHeight(Double.parseDouble(data[5]));
                        individualDirectory.getAnimalList().add(a);   
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory;
    }
     
     
       public PlantIndividualDirectory readTasmaniaTiger() throws IOException  {
             try {
                FileReader fr = new FileReader("TasmaniaTiger.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
        public PlantIndividualDirectory readDixter() throws IOException  {
             try {
                FileReader fr = new FileReader("Dixter.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
         public PlantIndividualDirectory readBlackbird() throws IOException  {
             try {
                FileReader fr = new FileReader("Blackbird.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
          public PlantIndividualDirectory readChameleon() throws IOException  {
             try {
                FileReader fr = new FileReader("Chameleon.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
           public PlantIndividualDirectory readKoa() throws IOException  {
             try {
                FileReader fr = new FileReader("Koa.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
            public PlantIndividualDirectory readRosemallows() throws IOException  {
             try {
                FileReader fr = new FileReader("Rosemallows.txt");
                BufferedReader br = new BufferedReader(fr);
                String inputLine = null;
                while((inputLine = br.readLine())!=null) {
                    if(inputLine.equals("")){
                    continue;
                    }
                    else{
                        String[] data = inputLine.split(",");
                        IndividualP a = new IndividualP();
                        a.setName(data[0]);
                        a.setMin_temp(Double.parseDouble(data[1]));
                        a.setMax_temp(Double.parseDouble(data[2]));
                        individualDirectory1.getPlantList().add(a);
                    }
                       			}
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        return individualDirectory1;
    }
          
              
}
