package com.visitor.concrete;

import com.visitor.contract.Visitable;
import com.visitor.contract.Visitor;

public class VisitableA implements Visitable {

    int numberOfMember;

    public VisitableA(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public void accept(Visitor visitor) { // 핵심! 방문을 허락하는 일
        visitor.visit(this);
    }
}