class Mobile
{
    String brand ;
    int price ;
   static String type;

    // Static block

    static 
    {
        type = "Phone";
        System.out.println("This calls only once , when class initially load");
    }

    // Constructor
   public Mobile()
    {
        brand = "Samsung";
        price = 500;
        System.out.println("in constructor");
        
        // Constructor calls every creation of object
    }
}


public class app
{
    public static void main(String args[])
    {
        // Mobile m1 = new Mobile();
        // Mobile m2 = new Mobile();
        // Mobile m3 = new Mobile();
        
        // m2.type = "Smartphone"; // It changes all objects those are subclasses
     //   // It works but in static keyword , we must use class name

        // Mobile.type = "Smartphone";
     //   //If we need to change all the types of the mobile we can use static block


        // Mobile phones[] = new Mobile[3];

        // phones[0] = m1;
        // phones[1] = m2;
        // phones[2] = m3;

        // for(Mobile i : phones)
        // {
        //    System.out.println(i.brand + ":" + i.price + ":" + i.type);
        // }


      //  /// What if we need to initial load for type but we don't create
      //  // any obj from this class

    //   ANSWER:

      // Note: in tutorial he says Class.forname , but i don't need       
    // In Java, when a class with a static block is loaded by the Java Virtual Machine (JVM), the static block is executed regardless of whether you create an object of that class or not. The static block is executed once, during the initialization of the class, and it is used to initialize static variables or perform any other necessary setup for the class.
    // So, even if you don't create an object of the class, the static block will still be executed, and the values inside the static block will be loaded and initialized. This ensures that the static variables or any other static initialization code is properly set up before they are accessed by other parts of the program.
        System.out.println(Mobile.type);

    }
}