package com.strategy;

public class Sword implements WeaponInterface{

    @Override
    public void attack(){
        System.out.println("검으로 공격");
    }
}
