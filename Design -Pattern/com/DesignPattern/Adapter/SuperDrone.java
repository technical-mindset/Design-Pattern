package com.DesignPattern.Adapter;

public class SuperDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("Beep Beep Beep!");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinnig!");
    }

    @Override
    public void take_off() {
        System.out.println("Taking off !!!");

    }
}
