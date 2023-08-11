package com.DesignPattern.Adapter;

public class Adapter implements Duck{
    private Drone drone;

    public Adapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        this.drone.beep();
    }

    @Override
    public void fly() {
        this.drone.spin_rotors();
        this.drone.take_off();
    }
}
