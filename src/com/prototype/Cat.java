package com.prototype;

public class Cat implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat pet = (Cat) this.clone();
        //멤버변수가 class일경우 얕은복사가 되므로 깊은복사로 처리
        //ex)
        //pet.setName(new Name("이름"));

        return pet;
    }
}
