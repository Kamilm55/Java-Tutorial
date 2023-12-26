package CombinatorPattern;

import ImperativeVsDeclarative.Person;

import static CombinatorPattern.ValidationService.check;

public class Main {
    public static void main(String[] args) {
        Person personValid = new Person("Kamil","Male" , 19);
        Person personNonValid = new Person("Kamil","Male" , 13);


        boolean isValid = check(personValid.getName(), personValid.getGender(), personValid.getAge());
        boolean isValid2 = check(personNonValid.getName(), personNonValid.getGender(), personNonValid.getAge());
        System.out.println(isValid);
        System.out.println(isValid2);

        //todo:  What is the cause of the exception (say me specific  ,"name||gender||age" which error)


    }
}
