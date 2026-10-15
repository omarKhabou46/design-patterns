package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationChannel email = new EmailChannel();
        Notification notification = new UrgentNotification(email);
        notification.send("bonjour tout le monde");

        notification = new NormalNotification(email);
        notification.send("Hello World");
    }
}
