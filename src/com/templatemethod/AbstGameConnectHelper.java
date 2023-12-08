package com.templatemethod;

public abstract class AbstGameConnectHelper {
    protected abstract  String doSecurity(String str);
    protected abstract boolean authentication(String id, String pwd);
    protected abstract int authorization(String str);
    protected abstract String connection(String info);

    //템플릿 메소드
    public String requestConnection(String encodedInfo){

        //보안작업 -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);
        String id = "111";
        String pwd = "222";
        //반환된 데이터로 아이디 암호를 할당한다
        //인증과정
        if(!authentication(id, pwd)){
            throw new Error("아이디 암호 에러");
        }
        int i = authorization(id);

        switch (i){
            case 0://게임 매니저
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://에러
                break;
        }

        return connection(encodedInfo);
    }
}
