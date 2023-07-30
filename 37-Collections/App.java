// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // Collection nums = new Collection<E>() {

        // };

        //Collection is interface , that's why if you want to use it you should use anonymous func
            //but we can use as a type

            // ArrayList is a class implemented using a list interface, in that provides the functionality of a dynamic array where the size of the array is not fixed.
             Collection<Integer> nums = new ArrayList<Integer>();
            nums.add(0);
            nums.add(33);
            nums.add(4);
            nums.add(67);

            System.out.println(nums);

            for(int n : nums)
            System.out.println(n); 
            
            // We cannot use index in Collection interface

            // ArrayList<Integer> nums2 = new ArrayList<Integer>();//The difference lies in the level of abstraction and flexibility:
            List<Integer> nums2 = new ArrayList<Integer>();// It is more flexible
            // Using the interface (List<Integer>) for declaration allows you to switch implementations easily if needed. Since List is an interface, you can later change the implementation to another class that implements List, like LinkedList, without changing the rest of your code that uses nums2.
            nums2.add(5);
        nums2.add(45);
        nums2.add(32);
        // The recommended approach is to use the interface type (List<Integer>) for variable declarations whenever possible. This allows you to program against abstractions and promotes better code maintainability and flexibility. By using interfaces, you can switch implementations easily, and your code becomes less dependent on specific implementation details.
            System.out.println(nums2.get(2));

            
            // public interface List<E> extends Collection<E> {  
            //   E get(int index);
            // }
    }
}
