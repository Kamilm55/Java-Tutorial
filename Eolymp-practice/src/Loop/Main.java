package Loop;

import java.util.Scanner;

public class Main {
    // determines the largest of three Comparable objects

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(y.compareTo(max) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(max) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        String[] expr = expression.split("");
        int count=0;

        for (int i = 1; i < expr.length; i++) {
            if(expr[i].equals("+") || expr[i].equals("*") || expr[i].equals("-") )
                count++;
        }

        System.out.println(count);
//        System.out.printf("Max of %d, %d and %d is %d\n\n",
//                3, 4, 5, maximum( 3, 4, 5 ));
//
//        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
//                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));
//
//        System.out.printf("Max of %s, %s and %s is %s\n","pear",
//                "apple", "orange", maximum("pear", "apple", "orange"));
//
//        System.out.printf("Max of %s, %s and %s is %s\n","s","t","y",maximum("s","t","y"));
    }
}
 class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}