package Stream;

import ImperativeVsDeclarative.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Alice", "Female",15));
        peopleList.add(new Person("Bob", "Male",56));
        peopleList.add(new Person("Charlie", "Male",78));
        peopleList.add(new Person("Diana", "Female",45));
        peopleList.add(new Person("Eva", "Female",7));


//        peopleList.stream()
//                .map(person -> person.getGender())
//                .collect(Collectors.toSet())
//                .forEach(gender -> System.out.println(gender));

        peopleList.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        ///////////
        System.out.println();
        Function<Person, String> getGender = Person::getName;
        //Function<Person, Integer> getGender = Person::getAge;
        Collector<String, ?, Set<String>> set = Collectors.toSet();
        Consumer<String> println = System.out::println;

        peopleList.stream()
                .map(getGender)
                .collect(set)
                .forEach(println);

        /////
        peopleList.stream()
                .filter(p -> p.getAge() < 70)
                .forEach(System.out::println);

        ///
        peopleList.stream()
                .map(Person::getName)
                .mapToInt(p -> p.length())
                .forEach(System.out::println);
    }
}
