package com.tahahanci.week1.hw2.kodlamaio;

public abstract class Course {

    protected String courseId;
    protected String courseName;
    protected String instructorName;
    protected double coursePrice;

    public Course(String courseId, String courseName, String instructorName, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        if (coursePrice < 0) {
            this.coursePrice = 0.0;
        } else
            this.coursePrice = coursePrice;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }
}
