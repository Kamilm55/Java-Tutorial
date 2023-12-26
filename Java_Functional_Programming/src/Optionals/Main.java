package Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object obj = Optional.ofNullable(null).orElse("dsfdhgfgdad");

//        System.out.println(obj);


        System.out.println(
                Optional.ofNullable("kamil@gmail.com").orElseThrow(() -> new IllegalStateException("email cannot be null"))
        );

        System.out.println(
                Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("email cannot be null"))
        );
        System.out.println("////////////");

         Optional.ofNullable("kamil@gmail.com").ifPresent(email -> System.out.println(email + " is valid"));
        Optional.ofNullable(null).ifPresent(email -> System.out.println(email + " is valid"));

        System.out.println("///////////");
        Optional.ofNullable("kamil@gmail.com").ifPresentOrElse(
                email -> System.out.println(email + " is valid"),
                () -> System.out.println("Email cannot be null")
        );
        Optional.ofNullable(null).ifPresentOrElse(
                email -> System.out.println(email + " is valid"),
                () -> System.out.println("Email cannot be null")
        );
    }
}
