package W4.FileParsers.src;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import javax.sound.midi.MidiChannel;

public class FileAsListParsing {
    public static void main(String[] args) {
        printContentsOfFileAsList("C:\\Users\\carlo\\Desktop\\Movies.txt");
    }

    private static void printContentsOfFileAsList(String fileName) {
       List<String> lines = Collections.emptyList();
       try {
           lines = Files.readAllLines(Paths.get(fileName));

           for(var line : lines) { 
               System.out.println(line);
           }

       } catch (Exception e) {
           System.out.println("An error has occured. Below is the error.");
           System.out.println(e.getMessage());
       }
    }
    private static void printCharContentsOfFileAsList(String fileName) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName));
 
            for(var line : lines) { 
                for(char character : line.toCharArray()) {
                    System.out.println(character);
                }
            }
 
        } catch (Exception e) {
            System.out.println("An error has occured. Below is the error.");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
     }
    
}
