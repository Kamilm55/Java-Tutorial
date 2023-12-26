import java.io.*;
import java.util.*;
import java.lang.reflect.*;



class FamilyMember {

    @FamilyBudget(userRole = "SENIOR", budgetLimit = 100)
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(userRole = "JUNIOR", budgetLimit = 50)
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String role = in.next();
            int spend = in.nextInt();
            try {
                Class annotatedClass = FamilyMember.class;
                Method[] methods = annotatedClass.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method
                                .getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();
                        if (userRole.equals(role)) {
                            if(spend<=budgetLimit){
                                method.invoke(FamilyMember.class.newInstance(),
                                        budgetLimit, spend);
                            }else{
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            testCases--;
        }
    }
}

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);

            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/


/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    */
/*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     *//*


    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
*/


/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    */
/*
     * Complete the 'equalizeArray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     *//*


    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int mostRepeatedCount = 0 ;

        for (int i = 0; i < arr.size(); i++) {
            int count = 0;

            for (int j = 0; j <= i; j++) {
               if(Objects.equals(arr.get(i), arr.get(j)))count++;
            }

            System.out.println(count);

            if(count>mostRepeatedCount)mostRepeatedCount = count;

        }

        System.out.println();
        System.out.println(mostRepeatedCount);
        return  arr.size() - mostRepeatedCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/


/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    *//*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     *//*

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }

        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/


/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
class Arithmetic{
    public static int add(int a , int b){return a+b;}
}

class Adder extends Arithmetic{

}
public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}*/

/*
import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book{
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}
public class Solution{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}
*/

/*import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0)sum+=i;
        }

        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    *//*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     *//*
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}*/



/*import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Compare based on CGPA in decreasing order
        if (s1.getCgpa() != s2.getCgpa()) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        // If CGPA is the same, compare based on first name in alphabetical order
        else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        }
        // If both CGPA and first name are the same, compare based on ID in increasing order
        else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

// Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Sort the studentList using the custom comparator
        studentList.sort(new StudentComparator());


        // Print the first names of students after sorting
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}*/




/*import java.util.*;

public class Solution {

    public static void main(String[] args) {
        *//* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. *//*
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};



        printArray(intList);
        printArray(stringList);
    }

    public static  <T> void printArray(List<T> arr){
        for (T item: arr) {
            System.out.println(item);
        }
    }
}*/


/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];



        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }

    }
}*/

/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int n = scanner.nextInt();

        // Consume the newline character left in the buffer
        scanner.nextLine();
        // Create a map to store phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();

        // Read phone book entries
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phoneNumber = scanner.nextInt();
            phoneBook.put(name, phoneNumber);

            // Consume the newline character left in the buffer
            scanner.nextLine();
        }


        // Read queries until end-of-file
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}*/


/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial number of elements in the list
        int n = scanner.nextInt();

        // Read the initial list of integers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {
            String operation = scanner.next();

            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                insertElement(list, index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                deleteElement(list, index);
            }
        }

        // Print the updated list
        for (Integer num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    private static void insertElement(List<Integer> list, int index, int value) {
        list.add(index, value);
    }

    private static void deleteElement(List<Integer> list, int index) {
        list.remove(index);
    }
}*/

/*
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int numLines = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        // Create ArrayList of ArrayLists to store the lines
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read and store the lines
        for (int i = 0; i < numLines; i++) {
            int numIntegers = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();

            for (int j = 0; j < numIntegers; j++) {
                line.add(scanner.nextInt());
            }

            lines.add(line);
        }

        // Read the number of queries
        int numQueries = scanner.nextInt();

        // Process queries
        for (int k = 0; k < numQueries; k++) {
            int lineIndex = scanner.nextInt();
            int positionIndex = scanner.nextInt();

            // Check if the lineIndex is valid
            if (lineIndex <= lines.size()) {
                ArrayList<Integer> line = lines.get(lineIndex - 1);

                // Check if the positionIndex is valid
                if (positionIndex <= line.size()) {
                    System.out.println(line.get(positionIndex - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
*/


/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<int[]> divideIntoSubarrays(int[] array) {
        List<int[]> subarrays = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                // Create subarray from index i to j-1
                int[] subarray = new int[j - i];
                System.arraycopy(array, i, subarray, 0, j - i);

                // Add subarray to the list
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] originalArray = new int[n];

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }

        List<int[]> subarrays = divideIntoSubarrays(originalArray);

        int count = 0 ;
        for (int[] subarray : subarrays) {
            int arrSum = 0;
            for (int i = 0; i < subarray.length; i++) {
               arrSum+=subarray[i];
            }
            if(arrSum<0)count++;
        }
        System.out.println(count);
    }
}
*/
