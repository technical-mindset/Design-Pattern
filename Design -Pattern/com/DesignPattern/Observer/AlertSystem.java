package com.DesignPattern.Observer;

public class AlertSystem implements Observer{
    @Override
    public void update(String msg) {
        this.alert(msg);
    }
    public void alert(String msg){
        System.out.println("\"Alert System\" notified with " +msg);
    }
}
