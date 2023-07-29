// A thread is a thread (smallest unit , subprocess) of execution in a program.
//  The Java Virtual Machine allows an application to have multiple threads
//   of execution running concurrently. Every thread has a priority. 
//   Threads with higher priority are executed in preference to threads with
//    lower priority.


// I want to run these methods concurrently , partly 
// Class must be Thread
// class A extends Thread
class A extends Thread 
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("A");

        try {
            sleep(8);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class B extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("B");

        try {
            sleep(8);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class App {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start(); // start method is from Thread that calls run method 
        b.start();

    }    
}
