package com.pattern.practice;

import com.prototype.Cat;
import com.prototype.Circle;

public class PrototypePattern {

    //학습목표
    //  - 복잡한 인스턴스를 복사할수있다
    //  - 생산 비용이 높은 인스턴스를 복사를 통해서 쉽게 생성
    //  - 인스턴스 생산비용이 높은경우 : 종류가 너무 많은경우, 인스턴스 생성이 어려운경우
    //  - 깊은복사, 얕은복사를 이해

    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        PrototypePattern
        ex) 일러스트레이터와 같은 그림 그리기 툴을 개발중. 어떤 모양을 그릴수 있도록 하고 복사붙여넣기 가능
            - 복사 후 붙여넣기 하면 두 도형이 겹치는데 안겹치도록 살짝 옆으로 이동시켜주세요
        */

        Circle circle1 = new Circle(1,2,3);
        Circle circle2 = circle1.copy();
        System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getR());

        System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getR());


        //Cat 관리
        //얕은복사
        Cat navi = new Cat();
        navi.setName("navi");
        Cat yo = navi;  //ref만가져가지 새로운 객체를 생성하지않음, clone을 하면 깊은복사
                        // 단!!! 멤버변수가 class일 경우 얕은복사가 되므로 처리가 필요하다
        yo.setName("yo");
        System.out.print("고양이 이름은 : " + navi.getName());
        System.out.print("고양이 이름은 : " + yo.getName());
    }
}
