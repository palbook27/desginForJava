package com.pattern.practice;

import com.bridge.DefaultMorceCodeFunction;
import com.bridge.PrintMorseCode;
import com.bridge.SoundMorceCodeFunction;
import com.singleton.SystemSpeaker;

public class BridgePattern {
    //학습목표
    //  - 기능계층과 구현계층의 분리
    //  - 어댑터 패턴과 브릿지 패턴 연결을 이해


    public static void main(String[] args) {
        /*
        BridgePattern
        기본설계 :
        ex) 모스부호
            - 종류 : 닷, 대시, 스페이스
        */
        PrintMorseCode code = new PrintMorseCode(new DefaultMorceCodeFunction());
        PrintMorseCode soundCode = new PrintMorseCode(new SoundMorceCodeFunction());

        code.printG().printA().printR().printA().printM();
        System.out.println();
        soundCode.printG().printA().printR().printA().printM();

        //
    }
}
