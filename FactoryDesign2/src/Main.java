import Notifications.FactoryDesignSystem;
import Notifications.Notification;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Problem Statement: Consider we want to implement a notification service through email, SMS, and push notifications.
//        Let’s try to implement this with the help of the factory method design pattern.

        Scanner sc = new Scanner(System.in);
        String req = sc.nextLine();

//        String req2 = "sms";
//        System.out.println(req.equals(req2));// == check reference value of the string , use equals

        Notification notification =  FactoryDesignSystem.whichTypeMessage(req);

        notification.Message();

        // If we want to add other type of feature like otherNotification ; no changing in this main.java file
        // all changes occurs in Notifications package first we add otherNotification class and in Factory design we add an if statement more
    }
}