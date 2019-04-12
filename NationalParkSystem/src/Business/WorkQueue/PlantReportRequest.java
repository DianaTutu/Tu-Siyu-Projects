/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Report.PlantReport;

/**
 *
 * @author tusiyu
 */
public class PlantReportRequest extends WorkRequest{
    private PlantReport report;
    
    public PlantReportRequest(){
        super();
        report = new PlantReport();
    }

    public PlantReport getReport() {
        return report;
    }

    public void setReport(PlantReport report) {
        this.report = report;
    }

    @Override
    public String toString(){
        return this.getReport().getName();
}
}
