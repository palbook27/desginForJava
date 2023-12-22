package com.visitor.concrete;

import com.visitor.contract.Visitable;
import com.visitor.contract.Visitor;

public class VisitorA implements Visitor {

    private int number;

    public VisitorA() {
        this.number = 0;
    }

    @Override
    public void visit(Visitable visitable) {//핵심! 종류에 따라 처리를 다르게 함
        if(visitable instanceof VisitableA){//A를 방문하면 A행위, B를 방문하면 B행위
            number+=((VisitableA) visitable).numberOfMember;
        }else {
            //...
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
