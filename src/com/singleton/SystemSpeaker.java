package com.singleton;

public class SystemSpeaker {
    static private SystemSpeaker instance;
    private  int vonlum = 5;

    private SystemSpeaker(){

    }

    public static SystemSpeaker getInstance() {
        if(instance == null){
            //시스템 스피커
            instance = new SystemSpeaker();
        }
        return instance;
    }


    public int getVonlum() {
        System.out.println("현재 볼륨은 : " + this.vonlum);
        return vonlum;
    }

    public void setVonlum(int vonlum) {
        this.vonlum = vonlum;
    }

}
