package com.pattern.practice;

import com.adapter.Adapter;
import com.adapter.AdapterImpl;

public class AdapterPattern {
    //학습목표
    //  - 알고리즘을 요구사항에 맞춰 사용할수있다.
    //  - adapter : 부가기구


    public static void main(String[] args) {
        /*
        AdapterPattern
        기본설계 : 기능이 있는 객체를 부가기능으로 사용할수있도록 처리
        ex) 두수에 대한 연산을 수행하는 객체 생성
            - 수의 두배수를 반환(Float)
            - 수의 반의 수를 반환(Float)
            - 구현객체 이름은 Adapter
            - Math 클래스에 이미 기능은 구현되어있음
        */

        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(100f));
    }

}
