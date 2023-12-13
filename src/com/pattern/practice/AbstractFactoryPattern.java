package com.pattern.practice;

import com.abstractcompany.SamFactory;
import com.abstractfactory.BikeFactory;
import com.abstractfactory.Body;
import com.abstractfactory.Wheel;
import com.abstractfactory.exam.concrete.FactoryInstance;
import com.abstractfactory.exam.gui.Button;
import com.abstractfactory.exam.gui.GuiFactory;
import com.abstractfactory.exam.gui.TextArea;
import com.abstractfactory.exam.linux.LinuxGuiFac;
import com.abstractfactory.exam.mac.MacGuiFac;
import com.abstractfactory.exam.win.WinGuiFac;

public class AbstractFactoryPattern {
    //학습목표
    //  - 관련있는 객체의 생성을 가상화 할 수 있다
    //  - 생성부분의 가상화, 관련있는 객체


    public static void main(String[] args) {
        /*
        AbstractFactoryPattern
        기본설계 : 팩토리를 가상화 해서 팩토리 여러개, 이거 활용
        ex) 자전거 : 삼천리 자전거, GT자전거
            - 여러 형태의 자전거를 팩토리를 통해 하나의 생성 규격에 맞춰 처리
        */

        BikeFactory smaFac = new SamFactory();
        Body body = smaFac.createBody();
        Wheel wheel = smaFac.createWheel();

        /*
        BikeFactory gtFac = new GtFactory();
        Body body = gtFac.createBody();
        Wheel wheel = gtFac.createWheel();
         */

        //2번째 예제
        //이렇게 쓰는게 아니다
        //GuiFactory fac = new LinuxGuiFac();
        //GuiFactory fac = new MacGuiFac();
        //GuiFactory fac = new WinGuiFac();

        GuiFactory fac = FactoryInstance.getGuiFac();

        Button btn = fac.createButton();
        TextArea textArea = fac.createTextArea();
        btn.click();
        System.out.println(textArea.getText());
    }
}
