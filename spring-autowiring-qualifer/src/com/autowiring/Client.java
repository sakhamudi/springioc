package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Human human = context.getBean("human",Human.class);
        human.startPumping();
    }
}
