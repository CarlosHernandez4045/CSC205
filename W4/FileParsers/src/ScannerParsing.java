package W4.FileParsers.src;

import java.io.File;
import java.util.Scanner;

public class ScannerParsing {
    
    public static void main(String[] args) throws Exception{
        printContentsOfFile("C:\\Users\\carlo\\Desktop\\Movies.txt", "Years");
    }

    private static void printContentsOfFile(String filePath, String whatToPrint) throws Exception {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        switch (whatToPrint) {
        case "Films":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[0]);
            }
            scanner.close();

            break;
        case "Genres":
            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[1]);
            }
            scanner.close();

            break;
        case "Lead Studios":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[2]);
            }
            scanner.close();
            
            break;
        case "Audience Scores":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[3]);
            }
            scanner.close();

            break;
        case "Profitability":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[4]);
            }
            break;

        case "Rotten Tomatoes %":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[5]);
            }
            scanner.close();

            break;
        case "Worldwide Grosses":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[6]);
            }

            break;
        case "Years":

            while (scanner.hasNextLine()) {
                var splitLine = scanner.nextLine().split(",");
                System.out.println(splitLine[7]);
            }

            break;
        default:

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            break;
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
