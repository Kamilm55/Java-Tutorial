import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Learn:
        //  1.Imperative Programming vs Declarative Programming
        //  2. Functional programming aim:  In declarative programming, the focus is on describing
        //  what the program should accomplish without specifying how to achieve it.
        //  It abstracts away the control flow and emphasizes the desired outcome.
        // Characteristics:
        // Emphasizes expressing the logic or rules of the problem without detailing the control flow.
        // Often relies on higher-level abstractions and expressions.

        int[] arr = {12,-5,8,14};

        System.out.println(sumArrayImperative(arr));
        System.out.println(sumArrayDeclarative(arr));// implementation is not important , outcome is crucial for me.
    }

    // Imperative approach to find the sum of elements in an array
    public static int sumArrayImperative(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Declarative approach to find the sum of elements in an array using Java Streams
    public static int sumArrayDeclarative(int[] array) {
        return Arrays.stream(array).sum();
    }

}