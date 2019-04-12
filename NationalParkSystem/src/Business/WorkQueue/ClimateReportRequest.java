/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Report.ClimateReport;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author YueZheng
 */
public class ClimateReportRequest extends WorkRequest {

    private ClimateReport report;

    public ClimateReportRequest() {
        super();
        report = new ClimateReport();
    }

    public ClimateReport getReport() {
        return report;
    }

    public void setReport(ClimateReport report) {
        this.report = report;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return String.valueOf(sdf.format(this.getReport().getDate()));
    }

}
