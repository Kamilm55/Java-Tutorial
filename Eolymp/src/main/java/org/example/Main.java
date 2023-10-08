package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String removedExtraSpaces = sentence.replaceAll("\\s+"," "); //more space to one space
        String modifiedSen = removedExtraSpaces.replaceAll("^a-zA-z/\\s",""); // replace with "" means remove

        String[] strArr = modifiedSen.split(" ");



        System.out.println(strArr.length);
    }
}
/*
19
Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[100];
        int degree = 0 ;

        int count = 0;


        while (n > 0){
            nums[count] = n % 10;
            count++;
            n/=10;
        }

        for (int i = 0; i < count / 2; i++) {
           if(nums[i] == nums[ count - 1 - i]){
               degree++;
           }
        }

        if(count % 2 == 1)degree++;


        System.out.println(degree);*/

/* Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] nums = new double[n];
        int count = 0 ;
        double sum = 0 ;


        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if((i + 1)%3==0 && nums[i] > 0){
                count++;
                sum+=nums[i];
            }
        }

        System.out.print(count + " ");
        System.out.printf("%.2f" , sum);*/