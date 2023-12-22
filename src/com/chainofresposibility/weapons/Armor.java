package com.chainofresposibility.weapons;

public abstract class Armor implements Defense {

    private Defense nextDefense;

    public void setNextArmor(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }

    @Override
    public void depense(Attack attack) {

        //바로 호출하는게 중요 포인트
        proccess(attack);
        if(nextDefense!=null)
            nextDefense.depense(attack);
    }

    abstract protected void proccess(Attack attack);

}
