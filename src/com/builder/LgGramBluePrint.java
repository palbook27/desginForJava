package com.builder;

public class LgGramBluePrint extends BluePrint{
    Computer computer;

    public LgGramBluePrint(){
      computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("16G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("SSD");
    }

    @Override
    public Computer getComputer() {
        //컴퓨터를 인자로 가지고 있거나
        //생성자 파라미터를 가지고 new Computer(param,param,param)을 하거나
        return computer;
    }
}
