package file;

import java.io.FileWriter;

public class WriteToFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Worlddd!");
            writer.close();
            System.out.println("Data written to the file successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
