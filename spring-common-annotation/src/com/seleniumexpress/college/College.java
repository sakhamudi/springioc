package com.seleniumexpress.college;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

    @Autowired
    Principal principal;


    @Autowired
            @Qualifier("scienceTeacher")
    Teacher teacher;

    @Value("${college.name}")
    String collegeName;

//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    //
//    public College(Principal principal){
//        System.out.print("Constructor");
//        this.principal = principal;
//    }

    public void test(){
        System.out.print("------- test method ----- ");
        principal.principeInfo();
        teacher.teach();
        System.out.print(" My college name is "+collegeName);

    }


}
