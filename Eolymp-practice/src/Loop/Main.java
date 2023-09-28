package Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    }
}
/* Scanner scanner = new Scanner(System.in);
        int sum = 0 ;

        while (true) {
            if (scanner.hasNextInt()) {
                int a =scanner.nextInt();
                sum += a;
            } else break;
        }

        System.out.println(sum);
        scanner.close();*/
/*
*  //513
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


//        8 * 6 % 5  =  3
//        (a % m) * (b % m) % m = result

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = ((factorial % m) * (i % m)) % m ;
        }

        System.out.println(factorial);
*/
/*
* ///497 / uncompleted
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int n = scanner.nextInt();
//                for (int j = 0; j < n; j++) {
//                    int a = scanner.nextInt();
//                    int b = scanner.nextInt();
//
//                        for (int k = a; k <= b; k++) {
//                            System.out.println(k);
//                        }
//                }
////                    1 4
////                    2 5
////                    3 6
////            System.out.println("YES");
//        }
//
//
//        scanner.close();*/
/*
*  //446
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int m = 1; m <= n; m++) {
            int remainder = n % m;
            int quotient = n / m ;
            if(quotient == remainder)count++;
        }

        System.out.println(count);
        scanner.close();
* */
/*
//    421
* Scanner scanner = new Scanner(System.in);
        double I = scanner.nextInt();
        int k = scanner.nextInt();
        int changes = 0;


        I = I / k;
        while (I>1){
            changes++;
            I/=k;
        }
        System.out.println(changes);*/
/*
*  //419
        Scanner scanner = new Scanner(System.in);

        while (true){
            if(scanner.hasNextInt()){
                 int a = scanner.nextInt();
                 int b = scanner.nextInt();

                int maxChanges = 1;

                for (int i = a; i <= b; i++) {

                    int n = i;
                    int changes = 1;
                    while (n > 1){
                        if(n%2==1) n = 3 * n + 1;
                        else n = n / 2;
                        changes++;
                    }
                    if(changes > maxChanges) maxChanges = changes;

                }
                    System.out.println(a + " " + b + " " + maxChanges);


            }else break;// Exit the loop if there is no more input
        }

        scanner.close();
*/
/*
* //388
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int change = 0;

        while (n > 1){
            if(n%2==0) n/=2;
            else n+=1;
            change++;
        }
        System.out.println(change);
*/
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