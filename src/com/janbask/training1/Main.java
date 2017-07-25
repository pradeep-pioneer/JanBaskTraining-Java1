package com.janbask.training1;

import java.util.Date;

public class Main {

    public static final String PROGRAM_NAME = "basics";
    static final int Start=9;
    static final int end = 19;
    public static void main(String[] args) {
	// write your code here
        Date dob = new Date(1986, 8, 16);
        Date doj = new Date(2017,7, 23);
        Student firstStudent = new Student(
                "Pradeep",
                "Singh",
                dob,
                doj,
                12);
        String fullName = firstStudent.getFullName();
        String myString = "Hello, Welcome ";
        String test = 9 + myString;
        System.out.println(myString + fullName);

        String version = PROGRAM_NAME;
        int combined = Start+end;
    }
}
