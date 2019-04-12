/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Report;

import java.util.Date;


/**
 *
 * @author YueZheng
 */
public class ClimateReport {

    private int id;
    private double min_t;
    private double max_t;
    private Date date;
    private double humidity;
    private String status;
    private String researcher;
    private static int count = 1;

    public ClimateReport() {
        id = count++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Double getMin_t() {
        return min_t;
    }

    public void setMin_t(Double min_t) {
        this.min_t = min_t;
    }

    public Double getMax_t() {
        return max_t;
    }

    public void setMax_t(Double max_t) {
        this.max_t = max_t;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
