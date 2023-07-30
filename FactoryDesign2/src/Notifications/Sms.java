package Notifications;

public class Sms implements Notification{
    @Override
    public void Message() {
        System.out.println("Message With SMS");
    }
}
