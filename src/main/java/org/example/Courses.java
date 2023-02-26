package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalComletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit) //레퍼런스메소드로 변경
                .sum();
    }
}
