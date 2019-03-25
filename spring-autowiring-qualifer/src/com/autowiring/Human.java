package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    public Human() {
    }

   // @Autowired
    public Human(Heart heart) {
        System.out.print("------- constructor heart ------ ");
        this.heart = heart;
    }

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        System.out.print("------- Set heart ------ ");
        this.heart = heart;
    }

    public void startPumping(){
        if(heart!=null) {
            heart.pumping();
        }else{
            System.out.print("----- you are dies ---- ");
        }
    }
}
