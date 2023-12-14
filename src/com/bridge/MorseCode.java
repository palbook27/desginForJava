package com.bridge;

public class MorseCode {
    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function){
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function){
        this.function = function;
    }

    public void dot(){
        function.dot();
    }
    public void dash(){
        function.dash();
    }
    public void space(){
        function.space();
    }


    //디자인패턴을 이용하지 않으면
    public void oldDot(){
        System.out.print(".");
        //보여주는 데이터가 아닌 소리로 변경한다면??
        //예전 소스는 지우고 신규소스를 넣어야함
        //ex)System.call.Bip();
    }
    public void oldDash(){
        System.out.print("_");
    }
    public void oldSpace(){
        System.out.print(" ");
    }
}
