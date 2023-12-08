package com.pattern.practice;

import com.strategy.*;

public class StrategyPattern {

    //학습목표
    //1. 인터페이스
    //      - 두 객체를 연결하는 연결하는 접점
    //      - 기능에 대한 선언과 구현 분리, 기능을 사용하는 통로
    //2. 델리게이트
    //      - 위임하다
    //3. 전략패턴
    //      - 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서
    //          서로 교환 가능하도록 하는 패턴


    //intelliJ main mathod 생성 : psvm
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        //통로
        ainterface.funcA();

        //위임받아 호출
        AObj aObj = new AObj();
        aObj.funcAA();

        /*
        StrategyPattern
        기본설계 : 하나의 함수를 여러개의 기능으로 분류 구현하여 셋팅에 따라 사용가능하도록 구조생성
        ex :  무기를 구현하는데 종류를 칼, 검으로 분류하여 구현현
        */
        GameCharater gameCharater = new GameCharater();

        gameCharater.attack();
        gameCharater.setWeapon(new Knife());
        gameCharater.attack();
        gameCharater.setWeapon(new Sword());
        gameCharater.attack();
    }
}
