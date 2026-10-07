package com.enset.notificationProblem;

public class Adapter extends OldNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        sendMessage(recipient, message);
    }
}
