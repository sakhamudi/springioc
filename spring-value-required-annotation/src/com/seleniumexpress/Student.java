package com.seleniumexpress;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.intrestedCourse}")
    private String intrestedCourse;

    @Value("${student.hobby}")
    private String hobby;

    public String getName() {
        return name;
    }

    public String getIntrestedCourse() {
        return intrestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Student name :: "+name);
        System.out.println("Student intrestedCourse :: "+intrestedCourse);
        System.out.println("Student hobby :: "+hobby);

    }
}
