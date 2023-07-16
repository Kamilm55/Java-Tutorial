class Human
{
   private String name ; // Private variables can only use in same class
   private int age;

   // set functions always are void , because we don't return anything , only set value
   public void setName(String n)
   {
    name = n;
   }

   public String getName()
   {
    return name;
   }

   public void setAge(int a)
   {
    age = a;
   }

   public int getAge()
   {
    return age;
   }

}
/// Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.

public class app {

    public static void main(String[] args)
    {
        Human h1 = new Human();
        // System.out.println(h1.name); it does not work , because it is private variable
    
        //set values with methods (This called encapsualtion , we cannot do whatever we want , we only can do smth with specific method(behaviour) that created before)
        h1.setName("Kamil");
        h1.setAge(18);
        // But we can accces with method which i created before
        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}

