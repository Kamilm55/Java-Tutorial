//The quick brown fox jumps over the lazy dog. The quick brown fox jumps again.
//Word Frequency (It is not case-sensitive)
//        ------------------
//        the   3
//        quick 2
//        brown 2
//        fox   2
//        jumps 2
//        over  1
//        lazy  1
//        dog   1
//        again 1

// It is not clean code , then I refactor in new repo
// Print with order and refactor it (create new repo and build new app writing clean code)
//FIFO first in first out
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        File file = new File("text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //if it exists , continue
//        try{
//        FileWriter fWriter = new FileWriter(file);
//        BufferedWriter bWriter = new BufferedWriter(fWriter);
//        bWriter.write("The quick brown fox jumps over the lazy dog. The quick brown fox jumps again.");
//        bWriter.close();
//        }
//        catch (IOException e){
//            System.out.println("There is no such file");
//        }
//         WE can write this as following , this automatically close the file
//        try(FileWriter fWriter = new FileWriter(file);
//         BufferedWriter bWriter = new BufferedWriter(fWriter)){
//            bWriter.write("The quick brown fox jumps over the lazy dog. The quick brown fox jumps again.");
////            bWriter.write("\nThe quick brown fox jumps over the lazy dog. The quick brown fox jumps again.");
//        }
//        catch (IOException e){
//            System.out.println("There is no such file");
//        }

        List<String> words = new ArrayList<String>();
        Set<String> processedWords = new LinkedHashSet<>();// for unique print of words // FIFO
        try {
        FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
                String line =  bReader.readLine();


            while (line != null){
                String[] unusedSigns = {".",",","/","'", ";",":","/","-","+","*"};
                String  cleanedLine = line;
                for (String sign : unusedSigns) {
                    cleanedLine = cleanedLine.replaceAll("\\Q" + sign + "\\E", ""); // \\Q and \\E to escape special characters
                }
//                cleanedLine = cleanedLine.trim();// remove all "" // it does not work

                String[] wordsArr = cleanedLine.split(" ");
                for(String word : wordsArr)
                    words.add(word);
                words.remove("");// remove all ""
                line = bReader.readLine();
            }


            // nested loop for checking equality
            for (int i=0;i<words.size();i++){
                int count = 0;


                for(int j=0;j<words.size();j++){ // == check address value .equals check actual value of string

                    if(words.get(i).toUpperCase().equals(words.get(j).toUpperCase())){// ignoring case-sensitivity
                        count++;
                    }
                }
//                System.out.println(words.get(i) + ": " + count);

                processedWords.add(words.get(i).toLowerCase() + ": " + count);
            }

        bReader.close();
        }

         catch (IOException e){
                System.out.println("There is no such file");
            }

            //Create new file and write answer to that
        File outFile = new File("Output.txt");
        if (!outFile.exists()) {
            try {
                outFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(FileWriter fWriter = new FileWriter(outFile);
            BufferedWriter bWriter = new BufferedWriter(fWriter)){
            bWriter.write("Word Frequency (It is not case-sensitive)\n" +
                    " ------------------");
            for(String word : processedWords){
                bWriter.newLine();
                bWriter.write(word);
            }
        }
        catch (IOException e){
            System.out.println("There is no such file");
        }


        //        try(FileReader fReader = new FileReader(file);
//            BufferedReader bReader = new BufferedReader(fReader)){
//           String line =  bReader.readLine();
//
//            while (line != null){
//                for(int i=0;i<line.length();i++){
//                    System.out.print(line.charAt(i));//Not println
//                    char ch = line.charAt(i);
//                    if(ch == ' ')
//                        System.out.println();
//                }
////                System.out.println(line);
//                line = bReader.readLine();
//            }

//            String   lineAgain =  bReader.readLine();
//            while (eAgain != null){
////                System.out.println("it works");
//            The reason is that try-with-resources automatically closes the resources when it exits the try block, and once it is closed, you cannot read from the file anymore using that instance of BufferedReader.
//            }
        //        catch (IOException e){
//            System.out.println("There is no such file");
//        }
//        }
    }
}