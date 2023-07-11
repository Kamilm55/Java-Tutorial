public class app {
public static void main(String args[])
{
    int num = 5;

    int result1 = num++; //post-increment =>it assign then increment
    
    // already num = 6
    int result2 = ++num; //pre-increment  => it increments then assign
    

    System.out.println(result1);//5
    System.out.println(result2);//7
    System.out.println(num);//7
}    
}
