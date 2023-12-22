package com.pattern.practice;

import com.chainofresposibility.calculate.Calculator;
import com.chainofresposibility.calculate.PlusCalculator;
import com.chainofresposibility.calculate.Request;
import com.chainofresposibility.calculate.SubCalculator;
import com.chainofresposibility.weapons.Armor;
import com.chainofresposibility.weapons.Attack;

public class ChainOfResposibility {
    //학습목표
    //  - 다양한 처리방식을 유연, 동적으로 연결할수있다.


    public static void main(String[] args) {
        /*
        ChainOfResposibility
        기본설계 :
        ex)
            - 동적으로 프로세스 생성가능
            - 디펜스에서 프로세스 바로 호출
        */
        /////1번째
        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();

        plus.setNextCalculator(sub);

        Request request1 = new Request(1,2,"+"); //3
        Request request2 = new Request(10,2,"-");//8

        plus.process(request1);
        plus.process(request2);
        /////2번째
        Attack attack = new Attack();
        attack.setAmount(100);

        Armor armorA = new Armor() {

            @Override
            protected void proccess(Attack attack) {
                int amount = attack.getAmount();
                amount *= 0.8;
                attack.setAmount(amount);
            }
        };

        Armor armorB = new Armor() {

            @Override
            protected void proccess(Attack attack) {
                int amount = attack.getAmount();
                amount -= 10;
                if(amount < 0 )
                    amount = 0;
                attack.setAmount(amount);
            }
        };

        armorA.setNextArmor(armorB);

        armorA.depense(attack);

        System.out.println(attack.getAmount());

        armorA.setNextArmor(new Armor() {

            @Override
            protected void proccess(Attack attack) {
                int amount = attack.getAmount();
                amount -= 50;
                if(amount < 0 )
                    amount = 0;
                attack.setAmount(amount);
            }
        });

        attack.setAmount(100);

        armorA.depense(attack);

        System.out.println(attack.getAmount());
    }
}
