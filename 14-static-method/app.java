class Employee
{
    String name ;
    static int numberOfEmp = 0;// Static TYPE



    public Employee()
    {
        System.out.println("in constructor");
        numberOfEmp++;
    }

    // public keyword

    //So, public void show() is a public method that can be accessed from anywhere,
    // while void show() has package-private access and can only be accessed within
    // the same package.

    // in this case there is no difference use public keyword or not , because we don't use any other class from other packages

   public void show() //The public keyword is an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class.
    {
         System.out.println(name + " , The number of all employees:" + numberOfEmp);
    }

    public static void showStatic(Employee obj)
    {
        // System.out.println(name + " , The number of all employees:" + numberOfEmp);
        // we cannot use name , because it is non-static

        // For achieving this issue we should use instance reference
        System.out.println(obj.name + " , The number of all employees:" + numberOfEmp);        
    }

}


public class app {

    // Why we use static in main method?

    // Static Modifier: The static keyword indicates that the main method belongs
    // to the class itself, rather than an instance of the class.
    // This allows the main method to be executed without the need to create an 
    //object of the class.

     public static void main(String[] args) {
  
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.name = "emp1";
        emp2.name = "emp2";

        emp1.show();
        emp2.show();

        // emp2.showStatic(); // Static keyword must be called with class name not instance name
        Employee.showStatic(emp2);


        
        // Static methods in Java have several use cases and benefits:

        // No need for an instance: Static methods can be invoked directly on the class itself without creating an instance of the class. This can be useful when you want to perform a utility operation that doesn't require any specific instance data or when you want to avoid creating unnecessary objects.
        // Utility methods: Static methods are commonly used for utility functions that perform common operations and don't rely on instance-specific data. For example, the Math class in Java contains various static methods like Math.abs(), Math.max(), etc., which perform mathematical operations.
        // Organization and modularity: Static methods can help organize related functionality within a class. By grouping related methods together as static methods, you provide a clear and concise structure to your code. It also promotes modularity, as you can use these static methods across different parts of your codebase without having to duplicate the code.
        // Convenience: Static methods can offer convenience by providing easy access to common operations without the need to create an object. This can simplify code and make it more readable. For example, the Arrays class in Java provides static methods like Arrays.sort(), Arrays.binarySearch(), etc., for performing operations on arrays.
        // Efficiency and performance: Static methods are resolved at compile-time rather than runtime, which can lead to better performance compared to instance methods. Since there is no need to resolve the method based on the instance, it can potentially save some execution time.
        // Callbacks and functional interfaces: Static methods can be used as callbacks or as implementations of functional interfaces. In Java 8 and later versions, static methods can be referenced by method references or used as lambda expressions, allowing for more concise and functional programming styles.
       
        // It's important to note that static methods cannot access instance variables directly (unless they receive an instance as a parameter), as they are not associated with any particular instance of the class. Therefore, static methods are typically used for operations that don't rely on instance state.
        // Overall, static methods provide flexibility, organization, and performance benefits in certain scenarios, making them a valuable tool in Java development.
    }
}
