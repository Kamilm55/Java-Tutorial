package ImperativeVsDeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of people
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Alice", "Female"));
        peopleList.add(new Person("Bob", "Male"));
        peopleList.add(new Person("Charlie", "Male"));
        peopleList.add(new Person("Diana", "Female"));
        peopleList.add(new Person("Eva", "Female"));

        // Filtering females and adding them to a new ArrayList
        List<Person> femalesList = new ArrayList<>();
        for (Person person : peopleList) {
            if ("Female".equals(person.getGender())) {
                femalesList.add(person);
            }
        }

        // Printing the females
        System.out.println("// Imperative approach");
        for (Person female : femalesList) {
            System.out.println(female);
        }
//////////////////////////
        System.out.println("// Declarative approach");

       List<Person> females =  peopleList.stream()
                .filter( person -> "Female".equals(person.getGender()))
                .toList();

       females.forEach(System.out::println);
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
