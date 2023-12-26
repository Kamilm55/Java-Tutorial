package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String validUsername1 = "kslT";
        String validUsernameforAnd = "gslT";
        String nonValidUsername = "kdskal";

        System.out.println(check(validUsername1));
        System.out.println(check(nonValidUsername));
        ///
        System.out.println("////");
        System.out.println(checkWithPredicate.test(validUsername1));
        System.out.println(checkWithPredicate.test(nonValidUsername));

        System.out.println("/////");
        // and
        System.out.println(
                checkWithPredicate.and(checkWithPredicateCondition2).test(validUsername1)
        );
        System.out.println(
                checkWithPredicate.and(checkWithPredicateCondition2).test(validUsernameforAnd)
        );
        //or
        System.out.println(
                checkWithPredicate.or(checkWithPredicateCondition2).test(validUsername1)
        );
        System.out.println(
                checkWithPredicateCondition2.or(checkWithPredicate).test(validUsernameforAnd)
        );
    }

   static Predicate<String> checkWithPredicate = userName -> userName.endsWith("T") && userName.length() == 4;
    static Predicate<String> checkWithPredicateCondition2 = userName -> userName.startsWith("g");
    public static boolean check(String userName){
        return userName.endsWith("T") && userName.length() == 4;
    }
}
