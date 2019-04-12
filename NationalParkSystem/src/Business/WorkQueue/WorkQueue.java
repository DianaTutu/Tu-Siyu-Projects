/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<ProjectWorkRequest> projectRequestList;
    private ArrayList<VolunteerWorkRequest> volunteerRequestList;
    private ArrayList<FundingRequest> fundingRequestList;
    private ArrayList<AnimalReportRequest> animalReportRequestList;
    private ArrayList<PlantReportRequest> plantReportRequestList;
    private ArrayList<ClimateReportRequest> climateReportRequests;
    private ArrayList<ReservationWorkRequest> reservationWorkRequests;
    private AbnormalAnimalsRequest abnormalAnimalsRequest;
    private AbnormalPlantsRequest abnormalPlantsRequest;
    private ArrayList<EmergencyRequest> emergencyRequest;
    private ArrayList<CommentsWorkRequest> commentsWorkRequests;
    private ArrayList<DonationRequest> donationList;

    public WorkQueue() {
        workRequestList = new ArrayList();
        projectRequestList = new ArrayList<>();
        volunteerRequestList = new ArrayList<>();
        fundingRequestList = new ArrayList<>();
        animalReportRequestList = new ArrayList<>();
        plantReportRequestList = new ArrayList<>();
        climateReportRequests = new ArrayList<>();
        reservationWorkRequests = new ArrayList<>();
        abnormalAnimalsRequest = new AbnormalAnimalsRequest();
        abnormalPlantsRequest = new AbnormalPlantsRequest();
        commentsWorkRequests = new ArrayList<>();
        emergencyRequest =  new ArrayList<>();
        donationList = new ArrayList<>();
    }

    public AbnormalAnimalsRequest getAbnormalAnimalsRequest() {
        return abnormalAnimalsRequest;
    }

    public AbnormalPlantsRequest getAbnormalPlantsRequest() {
        return abnormalPlantsRequest;
    }


    public ArrayList<EmergencyRequest> getEmergencyRequest() {
        return emergencyRequest;
    }

    public ArrayList<CommentsWorkRequest> getCommentsWorkRequests() {
        return commentsWorkRequests;
    }

    public ArrayList<DonationRequest> getDonationList() {
        return donationList;
    }
    

   

    public ArrayList<ReservationWorkRequest> getReservationWorkRequests() {
        return reservationWorkRequests;
    }

    public ArrayList<ClimateReportRequest> getClimateReportRequests() {
        return climateReportRequests;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<ProjectWorkRequest> getProjectRequestList() {
        return projectRequestList;
    }

    public ArrayList<VolunteerWorkRequest> getVolunteerRequestList() {
        return volunteerRequestList;
    }

    public ArrayList<FundingRequest> getFundingRequestList() {
        return fundingRequestList;
    }

    public ArrayList<AnimalReportRequest> getAnimalReportRequestList() {
        return animalReportRequestList;
    }

    public ArrayList<PlantReportRequest> getPlantReportRequestList() {
        return plantReportRequestList;
    }

}
