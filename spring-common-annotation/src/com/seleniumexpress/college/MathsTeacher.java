package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathsTeacher implements Teacher {


    @Override
    public void teach() {
  System.out.print("Teaching maths");

        System.out.print("My name is Chenna Rao");

    }
}
