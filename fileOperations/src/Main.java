import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define path:");
        String path = scanner.nextLine();
        File file = new File(path);

        if(!file.exists())file.createNewFile();

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            System.out.println("Write text:");
            String line = null;
            do {
                line = scanner.nextLine();// firstly do this then check the condition
                if(!line.equals("quitFromSc")) {
                    fileWriter.write(line);
                    fileWriter.write(System.lineSeparator());
                }
            }while (!line.equals("quitFromSc"));

//            while (!line.equals("quitFromSc")){//: Cannot invoke "String.equals(Object)" because "line" is null
//                line = scanner.nextLine();
//                    fileWriter.write(line);
//                    fileWriter.write(System.lineSeparator());
//            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            if(fileWriter != null) fileWriter.close();
        }
            System.out.println("File is written and length of the file is " + file.length() + " byte");


        scanner.close();
    }
}