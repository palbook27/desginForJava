package com.pattern.practice;

import com.mediator.ChatColleague;
import com.mediator.ChatMediator;
import com.mediator.contract.Colleague;
import com.mediator.contract.Mediator;

public class MediatorPattern {
    //학습목표
    //  -


    public static void main(String[] args) {
        /*
        MediatorPattern
        기본설계 :
        ex)
            -
        */
        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatColleague();
        Colleague colleague2= new ChatColleague();
        Colleague colleague3= new ChatColleague();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");
    }
}
