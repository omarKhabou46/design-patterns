package com.enset;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send() {
        System.out.println("send by email");
    }
}
