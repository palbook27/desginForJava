package com.pattern.practice;

import com.memento.Memento;
import com.memento.Originator;

import java.util.Stack;

public class MementoPattern {
    //학습목표
    //  -


    public static void main(String[] args) {
        /*
        MementoPattern
        기본설계 :
        ex)
            -
        */
        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("state 1");
        mementos.push(originator.createMemento());
//		Memento memento = new Memento();//X
//		memento.getState();//X
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        originator.setState("state 3");
        mementos.push(originator.createMemento());
        originator.setState("state Final");
        mementos.push(originator.createMemento());

        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());//state Final
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());//state 3
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());//state 2
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());//state 1
    }
}
