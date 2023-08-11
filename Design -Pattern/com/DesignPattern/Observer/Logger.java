package com.DesignPattern.Observer;

import com.DesignPattern.*;

public class Logger implements Observer {
    public void log(String msg) {
        System.out.println("\"Logger\" notified with " +msg);
    }

    @Override
    public void update(String msg) {
        this.log(msg);
    }
}
