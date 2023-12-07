import java.util.HashMap;
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
}


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
