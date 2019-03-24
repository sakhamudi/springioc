package com.selinium;

public class AnotherStudent {

    Cheat cheat = null;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void startCheat(){
        System.out.print("-------- startCheat -----------");
        cheat.cheat();

    }


}
