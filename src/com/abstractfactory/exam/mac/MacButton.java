package com.abstractfactory.exam.mac;

import com.abstractfactory.exam.gui.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("MacButton 버튼");
    }
}
