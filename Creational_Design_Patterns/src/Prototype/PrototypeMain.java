package Prototype;

import Prototype.templates.Contractor;
import Prototype.templates.Department;
import Prototype.templates.Employee;
import Prototype.templates.Role;
import Prototype.templates.contracts.IPrototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {

    //Learn: Main idea => So, the main idea behind this pattern is to hide the complexity of object creation
    // and provide a way to create new objects by copying existing ones.

    // Learn: https://www.pentalog.com/blog/design-patterns/prototype-design-pattern/
    // https://github.com/AbstractSoft/design_patterns/

    public static void main(String[] args) {
        List<Employee> employeesList = new ArrayList<>();

        Employee employee = new Employee();

        Employee employee1 =  employee.clone();
        employee1.setFirstName("First Name 1");
        employee1.setLastName("Last Name 1");
        employee1.setAge(25);
        employee1.setAddress("Employee Address 1");

        Employee employee2 =  employee.clone();
        employee2.setFirstName("First Name 2");
        employee2.setLastName("Last Name 2");
        employee2.setAge(28);
        employee2.setAddress("Employee Address 2");
        employee2.setDepartment(Department.ACCOUNTING);

        Employee employee3 = employee2.clone();
        employee3.setLastName("Last name of copy employee 2 changed to Kamil");

        Employee employee4 = employee2.clone();
        employee4.setLastName("Last name of copy employee 4 changed to Samir");
        employee4.setDepartment(Department.IT);
        employee4.setAddress("address of copy employee 4 changed to New address");

        Employee employee5 = employee4.clone();
        employee5.setAge(103);

        Employee employee6 = employee1.clone();
        employee6.setRole(Role.Director);

        // Learn: easily we can copy and increase flexible obj like dynamic (runtime) constructor

        Contractor contractor1 = new Contractor();///

        employeesList.addAll(
                List.of(employee1,employee2,employee3,employee4,employee5,employee6)
        );

        System.out.println("Furniture Shop Employees");
        for (Employee empl : employeesList) {
            System.out.println("Employee: " + empl.getFirstName() + ", " + empl.getLastName() + " - " +
                    empl.getDepartment() + ", " + empl.getRole() + ", " + empl.getPosition());
        }

        System.out.println("Done.");
    }



    ///////////////////////
    // Problem:
    //Say you have an object, and you want to create an exact copy of it. How would you do it?
    // First, you have to create a new object of the same class.
    // Then you have to go through all the fields of the original object and copy their values over to the new object.
    //Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields
    // may be private and not visible from outside of the object itself.

    // There’s one more problem with the direct approach. Since you have to know the object’s class to create a duplicate,
    // your code becomes dependent on that class. If the extra dependency doesn’t scare you, there’s another catch.
    // Sometimes you only know the interface that the object follows, but not its concrete class, when, for example,
    // a parameter in a method accepts any objects that follow some interface.

    // Solution => https://refactoring.guru/design-patterns/prototype

    // why we need prototype design pattern?
    //
    //ChatGPT
    //The Prototype design pattern is used for several reasons in software development, and its primary purpose is to enable the creation of new objects by copying an existing object, known as the prototype. Here are some reasons why the Prototype design pattern is useful:
    //
    //Efficient Object Creation:
    //
    //Creating an object by cloning an existing instance can be more efficient than creating it from scratch. This is particularly true when the cost of initializing an object is high, and the object's state is largely similar to an existing instance.
    //Avoiding Subclassing:
    //
    //Sometimes, classes are designed to have multiple variations. Instead of creating a subclass for each variation, the Prototype pattern allows you to create new instances by copying a prototype, eliminating the need for extensive subclassing.
    //Dynamic Object Creation:
    //
    //The Prototype pattern allows for dynamic object creation. Clients can specify the type and configuration of an object at runtime, and the system creates the desired object by cloning the appropriate prototype.
    //Hiding Complex Initialization Logic:
    //
    //Objects may require complex initialization logic or have dependencies on other objects. With the Prototype pattern, this initialization logic can be encapsulated within the prototype, simplifying the creation of new instances for clients.
    //Reducing Code Duplication:
    //
    //When creating similar objects with only slight differences, copying an existing prototype can help avoid code duplication. It promotes code reusability by providing a mechanism to clone and customize existing instances.
    //Maintaining Consistency:
    //
    //Using prototypes helps maintain consistency among objects. Since new objects are created by copying an existing prototype, they start with the same initial state. This ensures that the new objects share a common structure and configuration.
    //Customization without Class Explosion:
    //
    //The Prototype pattern allows customization of objects without creating a large number of subclasses. Instead of creating a separate subclass for each variant, you can create prototypes for each variant and clone them as needed.
    //State Preservation:
    //
    //Prototype pattern facilitates the creation of objects with a specific state. Objects can be configured to a particular state, and this state can be preserved when creating new instances through cloning.
    //It's important to note that the effectiveness of the Prototype pattern depends on the specific requirements of the application. In some cases, other creational patterns like Factory Method or Builder may be more suitable. The Prototype pattern is particularly useful when the cost of creating an object is high, and there is a need for dynamic or runtime object creation with various configurations.





}
