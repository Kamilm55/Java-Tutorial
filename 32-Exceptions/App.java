
public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result;
        
        String[] arr = {"1","2"};
        // With multiple catch block

        // try {
        //     result = a / b;
        //     System.out.println(result);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // catch(ArithmeticException ae){
        //     System.out.println(ae);
        // }
//Unreachable catch block for ArithmeticException.
// It is already handled by the catch block for Exception

            /* we cannot catch all the exceptions inside a try block  */ 
        // try {
        //     result = a / b;
        //     System.out.println(result);// first it occurs error and rest of 
        //                                 //the try block does not work

        //     System.out.println(arr[2]); // out of bound exception
        //     /// But i cannot see
        // } 
        //  catch(ArrayIndexOutOfBoundsException aie){
        //             System.out.println("array index error:");
        //             System.out.println(aie);
        //         }
        //  catch(ArithmeticException ae){
        //     System.out.println("Arithmetic exception:");
        //     System.out.println(ae);
        // }
        
        // catch (Exception e) {
        //     System.out.println("Other exception:");
        //     System.out.println(e);
        // }
       

        try {
            // Code that may throw exceptions
            // For example:
             result = 10 / 0; // This will throw an ArithmeticException
            String str = null;
            int length = str.length(); // This will throw a NullPointerException
        } catch (ArithmeticException | NullPointerException ex) {
            // Handle both ArithmeticException and NullPointerException here
            System.out.println("An exception occurred: " + ex.getMessage());
        }

        // try {
        //     result = a / b;
        //     System.out.println(result);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        //     System.out.println(e.getCause());
        //     System.out.println(e.getStackTrace());
        //     System.out.println();
        //     System.out.println(e);
        // }

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at App.main(App.java:6)
    }    
}
