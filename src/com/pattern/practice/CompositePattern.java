package com.pattern.practice;

import com.composite.Component;
import com.composite.File;
import com.composite.Folder;

public class CompositePattern {
    //학습목표
    //  - 컨테이너와 내용물을 같게 다루기
    //  - 컴퍼짓 패턴을 통해 트리를 다룰수있다


    public static void main(String[] args) {
        /*
        CompositePattern
        기본설계 :
        ex) 파일시스템
            - 폴더에 파일이 있고 폴더가 있다
        */

        Folder root = new Folder("root")
                , home = new Folder("home")
                , music = new Folder("music")
                , picture = new Folder("picture");

        File track1 = new File("track1")
                ,track2 = new File("track2")
                ,java = new File("java")
                ,pic1 = new File("pic1");

        root.addComponent(home);
            home.addComponent(music);
                music.addComponent(track1);
                music.addComponent(track2);
            home.addComponent(picture);
                picture.addComponent(pic1);
            root.addComponent(java);

        show(root);

    }
    private static void show(Component component){
        System.out.println(component.getClass().getName() + "|" + component.getName());
        if(component instanceof Folder){
            for(Component c : ((Folder)component).getChildren()){
                show(c);
            }
        }
    }
}
