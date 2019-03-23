package com.selinium;

public class Student {

    MathCheat mathCheat = null;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheat(){
        mathCheat.mathCheat();

    }
}
