package com.DesignPattern;

import com.DesignPattern.Adapter.*;

public class Main {
    public static void main(String[] args) {
        // _-------------------------------_ Adapter Pattern
        Drone drone = new SuperDrone();

        //adapting the adapter
        Duck adapter = new Adapter(drone);
        test(adapter);

        // _------------------------------_ Observer Design Pattern
         WeatherStation sub = new WeatherStation();
        sub.subscribe(new AlertSystem());
        sub.subscribe(new UserInterface());
        sub.subscribe(new Logger());
        sub.change(27,56,92);

        // _------------------------------_ Decorator Design Pattern
         Pizza pizza = new ThickCrustPizza();
        //wrapping the instance
        pizza = new Olive(new Cheese(new Pepper(pizza)));

        System.out.println(pizza.cost());
        System.out.println(pizza.getDescription());



    }
    public static void test(Duck duck){
        duck.quack();
        duck.fly();
    }
}
