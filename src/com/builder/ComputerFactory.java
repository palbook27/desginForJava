package com.builder;

public class ComputerFactory {
    private BluePrint print;

    public void setBluePrint(BluePrint bluePrint){
        this.print = bluePrint;
    }

    public void make() {

        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer(){
        return print.getComputer();
    }
}
