package com.DesignPattern.Observer;

public interface Subject {
    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void noftify(String msg);

}
