package com.observer.three;

import java.util.Observable;

/**
 * Target
 * @author garam
 *
 */
public class Button3 extends Observable{

    public void onClick(){
        setChanged();
        notifyObservers();
    }
}