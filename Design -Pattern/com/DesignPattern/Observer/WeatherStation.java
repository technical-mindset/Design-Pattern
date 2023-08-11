package com.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer) {
        int index = this.observers.indexOf(observer);
        if(index >= 0){
            this.observers.remove(observer);
        }
    }
    @Override
    public void noftify(String msg) {
        for (Observer o: observers) {
            o.update(msg);
        }
    }
    public void change(int temperature, int pressure, int windSpeed){
        this.noftify("\nTemperature:" +temperature+ "C\nPressure: " +pressure+ "-psi\nWind Speed: " +windSpeed+ "kph");
    }
}
