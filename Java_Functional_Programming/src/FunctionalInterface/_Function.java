package FunctionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));

        System.out.println(increment2.apply(0));

        // Chaining functions
       int res = increment2.andThen(multiplyBy10)
                .apply(0);

        System.out.println(res);
    }

    static Function<Integer,Integer> increment2 = num -> num + 1;
    static Function<Integer,Integer> multiplyBy10 = num -> num * 10;
    public static int increment(int num){return num + 1;}
}
