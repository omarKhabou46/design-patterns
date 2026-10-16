package com.enset;

public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("send messsgae " + message);
    }

    @Override
    public double cost() {
        return 0.50 + getNotification().cost();
    }
}
