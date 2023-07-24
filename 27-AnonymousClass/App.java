abstract class Base
{
   abstract void show();
}

public class App {
    public static void main(String[] args) {
        // We cannot instantiate abstract class

        // To do that we use anonymous class and implement it inside
        Base b1 = new Base() {
            public void show()
            {
                System.out.println("It implements via anonymous class , We can instantiate abstract class with this");
            }
        };

        Base b2 = new Base() {
            public void show()
            {
                System.out.println("It is b2 show");
            }
        };
        // Use cases:
        // If we use only once Why create child class and inherit this
        // for ex: we need 4 different show method
        // we create 4 class and inherit from Base
        // then instantiate and use
        // with anonymous we can do without creating 4 class 
        b1.show();
        b2.show();
    }    
}
