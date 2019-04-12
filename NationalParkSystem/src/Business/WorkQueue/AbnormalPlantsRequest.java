/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author YueZheng
 */
public class AbnormalPlantsRequest {

    private ArrayList<PlantReportRequest> plantReportRequests;

    public AbnormalPlantsRequest() {
        
        plantReportRequests=new ArrayList<>();

    }

    public ArrayList<PlantReportRequest> getPlantReportRequests() {
        return plantReportRequests;
    }
    
    

}
