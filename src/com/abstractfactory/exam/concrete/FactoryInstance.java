package com.abstractfactory.exam.concrete;

import com.abstractfactory.exam.gui.GuiFactory;
import com.abstractfactory.exam.linux.LinuxGuiFac;
import com.abstractfactory.exam.mac.MacGuiFac;
import com.abstractfactory.exam.win.WinGuiFac;

public class FactoryInstance {
    public static GuiFactory getGuiFac() {
        switch (getOsCode()){
            case 0: return new MacGuiFac();
            case 1: return new LinuxGuiFac();
            case 2: return new WinGuiFac();
        }
        return null;

    }

    private static int getOsCode() {
        //상태를 알수있는 정보로 처리
        if(System.getProperty("os.name").toLowerCase().contains("mac")){
            return 0;
        } else if(System.getProperty("os.name").toLowerCase().contains("linux")){
            return 1;
        } else if(System.getProperty("os.name").toLowerCase().contains("window")){
            return 2;
        }
        return 999;
    }
}

//외부에서 접근할수없도록 class 선언부 아래에 기록