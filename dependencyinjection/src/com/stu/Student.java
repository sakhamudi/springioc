package com.stu;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Student {

    private int id;
    private String studentName;

    public Student() {
        System.out.println("------ Default constructor ------");
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String studentName) {
        System.out.println("------ Parameter constructor ------");
        this.id = id;
        this.studentName = studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void display(){
        System.out.println("::studentName::  "+studentName +" ::id::  "+id);
    }

}
