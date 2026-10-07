package com.enset.notificationProblem;

public class OldNotificationService {

    public void sendMessage(String phoneNumber, String message) {
        System.out.println("SMS envoyé à " + phoneNumber);
        System.out.println("Message : " + message);
    }
}
