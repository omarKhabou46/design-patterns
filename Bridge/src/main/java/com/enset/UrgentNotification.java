package com.enset;

public class UrgentNotification extends Notification {

    public UrgentNotification(NotificationChannel notificationChannel) {
        super(notificationChannel);
    }

    @Override
    public void send(String message) {
        System.out.print("urgent : ");
        notificationChannel.send();
    }
}
