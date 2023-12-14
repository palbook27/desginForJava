package com.bridge;

public class PrintMorseCode extends MorseCode{
    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }
    //문자출력 gram

    public PrintMorseCode printG() {
        dash();dash();dot();space();
        return this;
    }
    public PrintMorseCode printA() {
        dot();dash();space();
        return this;
    }
    public PrintMorseCode printR() {
        dot();dash();dot();space();
        return this;
    }
    public PrintMorseCode printM() {
        dash();dash();space();
        return this;
    }
}
