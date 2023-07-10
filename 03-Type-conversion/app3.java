
public class app3 {
    public static void main(String a[])
    {
        //Type conversion and Casting (explicit conversion)
      byte b = 127;
      int num = b;
      
    //   byte c = num; It is not possible Out of the range

        int num2 = 12;
        // byte d = num2;//It is not working but it is not out of the range
        byte d = (byte)num2;//Casting == Explicit conversion
        float f = 10.5f;
        // int num3 = f;
        int num3 = (int)f; //10.5 convert to 10 (Lose data)
         // IF byte * byte == 127 >  TYPE PROMOTION (automatically)

         int TP = b * d;//TYPE PROMOTION

      System.out.println(num);
      System.out.println(d);
      System.out.println(num3);
      System.out.println(TP);
    }
}
