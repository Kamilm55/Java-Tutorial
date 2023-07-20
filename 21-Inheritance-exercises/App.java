//w3resource
//https://www.w3resource.com/java-exercises/index-inheritance.php

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

class Employee extends Person // inherit variables and methods from Parent class
{ // For inheriting methods we don't do anything explicitly
    // but for variable we should do with super(some variables)
    private String id;
    private String jobTitle;

    Employee(String firstName , String lastName , String jobTitle, String id )
    {
        super(firstName, lastName);// inherit variables of parent class
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() 
    {
       return this.id;
    }

    @Override
    public String getLastName() 
    {
        // return super.lastName + " " + this.jobTitle; 
        // lastName has private access in Person

        // We must call with method

        return super.getLastName() + " " + this.jobTitle; 
    }
}

class App
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Kamil","Memmedov");

        System.out.println(p1.getFirstName() + " " + p1.getLastName());
        
        
        Employee e1 = new Employee("Kamil","Memmedov","Developer","1564584858");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " " + e1.getEmployeeId());
    
    }
}
////////////////////////////////////////////////////////////////////////////////
// 9. Write a Java program to create a vehicle class hierarchy.
//  The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
//   Each subclass should have properties such as make, model, year, and fuel type.
//    Implement methods for calculating fuel efficiency, distance traveled, and 
//    maximum speed.


// UNCOMPLETED : because i don't know how can i calculate this operations

// abstract class  Vehicle
// {
//     private String make;
//     private String model;
//     private int modelYear;
//     private String fuelType;

//     public Vehicle(String make, String model, int modelYear, String fuelType) {
//         this.make = make;
//         this.model = model;
//         this.modelYear = modelYear;
//         this.fuelType = fuelType;
//     }

//     public String getMake() {
//         return make;
//     }

//     public void setMake(String make) {
//         this.make = make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public int getModelYear() {
//         return modelYear;
//     }

//     public void setModelYear(int modelYear) {
//         this.modelYear = modelYear;
//     }

//     public String getFuelType() {
//         return fuelType;
//     }

//     public void setFuelType(String fuelType) {
//         this.fuelType = fuelType;
//     }
//     ///
//     //  The abstract methods are meant to be overridden by child classes with specific implementations.
//     // In other words, an abstract method outlines what a subclass must implement,
//     //  but it leaves the specific details of the implementation
//     //   to the concrete subclasses that inherit from the abstract class
//     //    or implement the interface.


//     public abstract String getFuelEfficency();
//     public abstract int getDistance();
//     public abstract int getMaxSpeed();
  
// }

// abstract class Truck extends Vehicle
// {
//     public Truck(String make, String model, int modelYear, String fuelType)
//     {
//         super(make,model,modelYear,fuelType);
//     }
    
// }
// abstract class Car extends Vehicle
// {
//       public Car(String make, String model, int modelYear, String fuelType)
//     {
//         super(make,model,modelYear,fuelType);
//     }
// }
// abstract class Motorcycle extends Vehicle
// {
//   public Motorcycle(String make, String model, int modelYear, String fuelType)
//     {
//         super(make,model,modelYear,fuelType);
//     }
// }

class App
{
    public static void main(String[] args)
    {
    //     Car c1 = new Car("metal","BMW",2020,"oil");
    //     Truck t1 = new Truck("metal","MAN",2000,"oil");
    //     Motorcycle m1 = new Motorcycle("metal","Moped",2010,"oil");
    
    // System.out.println(c1.getMake() + " " + c1.getModel() + " " + c1.getModelYear() + " " + c1.getFuelType());
    // System.out.println(t1.getMake() + " " + t1.getModel() + " " + t1.getModelYear() + " " + t1.getFuelType());
    // System.out.println(m1.getMake() + " " + m1.getModel() + " " + m1.getModelYear() + " " + m1.getFuelType());
    
    }
}
////////////////////////////////////////////////////////////////////////////////