import java.io.*;

public class Main {
    public static void main(String[] args) {
//          public FileReader(String fileName) throws FileNotFoundException {
//            super(new FileInputStream(fileName));
//        }
        String fileName = "newFile.txt";
        File file = new File(fileName);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileWriter fWriter = new FileWriter(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter); // byte to plain text
            String text = "Random text";
            bWriter.write(text);
            bWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

            FileReader newFile = new FileReader(fileName);
            BufferedReader bReader = new BufferedReader(newFile);

            String line ;
            while ((line = bReader.readLine()) != null)
            System.out.println(line);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }


    }
}