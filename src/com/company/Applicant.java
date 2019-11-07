package com.company;

public class Applicant {

    private String name;
    private String email;

    public Applicant() {
    }

    public Applicant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo(){
        System.out.println(getName());
        System.out.println(getEmail());
    }
    // method to print this info!!
}
