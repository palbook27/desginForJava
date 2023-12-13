package com.abstractfactory;

public interface BikeFactory {
    public Body createBody();
    public Wheel createWheel();
}
