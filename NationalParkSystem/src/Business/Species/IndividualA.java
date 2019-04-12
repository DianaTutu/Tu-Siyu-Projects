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
public class IndividualA {
    
    private int id;
    private String name;
    private double min_bp;
    private double max_bp;
    private double temp;
    private double weight;
    private double height;
    private static int count = 0;
    
    public  IndividualA(){
        id = count++;
    }
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMin_bp() {
        return min_bp;
    }

    public void setMin_bp(double min_bp) {
        this.min_bp = min_bp;
    }

    public double getMax_bp() {
        return max_bp;
    }

    public void setMax_bp(double max_bp) {
        this.max_bp = max_bp;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   @Override
   public String toString(){
        return "Animal "+this.id;
   }
}
