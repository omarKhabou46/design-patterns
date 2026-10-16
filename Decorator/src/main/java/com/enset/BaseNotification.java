package com.enset;

public class BaseNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("send message using based " + message);
    }

    @Override
    public double cost() {
        return 0.1;
    }
}
