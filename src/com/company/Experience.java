package com.company;

public class Experience {

    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String jobDescription) {
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

    public String getJobDescription() { return jobDescription; }

    public void setJobDescription(String jobDescription) { this.jobDescription = jobDescription; }

    public void printText2(){
        System.out.println(getCompany());
        System.out.println(getJobTitle());
        System.out.println("Duration: " + getStartDate() + " - " + getEndDate());
        System.out.println("Job Description: " + getJobDescription());
        System.out.println();

    }
    //method to display this text
}
