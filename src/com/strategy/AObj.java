package com.strategy;

public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        //다른객체의 기능을 가져와서 쓰는것 위임
        ainterface.funcA();
        ainterface.funcA();

        //다른 곳에서 개발후 처리 -> 인터페이스
        //System.out.println("AObj AA");
        //System.out.println("AObj AA");

        // ~ 기능이 필요합니다. 개발해주세요.
    }
}
