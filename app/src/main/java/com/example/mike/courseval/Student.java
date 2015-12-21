package com.example.mike.courseval;

import java.util.ArrayList;



public class Student {
    private int ID;
    private String fname;
    private String lname;
    private int numOfCourses;
    private ArrayList<String> coursesList;
    private boolean evalDone;

    //constructor
    public Student(int ID, String fname, String lname, int numOfCourses, ArrayList coursesList) {
        this.ID = ID;
        this.fname = fname;
        this.lname = lname;
        this.numOfCourses = numOfCourses;
        this.coursesList = coursesList;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    public ArrayList<String> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(ArrayList<String> coursesList) {
        this.coursesList = coursesList;
    }

    public boolean isEvalDone() {
        return evalDone;
    }

    public void setEvalDone(boolean evalDone) {
        this.evalDone = evalDone;
    }
}
