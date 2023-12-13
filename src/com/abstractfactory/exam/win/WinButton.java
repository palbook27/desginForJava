package com.abstractfactory.exam.win;

import com.abstractfactory.exam.gui.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("WinButton 버튼");
    }
}
