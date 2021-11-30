package W4.FileParsers.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAsStringParsing {
    public static void main(String[] args) throws IOException {
        printFileContentsAsString("C:\\Users\\carlo\\Desktop\\Movies.txt", "Lead Studios");
    }

    private static void printFileContentsAsString(String filePath, String whatToPrint) throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get(filePath)));
        String[] fileContentsArray = fileContents.replace("\n", "#").split("#");
        switch (whatToPrint) {
        case "Films":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[0]);
            }
            break;
        case "Genres":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[1]);
            }
            break;
        case "Lead Studios":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[2]);
            }
            break;
        case "Audience Scores":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[3]);
            }
            break;
        case "Profitability":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[4]);
            }
            break;
        case "Rotten Tomatoes %":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[5]);
            }
            break;
        case "Worldwide Grosses":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[6]);
            }
            break;
        case "Years":
            for (String stringLine : fileContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[7]);
            }
            break;
        default:
            for (var stringLine : fileContentsArray) {
                System.out.println(stringLine);
            }
            break;
        }
    }

    private static void printFileCharContentsAsString(String filePath) throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get(filePath)));
        for (var character : fileContents.toCharArray()) {
            System.out.println(character);
        }
    }
}
