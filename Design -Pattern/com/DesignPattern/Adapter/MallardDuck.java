package com.DesignPattern.Adapter;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack !!");
    }

    @Override
    public void fly() {
        System.out.println("Duck Is Flying !!");
    }
}
