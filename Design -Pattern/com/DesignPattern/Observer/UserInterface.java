package com.DesignPattern.Observer;

public class UserInterface implements Observer{
    @Override
    public void update(String msg) {
        this.display(msg);
    }
    public void display(String msg){
        System.out.println("\"UserInterface\" notified with" + msg);

    }
}
