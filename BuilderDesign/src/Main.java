import Phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone p = new Phone("Samsung","Android",8,128,11.8);
//        Phone p = new Phone(8,"Samsung","Android",128,11.8);
//        Phone p = new Phone("Samsung","Android",11.8);
        // For creating obj we follow ORDER and we must fill all required fields
        // we can change with multiple parameterized constructor but it is not good idea , because again there will be an order to follow

        //        Phone p = new Phone(8,"Samsung","Android",128,11.8);
//        Phone p2 = new Phone();
//        p2.setRAM(8);
//        p2.setModel("Samsung");
//        p2.setOs("Android");
//        p2.setROM(128);
//        p2.setScreenSize(11.8);
////        Phone p = new Phone("Samsung","Android",11.8);
//        Phone p3 = new Phone();
//        p3.setModel("Samsung");
//        p3.setOs("Android");
//        p3.setScreenSize(11.8);

        //These codes also so long;

    Phone p2 = new Phone().setRAM(8).setModel("Samsung").setOs("Android").setROM(128).setScreenSize(11.8);
        System.out.println(p);
        System.out.println(p2);
//        System.out.println(p3);
    }
}