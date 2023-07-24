
abstract class Base // abstract class define methods before but not implements
                    // to implement we should inherit
{
    private  int value;
    private String name;
    abstract void display(); // abstract method

    public Base(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public void show() // Non-abstract method
    {
        System.out.println("Show A");
    }
}

class Child extends Base
{
       public Child(int value, String name) {
      super(value, name);
    }
    @Override
    public void display() // Implement abstract method
    {
        System.out.println("In Child display");
    }
}

abstract class Child2 extends Base
// Error: Child2 is not abstract and does not override abstract method display() in Base
// for fixing this issue we add abstract keyword but we cannot instansiate this
{
    // It says you should use display method if class is not abstract

     public Child2(int value, String name)
        {
         super(value, name);
        }

  void otherMethod()
  {
    System.out.println("Other");
  }
}

class ChildinChild2 extends Child2
{
     public ChildinChild2(int value, String name) {
      super(value, name);
    }
    @Override
    void display()
    {
        System.out.println("inner class of Child2");
    }
}

public class App {
    public static void main(String[] args) {
        // Base b1 = new Base(); // We cannot use abstract class directly
        Base c1 = new Child(15,null);

        // Base c2 = new ChildinChild2(); // If type is Base otherMethod is not working
        // c2.otherMethod();

        Child2 c2 = new ChildinChild2(45,"Kamil");
        c2.otherMethod();
        c2.display();
        c2.show();

        c1.display();
        c1.show(); // inherit from Base (it is already implemented in base because it is non-abstract)

    }    
}
