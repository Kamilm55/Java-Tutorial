// From oracle java documentations

import java.io.*;
import java.util.List;
import java.util.ArrayList;


class WriteSmth
{
    private List<Integer> list;
    private final int SIZE = 10;

    public void setList()
    {
        // list = new ArrayList<Integer>(SIZE); // For correcting exceptions . if we comment out it works with no problem
          for(int i=0;i<SIZE;i++)
        {   // this differs from an array , it is dynamic sized and automatically resize own 
            list = new ArrayList<Integer>(SIZE);
            list.add(i);
        }
    }

    // public void  showList()
    // {

    //     PrintWriter out = null ; // firstly , we declare type and it can be null
    //     // The FileWriter constructor throws IOException, which must be caught.
    //     try {
    //         FileWriter f = new FileWriter("OutFile.txt"); 
    //         out = new PrintWriter(f);
    //          for (int i = 0; i < SIZE; i++) {
    //         // The get(int) method throws IndexOutOfBoundsException, which must be caught.
    //         out.println("Value at: " + i + " = " + list.get(i));
    //         }
    //     } 
    //     catch(IOException e)
    //     {
    //         System.out.println("io exceptions: " + e.getMessage());
    //     }
    //     catch(IndexOutOfBoundsException e)
    //     {
    //         System.out.println("IndexOutOfBoundsException: " + e.getMessage());
    //     }
    //     catch (Exception e) {
    //         System.out.println(e);
    //         System.out.println(e.getClass().getName());
    //     }
    //     finally 
    //     {// stream variables are operating system must be open and closed;we have a lot of case that file should be close;close in the finally
    //         if(out == null)
    //         System.out.println("File not opened");
    //         else{
    //             System.out.println("Closing file...");
    //             out.close();
    //         }
    //         }
    //      System.out.println("After try block");
       
    // 2.case for showList:
            // try with resources

            // The try-with-resources statement provides a more concise way of working with resources and ensures that they are automatically closed at the end of the try block, regardless of whether an exception occurs or not. It eliminates the need for explicit finally blocks for resource cleanup.

            // public void showList()
            // {
            //  try(
            //     FileWriter f = new FileWriter("newFile.txt");
            //     PrintWriter out1 = new PrintWriter(f)
            //     ) {
            //          for (int i = 0; i < SIZE; i++) {
            // // The get(int) method throws IndexOutOfBoundsException, which must be caught.
            // out1.println("Value at: " + i + " = " + list.get(i));
            // }
            //     }
            //       catch(Exception e){
            //         System.out.println(e);
            //       }

            //       System.out.println("After try block");// automatically close , we don't need additonally finally block or other things
            // }
        
            // 3.case
            // it is same with 2.case only syntax differs
                public void showList() throws IOException {
        try (FileWriter f = new FileWriter("newFile.txt");
             PrintWriter out1 = new PrintWriter(f)) {
            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out1.println("Value at: " + i + " = " + list.get(i));
            }
        }
        
        // No need for catch block as the exception is thrown to the caller.
        // catch (Exception e) {
        //     System.out.println(e);
        // }

        System.out.println("After try block");
        }


    // What does it have in the list?

    public List<Integer> showListElements() {return list ;}
    
    public int listSize () {return list.size(); } 
}

public class App {
    public static void main(String[] args) {
        WriteSmth w = new WriteSmth();

        
        w.setList();
        // w.showList(); // it does not work because in the 3rd case we note that it might be throw IOError you should catch it

        try {
            w.showList();
        } catch (Exception e) {
            System.out.println(e);
        }
        // System.out.println(w.showListElements());
        // System.out.println(w.listSize());

        // When i compile it occurs fileNotFound exception
        // i write try cacth , then show exception , but show other exception
        // this one:
        //java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
    
 //////////////////////////////////////////////////////////////////////////////////////       
       //Arrays vs ArrayList
// Arrays and ArrayLists are both used to store collections of elements in Java, but they have some fundamental differences:

// Static vs. Dynamic size:

// Arrays have a fixed size, which means once you create an array, you cannot change its size. If you need to add or remove elements from an array, you'll need to create a new array with the desired size and copy the elements manually.
// ArrayLists, on the other hand, have a dynamic size. They automatically resize themselves when elements are added or removed, so you don't need to worry about resizing the data structure manually.
// Data Type:

// Arrays can store both primitive data types (e.g., int, char, double, etc.) and objects.
// ArrayLists can only store objects. If you want to store primitives, you need to use their corresponding wrapper classes (e.g., Integer, Character, Double, etc.).
// API and Flexibility:

// Arrays have a fixed set of methods and don't provide additional utility methods for manipulation.
// ArrayLists are part of the Java Collections Framework and provide many useful methods like add, remove, get, size, etc., making it easier to work with collections.
// Performance:

// Access time for elements in an array is constant (O(1)) because elements are stored in contiguous memory locations, and you can access them directly with an index.
// ArrayLists use an array internally to store elements, but when resizing is needed, a new larger array is created, and elements are copied over. This process can take additional time and memory.
    }    
}
