package com.decorator.abst;
/**
 *  <h2><b>Role : </b>Decorator</h2>
 *  <p>
 *  컴포넌트와 장식을 동일시 해주는 역할합니다.
 *  </p>
 */
public class AbstAdding implements IBeverage{//추가된것
    private IBeverage base;

    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {//책임부분
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
