package com.strategy;

public class Knife implements WeaponInterface{

    @Override
    public void attack(){
        System.out.println("칼로 공격");
    }
}
