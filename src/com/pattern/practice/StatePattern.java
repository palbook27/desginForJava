package com.pattern.practice;

import com.state.Light;

public class StatePattern {
    //학습목표
    //  -


    public static void main(String[] args) {
        /*
        StatePattern
        기본설계 :
        ex)
            -
        */
        Light light = new Light();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
    }
}
