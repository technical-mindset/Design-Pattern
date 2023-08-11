package com.DesignPattern.Decorator;

public class Cheese extends PizzaDecor {
    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 100;
    }
    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " With Cheese";
    }
}
