//We have 3 types of phone
// Base class is phone
// client wants cheap and performant phone -> Xiaomi
// client wants cheap phone for only call -> Nokia
// client wants  phone for photo -> Iphone

//Then we can add some phone for some requests from the clients
package com.FactoryDesign;

import com.FactoryDesign.Phones.*;
// Abstract Product
interface Food {
    void prepare();
    void cook(int time);
}

// Concrete Products
class Pizza implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }

    @Override
    public void cook(int time){
        System.out.println("Pizza cooked during " + time + " min.");
    }
}

class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }
    @Override
    public void cook(int time) {
        System.out.println("Burger cooked during " + time + " min.");
    }
}

// Abstract Factory
abstract class FoodFactory {
    public abstract Food createFood();
    public abstract Food createFood(int time); // User decides which amount of time food will be cooked
}

// Concrete Factories
class PizzaFactory extends FoodFactory {
    @Override
    public Food createFood() {
        Food pizza =  new Pizza();

        pizza.prepare();
        pizza.cook(30); // additional process when pizza food created

        // Change occurs creation of pizza
        // 1st change
        System.out.println("Send email with smtp");
        // 2nd change
        System.out.println("Print receipt (qebz)");

        return pizza;
    }

    @Override
    public Food createFood(int time) {
        Food pizza =  new Pizza();

        pizza.prepare();
        pizza.cook(time);

        return pizza;
    }
}

class BurgerFactory extends FoodFactory {
    @Override
    public Food createFood() {
        Burger burger = new Burger();
        burger.prepare();

        System.out.println("Log order message"); // additional process when burger food created
        return burger;
    }

    @Override
    public Food createFood(int time) {
        Burger burger = new Burger();
        burger.prepare();
        burger.cook(time);

        System.out.println("Log order message"); // additional process when burger food created
        return burger;
    }


}

// Adding a new product and factory without modifying existing code
class Steak implements Food {
    @Override
    public void prepare() {
        System.out.println("Preparing Steak");
    }

    @Override
    public void cook(int time) {
        System.out.println("Steak cooked during " + time + " min.");
    }
}

class SteakFactory extends FoodFactory {
    @Override
    public Food createFood() {
        Food steak = new Steak();
        steak.prepare();
        steak.cook(60);
        System.out.println("Log order msg steak");

        return steak;
    }

    @Override
    public Food createFood(int time) {
        Food steak = new Steak();
        steak.prepare();
        steak.cook(time);
        System.out.println("Log order msg steak");

        return steak;
    }
}

 class App
{
    public static void main(String[] args) {
        //FactoryDesign1();
        FactoryDesign2();
    }

    private static void FactoryDesign2() {
        // Learn:
        //  Creational Design pattern
        //  The main purpose of this pattern is to create an abstract class (a.k.a factory) for creating objects.
        //  Because of that, the object instantiation is done by its subclasses

        // QUESTION: Why we need "the object instantiation is done by its subclasses"?
        //  Answer: Open/Closed Principle (OCP) and the Single Responsibility Principle (SRP) from SOLID
        //  Decoupling Object Creation from Use: The Factory Method pattern separates the code that creates objects from the code that uses them. This decoupling means that the client code does not need to know the specifics of how the objects are created, only how to interact with them through an abstract interface.
        //  for example: I want to cook pizza 30 min, user has no info and no interaction to this in main flow ->
        //  if we want user decide which time must be cooked also it must not be outside factory

        System.out.println("---------------------------");

        // Order with Factory
        FoodFactory pizzaFactory = new PizzaFactory();
        Food pizza1 = pizzaFactory.createFood(); // it cooked -> 30 minutes -> we don't know this specific info
        // change occurs in factory -> it also sends email smtp, and print recipient when create food

        System.out.println("-------Difference---------");

        // Order without Factory, if we want to cook on our own
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.cook(50); // we don't know what is default value therefore we must decide time own and it is wrong -> time must be 30 min
        // I don't know  email must be sent and  recipient printed after creating food


        // Conclusion: Creation and usage must be decoupled -> We just want to use this, if in main flow we implement this it can be,
        // but we must all specific info about implementation and when their impl changes (creating pizza), main code must be change
        // which is violates -> OCP (Open for extension, Close for modification "modification of main flow(client code)")
        // even if i know these details it increases repetition of code and violates DRY ->
//        Pizza pizza2 = new Pizza();
//        pizza.prepare();
//        pizza.cook(30);
//        System.out.println("Send email with smtp"); // we also must know how email msg is sent, form of msg
//        System.out.println("Print receipt (qebz)"); // form of receipt
//
//        Pizza pizza3 = new Pizza();
//        pizza.prepare();
//        pizza.cook(30);
//        System.out.println("Send email with smtp");
//        System.out.println("Print receipt (qebz)");
//
//        System.out.println("-------Difference---------");
//        System.out.println("2 foods ->  9 line (repetitive,knowing all impl details) vs 3 line (not repetitive, not knowing all impl details)");
//
//        FoodFactory pizzaFactory2 = new PizzaFactory();
//        Food pizza2WithFactory = pizzaFactory2.createFood();
//        Food pizza3WithFactory = pizzaFactory2.createFood();

        // if we want to use createFood() in other places we just instantiate factory and create food from it
        // but without this we must copy all codes with the details which is error-prone

        System.out.println("---------------------------");


        //Learn: Adding new type Steak -> OCP -> Both impact to client code but with factory we just call,
        // actual modification inside factory, outside main flow -> if we want to change all log msg or smth in impl
        // we do this outside from client code, but without this pattern we must change all logs where i used
        // Violation of ocp -> when we want to modify we do this only one place (where we create, not where we use)
        // when we want to add only expand, because open for extension -> add concrete product class and implements interfaces

        // Without Factory
        Steak steak = new Steak();
        steak.prepare();
        steak.cook(90);
        System.out.println("Log order msg steak");// if we know all details we must log own

        // With Factory
        FoodFactory steakFactory = new SteakFactory();
        steakFactory.createFood();// inside there is log msg
        System.out.println("---------------------------");

        //Encapsulation:
        //  The Factory Method pattern encapsulates the instantiation logic within the factory classes.
        //  This ensures that the creation process is centralized and can be managed or changed without affecting the client code.

        //Polymorphism:
        //  The pattern allows the client to use polymorphism.
        //  The client code can interact with different types of products through a common interface (Food), making the code more flexible and reusable.

//        Conclusion
//        By delegating the object instantiation to its subclasses, the Factory Method pattern provides several advantages:
//
//        Flexibility: Decouples object creation from usage, allowing for easier changes and extensions.
//        OCP Adherence: Allows the system to be extended without modifying existing code.
//        SRP Adherence: Each class has a single responsibility, making the system more organized.
//        Scalability: Easier to manage and scale by adding new product types without affecting existing code.
//        Encapsulation and Polymorphism: Encapsulates creation logic and allows for polymorphic behavior, making the client code simpler and more flexible.

//        Disadvantages of the Factory Design Pattern
//        Complexity: Introducing factories and factory hierarchies adds complexity to the codebase, which can be overkill for simple applications or scenarios where the benefit of flexible object creation is minimal.
//        Overhead: The need to create separate factory classes for each type of product can lead to additional overhead, both in terms of development time and maintenance.

    }

    private static void FactoryDesign1() {
        String req = "Reliable";
//        if(req == "cheap")
//        Phone p = new Nokia();
//        Phone p2 = new Iphone();
//        p.feauture();
        //For changing value we must change new Smth to new Other
        // It is not good to change in the main

        // client wants cheap and Reliable phone -> Samsung

        // Not to change code in main flow we use FactoryDesign pattern (creational)

        Phone p = FactoryDesignSystem.whichPhone(req);
        p.feauture();

        // We can add more models to FactoryDesignSystem
        // Then we don't need to change in this only we enter request
    }
}