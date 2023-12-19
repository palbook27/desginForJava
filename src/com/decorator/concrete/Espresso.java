package com.decorator.concrete;

import com.decorator.abst.AbstAdding;
import com.decorator.abst.IBeverage;

public class Espresso extends AbstAdding {
    static protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+getAddPrice();
    }

    /**
     * 에스프레소 추가가격
     * @return
     */
    private static int getAddPrice(){
        //System.out.println("espressoCount는 : " + espressoCount);
        espressoCount +=1;
        int addPrice = 100;

        if(espressoCount > 1){
            addPrice = 70;
        }
        System.out.println("addPrice 리턴값 : " + addPrice);
        return addPrice;
    }
}
