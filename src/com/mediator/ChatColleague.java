package com.mediator;

import com.mediator.contract.Colleague;

public class ChatColleague extends Colleague {

    @Override
    public void handle(String data) {
        System.out.println(this+"-"+data);
    }

}