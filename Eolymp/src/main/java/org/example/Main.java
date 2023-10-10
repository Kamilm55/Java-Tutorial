package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        int count = 0;

//        ! or . or ? => cumle bitdi
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(sentence);

        sentence = sentence.replaceAll("\\s+",""); // remove all spaces one or more

        if(matcher.find()){
            int i =0;
            boolean isLastSign = false;
            while (i<sentence.length()){
                char c = sentence.charAt(i);
                if((c == '!' || c == '.' || c == '?') && !isLastSign ){
                    isLastSign = true;
                    count++;
                }
                else if(c != '!' && c != '.' && c != '?') {
                    isLastSign = false;
                }
                i++;
            }
            System.out.println(count);
        }
        else {
            System.out.println(0);
        }
    }
}
/*
909
Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String removedExtraSpaces = sentence.replaceAll("\\s+"," "); //more space to one space
        String modifiedSen = removedExtraSpaces.replaceAll("^a-zA-z/\\s",""); // replace with "" means remove

        String[] strArr = modifiedSen.split(" ");



        System.out.println(strArr.length);*/
/*
901
Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        int count ;int plusCount=0;int minusCount=0;int subCount=0;int mulCount=0;
        String[] textArr = text.split("");


        for (int i = 0; i < textArr.length; i++) {
            if(textArr[i].equals("+")  && plusCount != 1)
                plusCount++;
            else if( textArr[i].equals("-")&& minusCount != 1)
                minusCount++;
            else if( textArr[i].equals("/")&& subCount != 1 )
                subCount++;
            else if( textArr[i].equals("*") && mulCount != 1)
                mulCount++;
        }

        count = plusCount + minusCount + subCount +mulCount;
        System.out.println(count);*/
/*
494
Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
            int count =0 ;
        String[] textArr = text.split("");

        for (int i = 0; i < textArr.length; i++) {
            if(textArr[i].equals("A") || textArr[i].equals("E") || textArr[i].equals("I") || textArr[i].equals("O") || textArr[i].equals("U") || textArr[i].equals("Y") )
                count++;
        }
        System.out.println(count);*/

      /*
        A
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String removedExtraSpaces = sentence.replaceAll("\\s+"," "); //more space to one space
        String modifiedSen = removedExtraSpaces.replaceAll("^a-zA-z/\\s",""); // replace with "" means remove

        String[] strArr = modifiedSen.split(" ");



        System.out.println(strArr.length);*/
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