package com.DesignPattern.Decorator;

public class ThinCrustPizza extends Pizza{
    @Override
    public String getDescription() {
        return super.getDescription() +" Thin Crust";
    }


    public int cost() {
        return 1200;
    }
}
