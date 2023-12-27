package Lambda;

import java.util.Locale;
import java.util.function.Function;

public class LambdaAndReference {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyBy10 = num -> num* 10;
        System.out.println(multiplyBy10.apply(40));

        Function<String,String> toUpper = s -> s.toUpperCase();// accepts s and return s.toUpperCase
        Function<String,String> toUpper2 = String::toUpperCase;
        // Learn:
        //  public String toUpperCase() {  ---------------  String::toUpperCase
        //      return toUpperCase(Locale.getDefault());
        //  }
    }
}
