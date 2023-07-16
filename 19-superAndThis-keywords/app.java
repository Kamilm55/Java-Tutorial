
class A /* extends Object */ // Every class extends Object
{

    public A() 
    {
        // super()
        this(null);

        System.out.println("In default A constructor");
    }

    public A(String name) //parameterized
    {
        // super()
        
        System.out.println("In parameterized A constructor");
    }
}

class B extends A
{
    public B()
    {
        // super() //Every constructor has super() firstly , that is called parent constructor
        // super(null);// we can call explicitly
        // if we call with parameter it calls  parameterized parent constructor
        // this(); it is recursive opeartions
        System.out.println("In default B constructor");
    }

     public B(String name) //parameterized
    {
        // super()
        //super("Murad"); // if we don't write this it calls only super() and default A
        this();// firt runs super() , then default B constructor , then own constructor
        
        // this("NAME"); it is recursive opeartions
        System.out.println("In parameterized B constructor");

        // this() keyword can be used for calling other type of constructor
        // if it is inside parameterized one it can call  default one, not the same constructor
    }
}

public class app {
    
    public static void main(String[] args)
    {
        B b = new B("Kamil"); // We only create any instance object with B class

    }
}
