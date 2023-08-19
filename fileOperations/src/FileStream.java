import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int c = 1;
            while ((c=fileInputStream.read()) != -1){
                System.out.print((char)c);
            }
//            while (c != -1){
//                c = fileInputStream.read();
//                if(c!=-1)
//                System.out.print((char)c);
//            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (file != null)
                fileInputStream.close();
        }
//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write("Hello it is written by byte output stream \n 2nd row".getBytes());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            if (file != null)
//                fileOutputStream.close();
//        }
    }
}
