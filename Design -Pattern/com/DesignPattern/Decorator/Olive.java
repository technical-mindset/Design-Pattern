package com.DesignPattern.Decorator;

public class Olive extends PizzaDecor {
    Pizza pizza;

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 150;
    }
    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " With Olive";
    }


}
