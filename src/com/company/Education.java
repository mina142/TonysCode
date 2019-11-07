package com.company;

public class Education {

    private String degreeType;
    private String major;
    private String universityName;
    private String gradYear;

    public Education() {
    }

    public Education(String degreeType, String major, String universityName, String gradYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.universityName = universityName;
        this.gradYear = gradYear;
    }

    public String getDegreeType() {return degreeType; }

    public void setDegreeType(String degreeType) { this.degreeType = degreeType; }

    public String getMajor() { return major; }

    public void setMajor(String major) { this.major = major; }

    public String getUniversityName() { return universityName; }

    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public String getGradYear() { return gradYear; }

    public void setGradYear(String gradYear) { this.gradYear = gradYear; }

    public void printInfo1(){
        System.out.println(getDegreeType() + ", " + getMajor() );

        System.out.println(getUniversityName() + ", " + getGradYear());
        System.out.println();
    }
    //method to display this text
}
