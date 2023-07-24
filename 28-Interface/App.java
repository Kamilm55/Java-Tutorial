// An interface in Java is a blueprint of a class. 
// It has static constants and abstract methods.Variables must be static and final
// The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not method body.
// It is used to achieve abstraction and multiple inheritance in Java.
// In other words, you can say that interfaces can have abstract methods and variables.
// It cannot have a method body.
// Multiple interfaces can be implemented by one class 

interface MediaTools
{
    /* static final */ String name = "media";

    void show();
    // void show2(); // It should implement
}

interface PortableMedia extends MediaTools // ineritance in interface
{
    void potableFunc1();
    void potableFunc2();
    void potableFunc3();
}

class Phone implements PortableMedia
{

    @Override
    public void potableFunc1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void potableFunc2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void potableFunc3() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Phone");
    }
    
}
class Tv implements MediaTools /* , A */
{
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Tv");
    }
}

class Human
{
    public void watchingFilm(MediaTools m )
    {
        System.out.println("Watching film");
    }
}

interface A 
{
    void display();
}

public class App {
    public static void main(String[] args) {
        MediaTools p = new Phone();
        MediaTools tv = new Tv();

        Human Kamil = new Human();
        Kamil.watchingFilm(p);
        Kamil.watchingFilm(tv);

        p.show();
        tv.show();

        System.out.println(MediaTools.name);

        //

        // p.potableFunc1(); // Not working for reference type
        PortableMedia p1 =  new Phone();
        p1.potableFunc1(); 

        // A a1 = new A(); // Interfaces cannot instatiate
        A a1 = new A(){
          public void display()
            {
                System.out.println("a1 display");
            }
        };

        a1.display();
        
        // Interfaces can instatiate with anonymous func
    }    
}
