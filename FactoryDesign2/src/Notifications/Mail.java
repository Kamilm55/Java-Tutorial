package Notifications;

public class Mail implements Notification{
    @Override
    public void Message() {
        System.out.println("Message With MAIL");
    }
}
