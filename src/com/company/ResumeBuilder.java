package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {
        String name;
        String emailAddress;

        // for inputing the exit message
        String input;

        String degreeType;
        String major;
        String universityName;
        String gradYear;

        String company;
        String jobTitle;
        String startDate;
        String endDate;
        //String jobDescription;

        String skillName;
        String skillRating;

        Scanner key = new Scanner(System.in);

        ArrayList<Education> educationInfo = new ArrayList<>();
        ArrayList<Experience> experienceInfo = new ArrayList<>();
        ArrayList<Skills> skillsInfo = new ArrayList<>(); // check with line 103

        Applicant applicant = new Applicant();
        System.out.println("Welcome to our online application, please fill out the following information to be considered.");
        System.out.println("Please enter your name: ");
        name = key.nextLine();
        applicant.setName(name);

        System.out.println("Please enter your email: ");
        emailAddress = key.nextLine();
        applicant.setEmail(emailAddress);

        while (true){
            Education education = new Education();
            System.out.println("Please enter your degree type (i.e. Associate's, Bacholor's, Master's, PHD, etc.): ");
            degreeType = key.nextLine();
            education.setDegreeType(degreeType);

            System.out.println("Major: ");
            major = key.nextLine();
            education.setMajor(major);

            System.out.println("University name: ");
            universityName = key.nextLine();
            education.setUniversityName(universityName);

            System.out.println("Graduation year: ");
            gradYear = key.nextLine();
            education.setGradYear(gradYear);

            educationInfo.add(education); //

            System.out.println("Before we move on, do you want to add any more educational experience?");
            System.out.println("Please type Yes or No");

            input = key.nextLine();
            if(input.equalsIgnoreCase("no")){
                break;
            }
        }

        while (true) {
            Experience experience = new Experience();
            ArrayList<String> jobDescriptions = new ArrayList<>();     // moved here to exist PER JOB only!

            System.out.println("Please enter your prior work experience");
            System.out.println("Company name: ");
            company = key.nextLine();
            experience.setCompany(company);

            System.out.println("Job Title: ");
            jobTitle = key.nextLine();
            experience.setJobTitle(jobTitle);

            System.out.println("Start Date: ");
            startDate = key.nextLine();
            experience.setStartDate(startDate);

            System.out.println("End Date: ");
            endDate = key.nextLine();
            experience.setEndDate(endDate);

            System.out.println("Enter one or more descriptions:");
            while(true){
                System.out.println("Job Description: ");
                //jobDescription = key.nextLine();
                //experience.setJobDescription(jobDescription);
                String oneDescription = key.nextLine();
                jobDescriptions.add(oneDescription);


                System.out.println("Before we move on, do you want to add any more descriptions for this job?");
                System.out.println("Please type Yes or No");

                input = key.nextLine();
                if (input.equalsIgnoreCase("no")) {
                    break;
                }
            } // end description while

            experience.setJobDescription(jobDescriptions);
            experienceInfo.add(experience);

            System.out.println("Before we move on, do you want to add any more prior work experience?");
            System.out.println("Please type Yes or No");

            input = key.nextLine();
            if (input.equalsIgnoreCase("no")) {
                break;
            }
        }

            while (true){
                Skills skill2 = new Skills(); // make sure this works for the array
                System.out.println("Please enter any applicable skills for the job: ");
                skillName = key.nextLine();
                skill2.setSkillName(skillName);

                System.out.println("Enter a rating for that skill (i.e. Fundamental, Novice, Advanced, Expert: ");
                skillRating = key.nextLine();
                skill2.setSkillRating(skillRating);

                skillsInfo.add(skill2);

                System.out.println("Before we move on, do you want to add any more relevant skills?");
                System.out.println("Please type Yes or No");

                input = key.nextLine();
                if(input.equalsIgnoreCase("no")){
                    break;
                }


            }

        applicant.printInfo();
        System.out.println();
        for (Education education : educationInfo) { //
            System.out.println("Education:");
            education.printInfo1();

        }

        System.out.println();
        for (Experience experience : experienceInfo) {/// this is where you need to check and fix
            System.out.println("Work Experience: ");
            experience.printText2(); // check this experience1 issue
        }

        System.out.println();
        for(Skills skill : skillsInfo){
            System.out.println("Applicable Skill: ");
            skill.printText3();
                }


        }


    }

