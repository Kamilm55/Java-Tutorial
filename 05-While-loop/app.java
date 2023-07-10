
public class app {
    public static void main(String args[])
    {
        int n = 0;

        //Nested loop with while
        while(n < 5)
        {
            System.out.println(n);

            int j = 0;
            while(j < 3)
            {
                System.out.println(n + " => " + j);
                j++;
            }
            n++;
            // ++n; 
        }
    }    
}
