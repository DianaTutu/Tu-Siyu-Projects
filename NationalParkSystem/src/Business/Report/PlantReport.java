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
public class PlantReport {

    private String name;
    private Double min_t;
    private Double max_t;
    // 1 for abnormal, 0 for normal, 2 for unchecked:
    private int checkAbnormal=2;
    //
    private String status;
    private String researcher;    
    private String reportString;

    public String getReportString() {
        return reportString;
    }

    public void setReportString(String reportString) {
        this.reportString = reportString;
    }

    public String getName() {
        return name;
    }

    public int getCheckAbnormal() {
        return checkAbnormal;
    }

    public void setCheckAbnormal(int check) {
        this.checkAbnormal = check;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return this.getName();
    }
}
