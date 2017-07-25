package com.janbask.training1;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int classNumber;
    private Date dateOfJoining;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public int getClassNumber(){
        return classNumber;
    }

    public void setFirstName(String value){
        if(value==null)
            throw new Error("Firstname cannot be null");
        firstName=value;
    }

    public void setLastName(String value){
        if(value==null)
            throw new Error("Lastname cannot be null");
        lastName=value;
    }

    public void setClassNumber(int value){
        if(value<1 && value>16)
            throw new Error("invalid value for class, range allowed is 1-16.");
        classNumber=value;
    }

    public Student(String firstName, String lastName, Date dateOfBirth, Date dateOfJoining, int classNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=dateOfBirth;
        this.dateOfJoining=dateOfJoining;
        this.classNumber=classNumber;
    }
}
