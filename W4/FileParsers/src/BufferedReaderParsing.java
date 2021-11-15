package W4.FileParsers.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderParsing {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\carlo\\Desktop\\Movies.txt");

        printCharContentsOfFile(file);
    }

    public static void printContentsOfFile(File file) throws Exception { 
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineContents;

        while((lineContents = bufferedReader.readLine()) != null) {
            System.out.println(lineContents);
        }
        bufferedReader.close();
    }

    public static void printCharContentsOfFile(File file) throws Exception { 
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineContents;

        //using .toCharArray() we learned about
        while((lineContents = bufferedReader.readLine()) != null) {
            for (char character : lineContents.toCharArray()) {
                System.out.println(character);
            }
        }
        bufferedReader.close();
    }
}
