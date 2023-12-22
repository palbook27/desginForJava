package com.pattern.practice;

import com.visitor.concrete.VisitableA;
import com.visitor.concrete.VisitorA;
import com.visitor.contract.Visitable;

import java.util.ArrayList;

public class VisitorPattern {
    //학습목표
    //  - 객체에서 처리를 분리하여 사용


    public static void main(String[] args) {
        /*
        VisitorPattern
            작업 대상(방문 공간) 은 단지 데이터를 담고있는 자료구조로 만들고,
            작업 주체(방문자) 는 visit() 안에 ***이 작업 대상을 입력받아 작업 항목을 처리하면 된다.
            즉, 데이터와 알고리즘이 분리되어, 데이터의 독립성을 높여준다.

        사용할때
            자료 구조(데이터)와 자료 구조를 처리하는 로직(알고리즘)을 분리해야할 경우
            데이터 구조보다 알고리즘이 더 자주 바뀌는 경우(방문공간은 어느정도 정해져있고 방문자가 더 자주 바뀌는 경우)
        ex)
            -
        */
        ArrayList<Visitable> as = new ArrayList<Visitable>();

        as.add(new VisitableA(1));
        as.add(new VisitableA(2));
        as.add(new VisitableA(3));
        as.add(new VisitableA(4));
        as.add(new VisitableA(5));

        VisitorA visitor = new VisitorA();
        for (Visitable va : as) {
            va.accept(visitor);
        }
        System.out.println(visitor.getNumber());
    }
}
