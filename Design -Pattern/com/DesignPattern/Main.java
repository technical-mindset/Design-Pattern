package com.DesignPattern;

import com.DesignPattern.Adapter.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
