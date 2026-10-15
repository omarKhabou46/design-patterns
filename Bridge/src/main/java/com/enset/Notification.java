package com.enset;

public abstract class Notification {

    protected NotificationChannel notificationChannel;

    public Notification(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public abstract void send(String message);

}
