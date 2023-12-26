package FunctionalInterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Person p1 = new Person("Kamil" , "Male");

        helloToPerson(p1);

        Consumer<Person> helloToPersonWithFunctionalInterface = p -> System.out.println("HELLO " + p);

        helloToPersonWithFunctionalInterface.accept(p1);
    }
    public static void helloToPerson (Person p) {
        System.out.println("HELLO " + p.toString());
    }
}
class Person {
    private String name;
    private String gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }



}
