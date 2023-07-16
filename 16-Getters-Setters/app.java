// We use automatic getter and setter using Source actions (vscode feature)
class Human
{
   private String name ; // Private variables can only use in same class
   private int age;

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
       
        h1.setName("Kamil");
        h1.setAge(18);
        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}

