import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
//Bytes ve Characters Akışları
public class ReadNonCharacterTypeFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\OneDrive\\Desktop\\CV-images\\3x4.jpg");
        if (file.exists()){
            FileInputStream fileInputStream = null;
            try{
                fileInputStream = new FileInputStream(file);

                int c = 0;
                byte[] buffer = new byte[1024];
                while ((c = fileInputStream.read(buffer)) != -1){
                    System.out.println(Arrays.toString(buffer));
                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }else System.out.println("Not Exist");
    }
}
