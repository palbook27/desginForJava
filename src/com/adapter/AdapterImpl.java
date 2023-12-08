package com.adapter;

public class AdapterImpl implements Adapter{


    @Override
    public Float twiceOf(Float f) {
        //변경요청이 올경우 adapterImpl 에서 변경만 하면 적용됨
        //return (float)Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue();
    }
    @Override
    public Float halfOf(Float f){
        //로그요청
        //라이브러리 변경 X, 메인 소스 수정 X
        System.out.println("절반함수 호출 시작");
        return (float)Math.half(f.doubleValue());
    }
}
