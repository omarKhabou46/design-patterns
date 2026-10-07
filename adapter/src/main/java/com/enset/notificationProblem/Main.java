package com.enset.notificationProblem;

public class Main {
    static void main() {
        Adapter adapter = new Adapter();
        UserService userService = new UserService(adapter);
        userService.notifyUser("021554564", "message");
    }
}
