

// Try to do this task: (with the factory then abstract fcatory design)
//https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java;

import Factory.*;


public class Main{

    public static void main(String[] args) {
//       Computer pc1 = new PC("12","32","intel");
//        Computer server1 = new Server("8","64","amd"); //Without Factory

        Computer pc1 = ComputerFactory.createComp("pc","12","32","intel");
        Computer server1 =ComputerFactory.createComp("server","8","64","amd"); //With Factory

        System.out.println(pc1);
        System.out.println(server1);

//        While both the Abstract Factory design pattern and the Factory Method design pattern are creational patterns and share some similarities, there are certain issues that can be addressed more effectively with the Abstract Factory pattern than with the Factory Method pattern. However, it is essential to note that the choice between these patterns depends on the specific requirements and design considerations of your application.
//
//                Here are some issues that the Abstract Factory pattern can address that may not be as straightforward to handle using the Factory Method pattern:
//
//        Creating Families of Related Objects: The Abstract Factory pattern is specifically designed to create families of related objects. It allows you to create multiple object types that are designed to work together seamlessly. In contrast, the Factory Method pattern focuses on creating individual objects, and it's not inherently designed to handle the creation of multiple related objects.
//
//        Interface-Based Object Creation: With the Abstract Factory pattern, you define an abstract factory interface that declares methods for creating different types of related objects. This interface allows you to create families of objects without tightly coupling the client code to specific concrete implementations. In the Factory Method pattern, you typically have a single method for creating a specific object, which may lead to a less flexible and more tightly coupled design.
//
//                Object Configuration and Variation: The Abstract Factory pattern is well-suited for scenarios where you need to configure or vary the way objects are created. By changing the concrete factory implementation, you can produce different sets of related objects. While you can achieve some level of variation with the Factory Method pattern by subclassing and implementing different factory methods, the Abstract Factory pattern provides a more straightforward approach for this purpose.
//
//                Scalability for Complex Object Creation: The Abstract Factory pattern is advantageous in complex applications where you have multiple object families and need to create them together. It helps in managing the complexity of creating related objects and ensures that they are consistent and compatible with each other. The Factory Method pattern may become more cumbersome when dealing with multiple complex families of objects.
//
//        Plug-and-Play Component Integration: The Abstract Factory pattern can facilitate the integration of different components or modules in a system, as long as they adhere to the common abstract factory interface. This allows you to swap out entire families of objects without affecting the client code. The Factory Method pattern doesn't inherently provide the same level of plug-and-play integration, as it focuses on creating individual objects.
//
//        In conclusion, while the Factory Method pattern is simpler and may be sufficient for certain scenarios, the Abstract Factory pattern provides a more comprehensive solution when dealing with families of related objects, configuration variations, and complex object creation requirements. The decision to use one pattern over the other depends on the specific needs and design goals of your application.
    }
}