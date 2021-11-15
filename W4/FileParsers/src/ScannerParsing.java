package W4.FileParsers.src;

import java.io.File;
import java.util.Scanner;

public class ScannerParsing {
    
    public static void main(String[] args) throws Exception{
        printContentsOfFile("C:\\Users\\carlo\\Desktop\\Movies.txt");
    }

    private static void printContentsOfFile(String filePath) throws Exception { 
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    private static void printCharContentsOfFile(String filePath) throws Exception { 
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            for(var character : scanner.nextLine().toCharArray()) {
                System.out.println(character);
            }
        }
    }
}
