package com.pattern.practice;

import com.decorator.abst.IBeverage;
import com.decorator.concrete.Base;
import com.decorator.concrete.Espresso;
import com.decorator.concrete.Milk;

import java.util.Scanner;

public class DecoratorPattern {
    //학습목표
    //  - 동적으로 채깅ㅁ 추가가 필요할 때 사용
    //  - 동적, 책임추가


    public static void main(String[] args) {
        /*
        DecoratorPattern
        //  - 컴포넌트 : 실질적인 인스턴스를 컨트롤
        //  - 콘크리트 콤포넌트 : 컴포넌트의 실질적인 인스턴스 부분이며 책임의 주체 역할
        //  - 데코레이터 : 컴포넌트와 콘크리트 데코레이터를 동일시 하는 역할
        //  - 컨크리트 데코레이터 : 실질적인 장식 인스턴스 및 정의, 추가된 책임의 주체
        ex) 커피 제조 방법
           - 에스프레소 : 기본커피
           - 아메리카노 : 에스프레소 + 물
           - 카페라떼 : 아메리카노 + 스팀밀크
           - 헤이즐넛 : 아메리카노 + 헤이즐넛시럽
           - 카페모카 : 카페라떼 + 초콜릿
           - 카라멜 마끼아또 : 카페라떼 + 캬라멜 시럽
        */
        Scanner sc = new Scanner(System.in);
        // base
        IBeverage beverage = new Base();
        boolean done = false;
        while (!done) {
            System.out.println("음료 현재 가격 : "+beverage.getTotalPrice());
            System.out.print("선택 : 1:샷 추가 / 2:우유 추가");
            switch (sc.nextInt()) {
                case 0: done = true;
                    break;
                case 1:
                    beverage = new Espresso(beverage);
                    break;
                case 2:
                    beverage = new Milk(beverage);
                    break;
            }
        }

        System.out.println("음료 가격 : "+beverage.getTotalPrice());
        sc.close();
    }
}
