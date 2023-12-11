package com.factorymethod.framework;

public abstract class ItemCreator {

    //팩토리 메소드 -> 템플릿 메소드
    public Item create(){
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    //아이템을 생성하기전에 데이터 베이스에서 아이템 정보를 요청
    abstract protected void requestItemsInfo();
    //아이템 생성후 복제등의 불법을 방지하기위해 디비에 아이템 생성정보기록
    abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();

}
