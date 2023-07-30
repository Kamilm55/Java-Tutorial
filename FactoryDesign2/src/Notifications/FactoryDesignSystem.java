package Notifications;

public class FactoryDesignSystem {
//     == check reference value of the string , use equals
    public static Notification whichTypeMessage (String req) {
        if (req == null || req.isEmpty())
            return null;

        if (req.equals( "sms"))
            return  new Sms();
        else if (req.equals( "mail"))
            return  new Mail();
        else if (req.equals( "push"))
            return  new PushNot();
        else
            throw new IllegalArgumentException("We don't have this type notifications yet!");
    }
}
