package com.seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mobile {

    public static void main(String args[]){

//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();
//        VodaFone vodafone = new VodaFone();
//        vodafone.calling();
//        vodafone.data();
//        Sim sim = new Airtel();
//        sim.calling();
//        sim.calling();


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

      //  System.out.println("------- configured ------- ");
       // Airtel airtel = (Airtel) applicationContext.getBean("airtel");

        //airtel.calling();

      //  VodaFone vodaFone =  applicationContext.getBean("vodafone",VodaFone.class);

       // vodaFone.calling();

        Sim sim = applicationContext.getBean("sim",Sim.class);

        sim.calling();

    }
}
