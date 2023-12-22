package com.pattern.practice;

import com.facade.Facade;

public class FacadePattern {
    //학습목표
    //  - 복잡한 과정을 간단하게 표현하는 퍼사드 패턴이해
    //  - 단순한 접근


    public static void main(String[] args) {
        /*
        FacadePattern
        기본설계 :
        ex)
            -
        */
        Facade facade = new Facade();
        facade.process();
    }
}
