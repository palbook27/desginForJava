package com.pattern.practice;

import com.singleton.SystemSpeaker;

public class SingletonPattern {
    //학습목표
    //  - 하나만 생성해야할 객체를 위한 패턴

    public static void main(String[] args) {
        /*
        SingletonPattern
        개발 중인 시스템에서 스피커에 접근할 수 있는 클래스를 생성

        */

        SystemSpeaker sys1 = SystemSpeaker.getInstance();
        SystemSpeaker sys2 = SystemSpeaker.getInstance();

        sys1.getVonlum();
        sys1.setVonlum(3);
        sys1.getVonlum();

        sys2.getVonlum();
        sys1.setVonlum(4);
        sys2.getVonlum();

    }
}
