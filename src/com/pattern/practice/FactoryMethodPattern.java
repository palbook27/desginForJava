package com.pattern.practice;

import com.factorymethod.concrete.HpCreator;
import com.factorymethod.concrete.MpCreator;
import com.factorymethod.framework.Item;
import com.factorymethod.framework.ItemCreator;

public class FactoryMethodPattern {
    //학습목표
    //  - 팩토리 메소드 패턴에서 템플릿 메소드 패턴의 사용됨을 안다
    //  - 팩토리 메소드 패턴에서의 구조와 구현의 분리를 이해하고
    //      구조와 구현의 분리의 장점을 안다

    public static void main(String[] args) {

        /*
        FactoryMethodPattern


        요구사항
        게임 아이템과 아이템 생성을 구현
        1. 아이템을 생성하는 주체 생성
        2. 아이템은 인터페이스를 다뤄야한다
        3. 아이템은 use함수를 가지고있음
        4. 아이템 종류는 체력, 마력 물약존재
        */

        ItemCreator creator = new HpCreator();
        Item item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();

    }
}
