package com.templatemethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

    @Override
    protected String doSecurity(String str) {
        System.out.println("디코드");
        System.out.println("강화된 디코드");
        return null;
    }

    @Override
    protected boolean authentication(String id, String pwd) {
        System.out.println("아이디 암호 확인");
        return true;
    }

    @Override
    protected int authorization(String str) {
        System.out.println("권한체크");
        //유저정보를 확인하고 성인이 아닐경우 10시 이후 접속제한
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속시도");
        return null;
    }
}
