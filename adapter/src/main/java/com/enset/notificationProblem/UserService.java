package com.enset.notificationProblem;

public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String phone, String message) {
        notificationService.send(phone, message);
    }
}
