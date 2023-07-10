public class nums {

    public static void main(String a[])
    {
        //binary format - 0b....
        int num1 = 0b110;//num1=6 /// binary converting into int type 
        int num2 = 0x3C; //num2 =60 //hex to int
        System.out.println(num1);
        System.out.println(num2);

        char c = 'a' ;
        c++;
        System.out.println(c) ;
        c = (char) (c + 6);       // in Java, there is no implicit conversion from char to int for arithmetic operations. 
                                   // Instead, you need to manually cast the char to an int and then perform the addition 
        System.out.println(c) ;
        c = (char)(c - 7);
        System.out.println(c) ;
    }
}
