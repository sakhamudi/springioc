package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {


    @Override
    public void teach() {
  System.out.print("Science teacher");

        System.out.print("My name is Science");

    }
}
