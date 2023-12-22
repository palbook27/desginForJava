package com.observer.two;

import java.util.Observable;

public class Button2 extends Observable{

    public void onClick(){
        setChanged();
        notifyObservers();
    }

}
