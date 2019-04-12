/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Report;

/**
 *
 * @author tusiyu
 */
public class AnimalReport {
    
    private String name;
    private Double min_bp;
    private Double max_bp;
    private Double body_temp;
    private Double weight;
    private Double height;
    private String researcher;
    private String status;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMin_bp() {
        return min_bp;
    }

    public void setMin_bp(Double min_bp) {
        this.min_bp = min_bp;
    }

    public Double getMax_bp() {
        return max_bp;
    }

    public void setMax_bp(Double max_bp) {
        this.max_bp = max_bp;
    }

    public Double getBody_temp() {
        return body_temp;
    }

    public void setBody_temp(Double body_temp) {
        this.body_temp = body_temp;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }

}
