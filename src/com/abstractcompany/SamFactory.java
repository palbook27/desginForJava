package com.abstractcompany;

import com.abstractfactory.BikeFactory;
import com.abstractfactory.Body;
import com.abstractfactory.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
