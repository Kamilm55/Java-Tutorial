import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define path:");
        String path = scanner.nextLine();
        File file = new File(path);

        if(file.exists()){
            String[] subDirs = file.list();

            for(int i=0;i<subDirs.length;i++)
                System.out.println(subDirs[i]);
        }else System.out.println("not found");
    }
}