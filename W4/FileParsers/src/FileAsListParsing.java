package W4.FileParsers.src;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import javax.sound.midi.MidiChannel;

public class FileAsListParsing {
    public static void main(String[] args) {
        printContentsOfFileAsList("C:\\Users\\carlo\\Desktop\\Movies.txt", "Genres");
    }
    
    private static void printContentsOfFileAsList(String fileName, String whatToPrint) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName));

            switch (whatToPrint) {
            case "Films":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[0]);
                }
                break;
            case "Genres":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[1]);
                }
                break;
            case "Lead Studios":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[2]);
                }
                break;
            case "Audience Scores":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[3]);
                }
                break;
            case "Profitability":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[4]);
                }
                break;
            case "Rotten Tomatoes %":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[5]);
                }
                break;
            case "Worldwide Grosses":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[6]);
                }
                break;
            case "Years":
                for (var line : lines) {
                    var splitLine = line.split(",");
                    System.out.println(splitLine[7]);
                }
                break;
            default:
                for (var line : lines) {
                    System.out.println(line);
                }
                break;
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

            for (var line : lines) {
                for (char character : line.toCharArray()) {
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

// switch (whatToPrint) {
//     case "Films": 
        
//         break;
//     case "Genres":

//         break;
//     case "Lead Studios":

//         break;
//     case "Audience Scores":

//         break;
//     case "Profitability":

//         break;
//     case "Rotten Tomatoes %":

//         break;
//     case "Worldwide Grosses":
        
//         break;
//     case "Year":

//         break;
//     default:
//         break;
//     }