package com.seleniumexpress.college;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.seleniumexpress.college")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

//    @Bean(name = {"colBean","collegeBean"})
//    public College collegeBean(){
//
//        College college = new College();
//        college.setPrincipal(principal());
//        college.setTeacher(mathsTeacher());
//        return college;
//    // return new College(principal());
//     }
//
//     @Bean(name = {"principal"})
//     public Principal principal(){
//        return new Principal();
//     }
//
//    @Bean(name = {"mathsTeacher"})
//    public Teacher mathsTeacher(){
//        return new MathsTeacher();
//    }



}
