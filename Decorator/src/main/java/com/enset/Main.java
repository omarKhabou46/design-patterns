package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
       Notification notification = new BaseNotification();
        notification = new SMSDecorator(notification);
        notification = new PushDecorator(notification);
        notification.send("bonjour tout le monde");

    }
}
