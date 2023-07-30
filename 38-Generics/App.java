// class Person
// {
//     private String value;

//     public String getValue() {
//         return value;
//     }

//     public void setValue(String value) {
//         this.value = value;
//     }

    
// }
class Person <T>
{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    
}

public class App {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<Integer> p2 = new Person<Integer>();//For type safety we explicitly write wrapper type (reference data type)
        Person<Object> p3 = new Person<Object>();


        p1.setValue("Kamil");
        System.out.println(p1.getValue());

        // and i want to set other data type how to do?

        p2.setValue(5);
        System.out.println(p2.getValue());
        
//         The main benefits of using generics include:

// Type Safety: Generics provide compile-time type checking, which helps to detect type-related errors at compile time rather than at runtime. This prevents ClassCastException and makes your code more robust and reliable.

// Code Reusability: Generics allow you to create reusable code components that can operate on different data types. By defining a generic class or method, you can use it with different types without writing separate implementations for each type.

// Elimination of Casting: Without generics, you often need to perform explicit casting when retrieving elements from collections or containers. With generics, this casting is unnecessary, as the compiler ensures the type compatibility

    }
}
