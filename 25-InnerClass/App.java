
class A
{
    private int value;

    public void show()
    {
        System.out.println("In A show");
    }

    /* static */ class B
    {
        int innerValue;

         public void show()
        {
            System.out.println("In A.B show");
        }
    }
}


public class App {
     public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        // A.B innerObj = new A.B(); // if static we can acces without create obj
        A.B innerObj = obj1.new B(); // for non-static inner class
        innerObj.show();
    }    
}
