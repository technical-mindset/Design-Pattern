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

    }
    public static void test(Duck duck){
        duck.quack();
        duck.fly();
    }
}
