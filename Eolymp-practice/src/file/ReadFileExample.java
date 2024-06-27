package file;

import java.io.FileReader;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


