package com.enset;

public class PushDecorator extends NotificationDecorator {

    public PushDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        getNotification().send(message);
        System.out.println("send message using push " + message);
    }

    @Override
    public double cost() {
        return 0.20 + getNotification().cost();
    }
}
