package com.pattern.practice;

import com.observer.one.Button1;
import com.observer.three.Button3;
import com.observer.two.Button2;

import java.util.Observable;
import java.util.Observer;

public class ObserverPattern {
    //학습목표
    //  -


    public static void main(String[] args) {
        /*
        ObserverPattern
        기본설계 :
        ex)
            -
        */
        Button1 button1 = new Button1();


        button1.setOnClickListener(new Button1.OnClickListener() {

            @Override
            public void onClick(Button1 button) {
                System.out.println(button+" is Clicked");
            }
        });

        button1.onClick();


        /////////////////////////////////22222222222
        Button2 button2 = new Button2();

        button2.addObserver(new Observer() {

            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o+" is Clicked");
            }
        });

        button2.onClick();
        button2.onClick();
        button2.onClick();

        /////////////////////////////////33333333333
        Button3 button3 = new Button3();

        button3.addObserver(new Observer() {

            @Override
            public void update(Observable o, Object arg) {
                System.out.println(o+"is Clicked");
            }
        });

        button3.onClick();
        button3.onClick();
        button3.onClick();

    }
}
