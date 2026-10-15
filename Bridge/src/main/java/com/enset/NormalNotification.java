package com.enset;

public class NormalNotification extends Notification {

    public NormalNotification(NotificationChannel notificationChannel) {
        super(notificationChannel);
    }

    @Override
    public void send(String message) {
        System.out.print("normal : ");
        notificationChannel.send();
    }
}
