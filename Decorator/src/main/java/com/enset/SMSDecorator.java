package com.enset;

public class SMSDecorator extends NotificationDecorator {

    public SMSDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        getNotification().send(message);
        System.out.println("send messsgae using sms " + message);
    }

    @Override
    public double cost() {
        return 0.50 + getNotification().cost();
    }
}
