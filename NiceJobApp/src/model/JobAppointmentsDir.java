/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class JobAppointmentsDir {
    
    ArrayList<JobAppointments> jobAppointmentsList;

    public ArrayList<JobAppointments> getJobAppointmentsList() {
        return jobAppointmentsList;
    }

    public void setJobAppointmentsList(ArrayList<JobAppointments> jobAppointmentsList) {
        this.jobAppointmentsList = jobAppointmentsList;
    }

    public JobAppointmentsDir() {
        this.jobAppointmentsList = new ArrayList<>();
    }
    
    public void clearAllJobApps(){
        jobAppointmentsList.clear();
    }

    public JobAppointments addJobAppointment(){
        JobAppointments newJobApp = new JobAppointments();
        jobAppointmentsList.add(newJobApp);
        return newJobApp;
    }
    
    public void deleteCompDepartment(JobAppointments delJobAppointment){
        jobAppointmentsList.remove(delJobAppointment);
    }
    
    public ArrayList<JobAppointments> searchByAppId(Integer appId){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(jobApp.getApplicationId().equals(appId)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> searchBySevisId(String sevisId){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(jobApp.getSevisId().equalsIgnoreCase(sevisId)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> searchByCompanyId(Integer compId){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(jobApp.getCompanyId().equals(compId)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> searchByJobListingId(Integer jobList){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(jobApp.getJobListingsId().equals(jobList)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> searchByStatus(String status){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(jobApp.getStatus().equals(status)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> searchByUniversity(String uni, UniStudentDir studentDir){
        ArrayList<JobAppointments> newJobApps = new ArrayList<JobAppointments>();
        for(JobAppointments jobApp : jobAppointmentsList){
            if(studentDir.searchBySevisId(jobApp.getSevisId()).getDepartment().getCollege().getUniversity().getName().equals(uni)){
                newJobApps.add(jobApp);
            }
        }
        return newJobApps;
    }
    
    public ArrayList<JobAppointments> updateJobAppointment(JobAppointments oldJobAppointment,JobAppointments updateJobAppointment){
        Integer ind = jobAppointmentsList.indexOf(oldJobAppointment);
        jobAppointmentsList.set(ind, updateJobAppointment);
        return jobAppointmentsList;
    }
}
