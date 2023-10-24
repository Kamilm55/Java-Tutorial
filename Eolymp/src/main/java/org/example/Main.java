package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 == 1) System.out.println("Weird");
        else if (N >= 2 && N <= 5) System.out.println("Not Weird");
        else if (N >= 6 && N <= 20) System.out.println("Weird");
        else System.out.println("Not Weird");

        bufferedReader.close();
    }
}

/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();

    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

        double tip = (meal_cost / 100) * tip_percent ;
        double tax =  ((double) tax_percent / 100) * meal_cost;

        double total_cost = meal_cost + tip + tax ;

        System.out.println(Math.round(total_cost));
    }*/
/*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n1 = new BigInteger(bufferedReader.readLine());
        BigInteger n2 = new BigInteger(bufferedReader.readLine());

        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));

        bufferedReader.close();*/

/*
Hackerrank
if (num.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }*/
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Change N to the desired number of studied letters
        generateGraffiti(N);
    }

    public static void generateGraffiti(int N) {

        for (int i = 1; i <= N; i++) {
        char letter = 'a'; // Start from letter 'a'
            System.out.print("a");
            for (int j = 0; j < N - i; j++) {
                System.out.print( " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
                letter++; // Increment the letter based on the step
            }
            if (i < N) {
                System.out.print(" "); // Add space between lines
            }
        System.out.println(); // Print a newline after the graffiti is generated
        }

    }
}*/

/* Scanner scanner = new Scanner(System.in);

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        int flag = 0;
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < text1.length(); i++) {
          arrayList.add(String.valueOf(text1.charAt(i)));
        }

        List<String> arrayList2 = new ArrayList<>();
        for (int i = 0; i < text2.length(); i++) {
            arrayList2.add(String.valueOf(text2.charAt(i)));
        }

        // Sort the lists
        Collections.sort(arrayList);
        Collections.sort(arrayList2);

        if(arrayList2.size() != arrayList.size() )
            System.out.println("NO");
        else {
            for (int i = 0; i < arrayList2.size(); i++) {
                if(!arrayList2.get(i).equals(arrayList.get(i)) ){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }*/
/*  Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int number = scanner.nextInt();

        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (Character.isLetter(letter)) {
                letters.add(letter);
            }
        }

        // Print the list of letters
        for (int i=0;i<letters.size();i++ ){
            char letter = letters.get(i);
            int letterCode = letter;

            letterCode-=number;

            if(letterCode < 65){
                letterCode = 90 - (64 - letterCode) ;
            }
            char changedLetter = (char) letterCode;
            letters.remove(i);
            letters.add(i,changedLetter);
        }

        for (char l : letters) {
            System.out.print(l);
        }*/
/* Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String cleanedInput = input.replaceAll(" ", "").toLowerCase();
        String reversedString = String.valueOf(new StringBuilder(cleanedInput).reverse());

        if(reversedString.equals(cleanedInput))
            System.out.println("YES");
        else
            System.out.println("NO");*/

/* Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int[] numbers = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char digitChar = input.charAt(i);
            if (Character.isDigit(digitChar)) {
                numbers[i] = Character.getNumericValue(digitChar);
            } else {
                System.out.println("Invalid input. Please enter only digits.");
                return;
            }
        }

      int sum = 0;
        for (int number : numbers) {
            sum+= number;
        }

        if(sum%3==0)
            System.out.println("YES");
        else
            System.out.println("NO");*/
/*  Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputValues = new ArrayList<>();

        int input;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            inputValues.add(input);
        }



        for (int h : inputValues) {

            for (int i = 1; i <= h ; i++) {
                int numChars = 2 * i - 1;

                for (int j = 0; j < h - i ; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < numChars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = h-1; i >0 ; i--) {
                int numChars = 2 * i - 1;

                for (int j = 0; j < h - i ; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < numChars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();*/

/*  Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] inputParts = input.split(" ");
        char symbol = inputParts[0].charAt(0);
        int h = Integer.parseInt(inputParts[1]);

        int totalChars = 0;

        for (int i = 1; i <= h; i++) {
            int numChars = 2 * i - 1;
            totalChars += numChars;
            int spaces = h-i;
            totalChars += spaces;
        }
        System.out.println(totalChars);

        for (int i = 1; i <= h; i++) {
            int numChars = 2 * i - 1;

            for (int j = 0; j < h - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numChars; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        */
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