package com.chainofresposibility.calculate;

public abstract class Calculator {

    private Calculator nextCaculator;

    public void setNextCalculator(Calculator nextCaculator) {
        this.nextCaculator = nextCaculator;
    }

    public boolean process(Request request) {
        //처리 할수있으면 처리 아니면 다음 클래스로 넘기기
        //처리 위치에 따라 큐나 스택으로 처리 ex)nextCaculator or preCaculator
        if (operator(request)) {
            return true;
        } else {
            if (nextCaculator != null)
                return nextCaculator.operator(request);
        }
        return false;

        // if (preCaculator != null)
        // if(preCaculator.process(request))
        // return true;
        //
        // return operator(request);
    }

    abstract protected boolean operator(Request request);

}
