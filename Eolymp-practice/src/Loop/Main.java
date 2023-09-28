package Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flag = 0;

        String s = String.valueOf(n);
        StringBuilder stringBuilder = new StringBuilder(s);
        int length = s.length();
        for (int i = 0; i < length; i++) {
          int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(digit % 2 == 0){
                stringBuilder.deleteCharAt(i);
//                i--;
                length--;
                flag++;
            }
//                System.out.println(stringBuilder);
//                System.out.println("index " + i);
//            System.out.println("length " + length);
        }

        System.out.println(stringBuilder);
//        System.out.println(s);
        if (flag==0) System.out.println(0);
    }
}
/*
* //        8681
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;

        while (n > 0){
            int digit = n%10;
            if (digit != 0)product*=digit;
            n /=10;
        }

        System.out.println(product);*/
/*
*  //8641 , 8642
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int n = a ; n<=b ;n++ ){

            int num2 = n;
            int sumOfTheCube = 0; // 4th degree =>8642
            while (num2 > 0){
                int digit = num2%10;
                int cube =(int) Math.pow(digit,4);// 4th degree
                sumOfTheCube+=cube;

                num2 /=10;
            }
            if(sumOfTheCube == n) System.out.print(n + " ");
        }
*/
/*
 //8640
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int flag=0;
        for(int n = a ; n<=b ;n++ ){

            int num2 = n;
            flag = 0;
            while (num2 > 0){
                int qaliq = num2%10;
                if(qaliq % 2 == 0){
                    flag++;
                    break;
                }
                num2 /=10;
            }
            if(flag == 0) System.out.println(n);
        }*/
/*
* //8639
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int copyNum = n;
        int count = 0;

        while (n > 0){
            count++;
            n /=10;
        }

        copyNum  += (int) (Math.pow(10,count) * 3 ); // beginning

        copyNum = copyNum*10 + 3; // end
        System.out.println(copyNum);*/

/*
//        8632
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int count = 0;

        while (num > 0){
            long qaliq = num%10;
            if(qaliq % 2 == 1)
                count++;
            num /=10;
        }


        System.out.println(count);*/
/*
 //8630
//        Scanner scanner = new Scanner(System.in);
//        long num = scanner.nextLong();
//        long copyNum = num;
//        long maxDigit = 0;
//        int count = 0;
//
//        while (num > 0){
//            long qaliq = num%10;
//            if(qaliq > maxDigit)
//                maxDigit = qaliq;
//            num /=10;
//        }
//
//
//        System.out.println(maxDigit);
* */
/*
*   //8631
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long copyNum = num;
        long maxDigit = 0;
        int count = 0;

        while (num > 0){
            long qaliq = num%10;
            if(qaliq > maxDigit)
                maxDigit = qaliq;
            num /=10;
        }


        while (copyNum > 0){
            long qaliq =  copyNum%10;
            if(qaliq == maxDigit){
                count++;
            }
            copyNum /=10;
        }
        System.out.println(count);
* */

/*
    //Numbers with different digits/8533
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for(int n = a ; n<=b ;n++ ){
            int flag=0;

            int num = n;
            while (num>0){
                int qaliq = num % 10;
                int num2 = n;
                flag = 0;
                    while (num2 > 0){
                        int qaliq2 = num2%10;
                        if(qaliq == qaliq2)
                            flag++;
                        num2 /=10;
                    }

                if(flag>1)break;

                num/=10;

            }

            if(flag < 2)System.out.println(n);

        }
 */