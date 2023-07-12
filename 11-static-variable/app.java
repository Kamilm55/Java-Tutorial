
class Mobile
{
    String brand;
    int price;
   static String type; // this is same for all objs . that's why we call static


    // We cannot use "static" keyword for this method. 
    // Because it is not same for all object from Mobile class
    // this method not print the same output for each
    // this is dynamic not static

    // error: non-static variable brand cannot be referenced from a static context \\

    //every obj that created using mobile class has show method(feature)
    public /* static */ void show()
    {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class app
{
    public static void main(String args[])
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.brand = "Apple";
        m2.brand = "Xiaomi";
        m1.price = 1500;
        m2.price = 500;
        // m1.type = "SmartPhone";  don't assign static variable with obj name (but it is working)
        // m2.type = "SmartPhone";

        Mobile.type = "SmartPhone"; // We should assign static variable with the class name
        Mobile.type = "Phone"; //If we change all sub obj changes
        m1.show();
        m2.show();
    }
}