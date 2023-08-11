package com.DesignPattern.Decorator;

public class ThickCrustPizza extends Pizza{

    @Override
    public String getDescription() {
        return super.getDescription() +" Thick Crust";
    }

    public int cost() {
        return 1500;
    }
}
