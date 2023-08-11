package com.DesignPattern.Decorator;

public class Pepper extends PizzaDecor{
    Pizza pizza;
    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 25;
    }
    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " With Pepper";
    }
}
