package com.strategy;

public class GameCharater {
    //접근점
    private WeaponInterface weaponInterface;

    //교환가능
    public void setWeapon(WeaponInterface weaponInterface){
        this.weaponInterface = weaponInterface;
    }

    public void attack(){
        if(weaponInterface == null){
            System.out.println("맨손으로 공격");
        } else {
            //델리게이트
            weaponInterface.attack();
        }

    }
}
