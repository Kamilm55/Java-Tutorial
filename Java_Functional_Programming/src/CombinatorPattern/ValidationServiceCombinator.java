package CombinatorPattern;

import ImperativeVsDeclarative.Person;

import java.util.function.Function;

import static CombinatorPattern.ValidationServiceCombinator.ValidationResult.*;

public interface ValidationServiceCombinator extends Function<Person, ValidationServiceCombinator.ValidationResult> {

    enum ValidationResult{
        SUCCESS,
       USERNAME_IS_NOT_VALID,
       GENDER_IS_NOT_VALID,
       NOT_ADULT
    }

     static ValidationServiceCombinator checkUsername(){
        return p ->  p.getName().length() > 2 && p.getName().length() < 25 ? SUCCESS : USERNAME_IS_NOT_VALID;
    }
     static ValidationServiceCombinator checkGender(){
        return p -> p.getGender().equals("Male") || p.getGender().equals("Female") ? SUCCESS : GENDER_IS_NOT_VALID;
    }
     static ValidationServiceCombinator checkAdult(){
        return p -> p.getAge() > 16 ? SUCCESS : NOT_ADULT ;
    }

    // Learn:
    //  With the introduction of the default keyword for methods in interfaces, Java 8 allows
    //  the inclusion of method bodies in interfaces. These methods are called "default methods."
    //  The purpose of default methods is to provide a default implementation that can be used by classes
    //  implementing the interface. If a class chooses not to override a default method,
    //  it will inherit the default implementation from the interface.

    default ValidationServiceCombinator and(ValidationServiceCombinator other){
        return (person) -> {
            ValidationResult result = this.apply(person);
              return   result.equals(SUCCESS) ? other.apply(person) : result;
        };
    }

}
