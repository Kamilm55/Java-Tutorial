class Parent
{
    public void show()
    {
        System.out.println("In Parent");
    }
}
class Sub1 extends Parent
{
    @Override
    public void show()
    {
        System.out.println("In Sub1");
    }
}
class Sub2 extends Parent
{
    @Override
    public void show()
    {
        System.out.println("In Sub2");
    }
}


public class App {

    public static void main(String[] args)
    {
         // I can create 3 type obj 
        // it can be instance of Parent,Sub1 or Sub2
        Parent polyObj = new Sub1();
        polyObj.show();
        
        polyObj = new Parent();
        polyObj.show();

        polyObj = new Sub2();
        polyObj.show();
        
        // Method Overriding is Run-time polymorphism

        // Method Overloading is Compile-time polymorphism

    }
}
