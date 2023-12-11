package com.factorymethod.concrete;

import com.factorymethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use(){
        System.out.println("마력 회복!");
    }
}
