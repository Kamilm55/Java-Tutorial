package CombinatorPattern;

import CombinatorPattern.ValidationServiceCombinator.ValidationResult;
import ImperativeVsDeclarative.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static CombinatorPattern.ValidationServiceCombinator.ValidationResult.SUCCESS;

public interface ValidationServiceCombinatorAllError extends Function<Person, List<ValidationResult>>
{
    static ValidationServiceCombinatorAllError checkUsername() {
        return p -> {
            List<ValidationResult> results = new ArrayList<>();
            if (p.getName().length() <= 2 || p.getName().length() >= 25) {
                results.add(ValidationResult.USERNAME_IS_NOT_VALID);
            }
            return results;
        };
    }

    static ValidationServiceCombinatorAllError checkGender() {
        return p -> {
            List<ValidationResult> results = new ArrayList<>();
            if (!p.getGender().equals("Male") && !p.getGender().equals("Female")) {
                results.add(ValidationResult.GENDER_IS_NOT_VALID);
            }
            return results;
        };
    }

    static ValidationServiceCombinatorAllError checkAdult() {
        return p -> {
            List<ValidationResult> results = new ArrayList<>();
            if (p.getAge() <= 16) {
                results.add(ValidationResult.NOT_ADULT);
            }
            return results;
        };
    }

    default ValidationServiceCombinatorAllError and(ValidationServiceCombinatorAllError other) {
        return person -> {
            List<ValidationResult> results = new ArrayList<>(this.apply(person));
            results.addAll(other.apply(person));
            return results;
        };
    }
}
