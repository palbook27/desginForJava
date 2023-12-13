package com.abstractfactory.exam.linux;

import com.abstractfactory.exam.gui.Button;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux 버튼");
    }
}
