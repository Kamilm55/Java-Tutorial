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


/////////////////////////////////////////////////Abstract Factory Components \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
interface Button {
   // void paint(); -> change to ->
    void paint(String btnType);
}

class WindowsButton implements Button {
    public void paint(String btnType) {
        System.out.println("Rendering a button in Windows style.");
    }
}

class MacButton implements Button {
    public void paint(String btnType) {
        System.out.println("Rendering a button in Mac style.");
    }
}

class LinuxButton implements Button {
    public void paint(String btnType) {
        System.out.println("Rendering a button in Linux style.");
    }
}

interface Checkbox {
    void paint();
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}

class MacCheckbox implements Checkbox {
    private int countOfBoxes;
    public MacCheckbox(int countOfBoxes) {
        this.countOfBoxes = countOfBoxes;
    }

    public void paint() {
        System.out.println("Rendering a checkbox in Mac style.");
    }
}

class LinuxCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in Linux style.");
    }
}

interface TextField {
    void paint();
}

class WindowsTextField implements TextField {
    public void paint() {
        System.out.println("Rendering a text field in Windows style.");
    }
}

class MacTextField implements TextField {
    public void paint() {
        System.out.println("Rendering a text field in Mac style.");
    }
}

class LinuxTextField implements TextField {
    public void paint() {
        System.out.println("Rendering a text field in Linux style.");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextField createTextField();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    public TextField createTextField() {
        return new WindowsTextField();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        int countOfBoxes = 5; // default box count -> by encapsulating this creation, I don't need to know specific info about MacCheckBox (default count)
        return new MacCheckbox(countOfBoxes);
    }

    public TextField createTextField() {
        return new MacTextField();
    }
}

class LinuxFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    public TextField createTextField() {
        return new LinuxTextField();
    }
}

class App
{
         // Not Ideal code \\
    private WindowsButton windowsButton; // if we create var with concrete class type, it is not efficient
    private WindowsCheckbox windowsCheckbox;
    private WindowsTextField windowsTextField;
    // Firstly, our app supports only windows, then we need Mac -> and we add Mac (we cannot add with same name, we must rename for mac)
    private MacButton macButton;
    private MacCheckbox macCheckbox;
    private MacTextField macTextField;
    // Then we need Linux
    private LinuxButton linuxButton;
    private LinuxCheckbox linuxCheckbox;
    private LinuxTextField linuxTextField;

        // Ideal code \\
    private Button button;
    private Checkbox checkbox;
    private TextField textField;
        //          \\
    public static void main(String[] args) {
        //FactoryDesign1();
        //FactoryDesign2();
        AbstractFactoryDesign();
    }

    private static void AbstractFactoryDesign() {
        // Obsidian canvas deep explanation -> obsidian://open?vault=Obsidian%20Vault&file=Abstract%20Factory%20Design%20Pattern.canvas
        // YouTube explanation -> https://www.youtube.com/watch?v=v-GiuMmsXj4&t=20s
        // S,SRP +
        // O,OCP +
        // L,LSP -  --> It states that objects of a superclass should be replaceable with objects of a subclass without affecting the functionality of the program. This principle ensures that a subclass can stand in for its superclass without the need for modification
        // I,ISP -  --> Interface Segregation Principle -> This principle states that no client should be forced to depend on methods it does not use. Instead of one fat interface, multiple small and specific interfaces are preferred. This avoids the implementation of unnecessary methods in a class, leading to more maintainable and modular code
        // D,DIP +
        // Encapsulation, Inheritance, Polymorphism, Abstraction, DRY +
        // Polymorphism --> I have defined interfaces Button, Checkbox, TextField, and GUIFactory. Each concrete class implements one of these interfaces. This is where polymorphism comes into play. For example, WindowsButton, MacButton, and LinuxButton all implement the Button interface. buttons with same type (Button interface) can operate differently from one another

        // todo: Implementing LSP -> add feature that some subclass of interface does not support and throw exception which violates lsp
        //  --> then refactor with separating more flexible interfaces

        // todo: Implementing ISP -> add some methods to components and implement multiple small interfaces -> only needed interfaces must be implemented

        // QUESTION: We can achieve clean code with changing products type to interface from concrete class, why we need factories?

        App app = new App();
        String os = System.getProperty("os.name").toLowerCase();
        app.createUiInIdealCode(os);
        app.IdealInOtherMethod1(os);
        app.IdealInOtherMethod2();


        app.notIdealCreateUI(os);
        app.NotIdealInOtherMethod1(os);
        app.NotIdealInOtherMethod2(os);

        app.paint();
    }

    private void IdealInOtherMethod2() {
        // We want paint for current os with extracting method for painting

        // SRP
        // responsibility 1: Based on currently used os paint components
        // DIP --> Dependency Inversion Principle --> we don't depend on concrete class types, instead of we depend on interfaces which is more abstract, flexible
        paintInIdealCode(button,checkbox,textField);// we send components
    }

    private void paintInIdealCode(Button button, Checkbox checkbox, TextField textField) {
        button.paint("Draw");
        checkbox.paint();
        textField.paint();
    }

    private void NotIdealInOtherMethod2(String os) {
        // We want paint for current os with extracting method for painting

        if (os.contains("win")) {
            windowsButton = new WindowsButton();
            windowsCheckbox = new WindowsCheckbox();
            windowsTextField = new WindowsTextField();

            // In ideal code we don't need to interact with client code (main flow)
            // It also violates SOLID --> SRP -> The more increase features, the more violation of srp increase
            // responsibility 1: Which os currently use
            // responsibility 2: Based on currently used os paint components
            paintInNotIdealCode(windowsButton,windowsCheckbox,windowsTextField);// we send components
        }
        else if (os.contains("mac")) {
            macButton = new MacButton();
            macCheckbox = new MacCheckbox(12);
            macTextField = new MacTextField();

            paintInNotIdealCode2(macButton,macCheckbox,macTextField);
        }
        else if (os.contains("linux")) {
            linuxButton = new LinuxButton();
            linuxCheckbox = new LinuxCheckbox();
            linuxTextField = new LinuxTextField();

            paintInNotIdealCode3(linuxButton,linuxCheckbox,linuxTextField);
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }
    }

    private void paintInNotIdealCode(WindowsButton button, WindowsCheckbox checkbox, WindowsTextField textField) {
        button.paint("Draw");
        checkbox.paint();
        textField.paint();
    }
    private void paintInNotIdealCode2(MacButton button, MacCheckbox checkbox, MacTextField textField) {
        button.paint("Draw");
        checkbox.paint();
        textField.paint();
    }
    private void paintInNotIdealCode3(LinuxButton button, LinuxCheckbox checkbox, LinuxTextField textField) {
        button.paint("Draw");
        checkbox.paint();
        textField.paint();
    }

    //
    private void IdealInOtherMethod1(String os) {
        // We want paint for current os
        button.paint("Draw");
        checkbox.paint();
        textField.paint();
    }

    private void NotIdealInOtherMethod1(String os) {
        // I want to use button which is currently in use, I don't know specific info which os currently have
        // for this I must recall  if-else statements --> violation of DRY

        // We want paint for current os

        if (os.contains("win")) {
            windowsButton = new WindowsButton();
            windowsCheckbox = new WindowsCheckbox();
            windowsTextField = new WindowsTextField();

            windowsButton.paint("Draw");
            windowsCheckbox.paint();
            windowsTextField.paint();
        }
        else if (os.contains("mac")) {
            macButton = new MacButton();
            macCheckbox = new MacCheckbox(12);
            macTextField = new MacTextField();

            macButton.paint("Draw");
            macCheckbox.paint();
            macTextField.paint();
        }
        else if (os.contains("linux")) {
            linuxButton = new LinuxButton();
            linuxCheckbox = new LinuxCheckbox();
            linuxTextField = new LinuxTextField();

            linuxButton.paint("Draw");
            linuxCheckbox.paint();
            linuxTextField.paint();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }

    }


    private void notIdealCreateUI(String os) {
        // SOLID -> 2.OCP --> we cannot extend our code

        // Firstly, our app supports only windows, then we need Mac

        if (os.contains("win")) {
            windowsButton = new WindowsButton();
            windowsCheckbox = new WindowsCheckbox();
            windowsTextField = new WindowsTextField();
        }
        // Adding Mac
        else if (os.contains("mac")) {
            // If mac components names was same, we could change easily, but we could not
            // --> we must also change variables names which is violates ocp --> close for modification --> actually we must modify
            macButton = new MacButton();
            macCheckbox = new MacCheckbox(12);
            macTextField = new MacTextField();
        }
        // Adding linux
        else if (os.contains("linux")) {
            // --> we must also change variables names which is violates ocp --> close for modification --> actually we must modify
            // They also make difficult to operate something in different places, imagine that we need use these components
            // across all pages with multiple methods, by defining concrete class type "not defining abstract type (interface)" we violate abstraction
            // we cannot use easily in other methods
            linuxButton = new LinuxButton();
            linuxCheckbox = new LinuxCheckbox();
            linuxTextField = new LinuxTextField();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }
    }

    public void createUiInIdealCode(String os) {

        //Learn: There are already have 3 variables with type of interface (Button,Checkbox,TextField)  --> We can change this for requirements, for ex: if our need for Linux
        // all components can inject for this type (with interface abstraction) --> inside not ideal code we cannot change easily

        // SRP
        // responsibility 1: Which os currently use

        if (os.contains("win")) {
            button = new WindowsButton();
            checkbox = new WindowsCheckbox();
            textField = new WindowsTextField();
        } else if (os.contains("mac")) {
            button = new MacButton();
            checkbox = new MacCheckbox(12);
            textField = new MacTextField();
        }
        // Adding linux
        else if (os.contains("linux")) {
            button = new LinuxButton();
            checkbox = new LinuxCheckbox();
            textField = new LinuxTextField();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }

    }
    public void paint() {
        button.paint("Submit");
        checkbox.paint();
        textField.paint();
    }

    ///////////////////////////////////////////  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

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