package com.selinium;

public class AnotherStudent {

    MathCheat mathCheat = null;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void startCheat(){
        System.out.print("-------- startCheat -----------");
        mathCheat.mathCheat();

    }
}
