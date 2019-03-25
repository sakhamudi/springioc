package com.autowiring;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Heart {

    private String nameOfAnimal;
    private int noOfHeart;

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void pumping(){

        System.out.print("Pumping : "+nameOfAnimal +" noOfHeart "+noOfHeart);

    }
}
