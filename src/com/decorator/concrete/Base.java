package com.decorator.concrete;

import com.decorator.abst.IBeverage;

public class Base implements IBeverage {
    @Override
    public int getTotalPrice() {
        return 0;
    }
}
