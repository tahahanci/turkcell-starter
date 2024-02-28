package com.tahahanci.week1.hw2.kodlamaio;

public class CourseManager {

    Course course;
    Logger logger;

    public CourseManager(Course course, Logger logger) {
        this.course = course;
        this.logger = logger;
    }

    public void add(Course course) {
        System.out.println("Course is added: " + course.getCourseName());
        System.out.println(logger.logger("Added."));
    }

    public void delete(Course course) {
        System.out.println("Course is deleted: " + course.getCourseName());
        System.out.println(logger.logger("Deleted"));
    }
}
