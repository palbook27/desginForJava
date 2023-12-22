package com.visitor.contract;

public interface Visitable {
    public void accept(Visitor visitor);
}