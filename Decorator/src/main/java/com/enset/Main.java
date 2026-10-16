package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
       Notification notification = new BaseNotification();
        System.out.println(notification.cost());
        notification = new SMSDecorator(notification);
        System.out.println(notification.cost());

    }
}
