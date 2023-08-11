package com.DesignPattern.Decorator;

public abstract class Pizza {
    private String description;


    public String getDescription() {
        this.description = "Pizza";
        return description;
    }
    public abstract int cost();
}
