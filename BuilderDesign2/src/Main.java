//Exercise:
//        Create a Person class using the Builder design pattern that allows you to construct Person objects with the following optional properties:

//        Name (required)
//        Age (optional)
//        Address (optional)
//        Phone Number (optional)

import Person.Person;

//        Implement the Person class and the corresponding PersonBuilder class to achieve this.
public class Main {
    public static void main(String[] args) {
      // This design is useful for optional fields
        Person person1 = new Person("John")
                .setAge(30)
                .setAddress("123 Main St")
                .setPhoneNumber("+1234567890");

        Person person2 = new Person("Alice")
                .setPhoneNumber("+9876543210");

        Person p3 = new Person("John");
        Person p1 = new Person("John",30,"123 Main St","+1234567890");//Follow order and fill all fields that note in parameterized constructor
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(p1);
        System.out.println(p3);

    }
}