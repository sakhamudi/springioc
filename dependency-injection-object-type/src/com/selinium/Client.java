package com.selinium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String args[]){

      //  Student student = new Student();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student",Student.class);
        student.cheat();

        AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
        anotherStudent.startCheat();
    }
}
