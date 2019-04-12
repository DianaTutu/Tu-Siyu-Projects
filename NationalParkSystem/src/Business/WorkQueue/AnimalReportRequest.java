/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Report.AnimalReport;

/**
 *
 * @author tusiyu
 */
public class AnimalReportRequest extends WorkRequest{
    
    private AnimalReport report;
    
    public AnimalReportRequest(){
        super();
        report = new AnimalReport();
    }

    public AnimalReport getReport() {
        return report;
    }

    public void setReport(AnimalReport report) {
        this.report = report;
    }

    @Override
    public String toString(){
        return this.getMessage();
}
}