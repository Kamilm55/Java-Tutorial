//w3resource

// 1. Write a Java program to create a class called Animal with a method
// called makeSound(). Create a subclass called Cat that overrides
// the makeSound() method to bark.

// class Animal
// {
//     public void makeSound()
//     {
//         System.out.println("Animal sound");
//     }
// }

// class Cat extends Animal
// {
//     @Override
//     public void makeSound() // There is already this method , we overload and this works if we call from Cat class
//     {
//         System.out.println("Cat sound");
//     }
// }

// class App
// {
//     public static void main(String[] args)
//     {
//         Cat cat = new Cat();
//         cat.makeSound();// Print only cat sound
//                         //The 'Cat' class will override the makeSound()
//         Animal animal = new Animal();
//         animal.makeSound();
//     }
// }
////////////////////////////////////////////////////////////////////////////////

// 7. Write a Java program to create a class known as Person with methods
//  called getFirstName() and getLastName(). Create a subclass 
//  called Employee that adds a new method named getEmployeeId() and
// overrides the getLastName() method to include the employee's job title.

class Person
{
    private String firstName;
    private String lastName;

    Person(String firstName , String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() 
    {
        return this.firstName;
    }

    public String getLastName() 
    {
        return this.lastName;
    }
}

class Employee
{
    private String firstName;
    private String lastName;
    private String id;
    private String jobTitle;

    Employee(String firstName , String lastName , String jobTitle, String id )
    {
        this.id = id;
        this.firstName = firstName;
        this.jobTitle = jobTitle;
        // @Override
        this.lastName = lastName;
    }

    public String getEmployeeId() 
    {
       return this.id;
    }

    public String getLastName() 
    {
        return this.lastName + this.jobTitle;
    }
}

class App
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Kamil","Memmedov");

        System.out.println(p1.getFirstName() + " " + p1.getLastName());
        
        
        Employee e1 = new Employee("Kamil","Memmedov","Developer","1564584858");
        // System.out.println(e1.getFirstName() + " " + e1.getLastName() + " " + e1.getEmployeeId());
    
    }
}
////////////////////////////////////////////////////////////////////////////////