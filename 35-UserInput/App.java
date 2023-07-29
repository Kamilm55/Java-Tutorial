import java.util.Scanner;

class App
{
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter data: ");
            String str = sc.nextLine();
            System.out.println(str);
        }

        // int num = sc.nextInt();

        // System.out.println(num);

    }
}