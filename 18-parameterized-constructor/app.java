
class Human
{
   private String name ;
   private int age;

    public Human()  // Default Constructor
    { 
        this.name = "John";
        this.age = 18;
    }

    public Human(String name,int age) // Parameterized Constructor
    {
        this.name = name;
        this.age = age;
    }

    // It is like method overloading , there 2 method with the same name
    // but they differ from their parameters 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class app {

    public static void main(String[] args)
    {
        Human h1 = new Human("Kamil",26); // for parameterized
        Human h2 = new Human();// for default
 

        System.out.println(h1.getName() + " : " + h1.getAge());
        System.out.println(h2.getName() + " : " + h2.getAge());
    }
}

