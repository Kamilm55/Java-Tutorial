// Throw exceptions

//Before you can catch an exception, some code somewhere must throw one.
// All methods use the throw statement to throw an exception.
//  The throw statement requires a single argument: a throwable object.
//  Throwable objects are instances of any subclass of the Throwable class.


// Let's create our Exception => Custom Exception
// to throw it should inherit from Throwable class
// class NegativeAgeException extends IllegalArgumentException // this is RunTimeException and we don't need try catch and throws statements
class NegativeAgeException extends Exception
{

   public NegativeAgeException(){} // default constructor
    public NegativeAgeException(String msg)
    {
        super(msg);// it calls constructor of the Exception class
        System.out.println(super.getCause()); // null
    }
    public NegativeAgeException(Throwable cause)
    {
        super(cause);
    }
    public NegativeAgeException(String msg ,Throwable cause)
    {
        // super(cause,msg); // this does not work for order or arguments
        super(msg,cause);
        System.out.println(super.getCause());// java.lang.IllegalArgumentException
    }
}

class Person
{
    public  void validateAge ( int age) throws NegativeAgeException // it is compile-time ex , we say that we know it migt give an exception
    {
        if(age < 0)
        {
            // throw new NegativeAgeException(); // default constructor
            throw new NegativeAgeException("Your age cannot be negative");
            // throw new NegativeAgeException(new IllegalAccessException());
            // throw new NegativeAgeException("Your age cannot be negative",new IllegalArgumentException());
        }
    }

    // Exception by default is compile-time ex , if you don't define as a RuntimeException
}

public class App {
    public static void main(String[] args) {
        
        Person p1 = new Person();

        // try {
        //     p1.validateAge(-5);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // System.out.println("After exception"); //Runtime Exception

        // p1.validateAge(-5); // without try_catch : Unhandled exception type Exception
        try {
            p1.validateAge(-5);
        } catch (Exception e) {
            System.out.println(e);
        }                                       ////Compile-time Exception

        System.out.println("After exception");

    }    
}
