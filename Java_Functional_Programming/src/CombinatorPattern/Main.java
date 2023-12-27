package CombinatorPattern;

import ImperativeVsDeclarative.Person;

import java.util.Collection;
import java.util.List;

import static CombinatorPattern.ValidationService.check;
import static CombinatorPattern.ValidationServiceCombinator.ValidationResult.SUCCESS;
import static CombinatorPattern.ValidationServiceCombinator.checkGender;
import static CombinatorPattern.ValidationServiceCombinator.checkUsername;

public class Main {
    public static void main(String[] args) {
        Person personValid = new Person("Kamil","Male" , 19);
        Person personNonValid = new Person("l","ale" , 3);


        boolean isValid = check(personValid.getName(), personValid.getGender(), personValid.getAge());
        boolean isValid2 = check(personNonValid.getName(), personNonValid.getGender(), personNonValid.getAge());
//        System.out.println(isValid);
//        System.out.println(isValid2);

        //todo:  What is the cause of the exception (say me specific  ,"name||gender||age" which error)
        // use ValidationServiceCombinator functional interface

        ValidationServiceCombinator.ValidationResult validationResult = ValidationServiceCombinator.
                                                                                                    checkAdult()
                                                                                                    .and(checkUsername())
                                                                                                    .and(checkGender())
                                                                                                    .apply(personNonValid);

        // Learn:
        //  ValidationServiceCombinator extends Function<Person, ValidationServiceCombinator.ValidationResult> ,
        //  we can show as this ValidationServiceCombinator<Person, ValidationResult>
        //  checkAdult and other static method return ValidationServiceCombinator this type
        //  (This returns Function that accepts person return ValidationResult )
        //  return p ->  p.getName().length() > 2 && p.getName().length() < 25 ? SUCCESS : USERNAME_IS_NOT_VALID;
        //  when we want to use this Function we should call apply method ->  validationResult apply(Person p);
        //  if we don't call the apply method , this does not return anything

        // Learn:
        //  ValidationServiceCombinator.checkAdult() returns instance which type is ValidationServiceCombinator
        //  inside and method we can use this.apply method because this = instance of ValidationServiceCombinator



        System.out.println(validationResult);

        if(!validationResult.equals(SUCCESS)){
            throw new IllegalStateException(validationResult.toString());
        }



        //todo: how to display all errors ? (not just one )

//        // NOT WORKING

//        List<ValidationServiceCombinator.ValidationResult> allErrors = ValidationServiceCombinatorAllError
//                .checkAdult()
//                .and(ValidationServiceCombinatorAllError.checkAdult())
//                .and(ValidationServiceCombinatorAllError.checkGender())
//                .apply(personNonValid);
//
//        for (ValidationServiceCombinator.ValidationResult result : allErrors) {
//            throw new IllegalStateException("Validation Error: " + result);
//    }
}
}
