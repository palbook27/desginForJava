package com.factorymethod.concrete;

import com.factorymethod.framework.Item;
import com.factorymethod.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("마력 회복 물약 정보로드");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복물약 생성완료");
    }

    @Override
    protected Item createItem() {
        System.out.println("마력 회복 물약 생성!" + new Date());
        return new MpPotion();
    }
}
