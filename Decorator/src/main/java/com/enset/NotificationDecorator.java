package com.enset;

public abstract class NotificationDecorator implements Notification {

    private Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }
}
