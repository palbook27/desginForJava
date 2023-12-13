package com.pattern.practice;

import com.builder.*;

public class BuilderPattern {
    //학습목표
    //  - 복잡한 단계가 필요한 인스턴스 생성을 빌더패턴을 통해 구현
    //  - 복잡하게 생성되는 객체 구현을 서브클래스로 넘겨주는 패턴
    //  - 동작하는 구조를 이해해야한다

    //두번째 빌더패턴
    //  - 많은 인자를 가진 객체 생성을 다른 객체의 도움으로 생성하는 패턴


    public static void main(String[] args) {
        /*
        BuilderPattern
        기본설계 :
        ex)
            -
        */
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint());    // 컴퓨터 위치 1)LgGramBluePrint , 2)Factory 중에 가지고 있을수있다
        factory.make();

        Computer com = factory.getComputer();

        //Computer com = new Computer("i7", "16g", "ssd");
        System.out.println(com.toString());

        //////////////////// 2번재 패턴
        Computer bCom = ComputerBuilder.start()
                            .setCpu("i9")
                            .setRam("32g")
                            .setStorage("SSD")
                            .build();

        System.out.println(bCom.toString());

    }
}
