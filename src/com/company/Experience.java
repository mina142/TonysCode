package com.company;

import java.util.ArrayList;

public class Experience {

    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private ArrayList<String> jobDescription;

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, ArrayList<String> jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getJobTitle() { return jobTitle; }

    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getStartDate() { return startDate; }

    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }

    public ArrayList<String> getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(ArrayList<String> jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void printText2(){
        System.out.println(getCompany());
        System.out.println(getJobTitle());
        System.out.println("Duration: " + getStartDate() + " - " + getEndDate());
        for (String oneDescription : jobDescription) {
            System.out.println("Job Description: " + oneDescription);
        }
        //        System.out.println("Job Description: " + getJobDescription());
        System.out.println();

    }
    //method to display this text
}
