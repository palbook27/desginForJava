package com.pattern.practice;

import com.templatemethod.AbstGameConnectHelper;
import com.templatemethod.DefaultGameConnectHelper;

public class TemplateMethodPattern {
    //학습목표
    //  - 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현
    //  - 알고리즘의 구조를 메소드에 정의하고 하위클래스에서 구조의 변경없이 알고리즘을 재정의 하는 패턴

    public static void main(String[] args) {

        /*
        TemplateMethodPattern
        1. 알고리즘을 여러 단계로 나눈다
        2. 단계별로 메소드를 선언
        3. 알고리즘을 수행할 메소드를 만든다
        4. 하위클래스에서 나눠진 메소드를 구현한다

        요구사항
        신작게임의 접속을 구현
        1. 보안과정
        2. 인증과정
        3. 권한과정
        4. 접속과정
        + 추가 : 보안이 강화되고, 여가부 10시 이용제한
        */

        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디암호");
    }
}
