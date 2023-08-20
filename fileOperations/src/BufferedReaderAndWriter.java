import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        write();
    }

    public static void read(){}
    public static void write(){
        File file = new File("bufferText.txt");
        if (!file.exists()) {
            try {
               boolean isCreated = file.createNewFile();
                System.out.println(isCreated ? file : "Not created");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try { // learn differences all write methods outputStreamWriter.write,fileOutputStream.write,bufferedWriter.write or read
            fileOutputStream = new FileOutputStream (file);
//            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            outputStreamWriter.write("Merhaba çş Dünya");
//            outputStreamWriter.close();
            fileOutputStream.write("Merhaba çş Dünya adasd".getBytes());
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
