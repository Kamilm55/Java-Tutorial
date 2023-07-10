class Hello
{
    public static void main(String a[])
    {
        //Primitive Data types
        int num1 = 5; // 4byte
        byte num2 = -127; // 1 byte

        float num3 = 12.4f; // 4byte
        double d = 5.88; // Default float ; 8byte
        
        short sh = 4899;
        long l = 489765l ;
        boolean value = false;

        char letter = 'a'; //2byte => only one character
        

        int result = num1 - num2 ;
        System.out.println(result + num3);
    }
}