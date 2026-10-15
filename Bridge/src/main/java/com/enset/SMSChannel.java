package com.enset;

public class SMSChannel implements NotificationChannel {
    @Override
    public void send() {
        System.out.println("send by sms");
    }
}
