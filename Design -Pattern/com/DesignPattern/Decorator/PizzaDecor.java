package com.DesignPattern.Decorator;

public abstract class PizzaDecor extends Pizza{
    public abstract int cost();

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
