package com.DesignPattern;

import com.DesignPattern.Adapter.*;

public class Main {
    public static void main(String[] args) {
        Drone drone = new SuperDrone();

        //adapting the adapter
        Duck adapter = new Adapter(drone);
        test(adapter);
    }
    public static void test(Duck duck){
        duck.quack();
        duck.fly();

    }
}
