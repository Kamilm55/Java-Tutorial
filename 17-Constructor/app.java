// Default parameters for objs using constructor
class Human
{
   private String name ;
   private int age;
 // Actually we can assign in this ;
// But we have standard : Assignment , calculations and any other 
//implementations should be done with methods 
// Constructor like methods (but no return type)

    public Human()
    {
        System.out.println("In constructor"); 
        // Constructor is called automatically when creating obj , unlike other methods
        
        name = "John";
        age = 22;
    }

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
        Human h1 = new Human(); 
        Human h2 = new Human();// for default
       
        h1.setName("Kamil");
        h1.setAge(18);

        System.out.println(h1.getName() + " : " + h1.getAge());
        System.out.println(h2.getName() + " : " + h2.getAge());
    }
}

