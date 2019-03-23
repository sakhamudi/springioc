package com.stu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam  {

    public  static  void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       // Student stu = context.getBean("student",Student.class);
       //  stu.display();

        Student stu1 = context.getBean("praveen",Student.class);
        stu1.display();


        Student stu2 = context.getBean("delip",Student.class);

        stu2.display();
    }
}
