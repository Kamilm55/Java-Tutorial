package file;
import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        File directory = new File("example_directory");
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create the directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }
}
