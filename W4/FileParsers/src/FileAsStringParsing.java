package W4.FileParsers.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAsStringParsing {
    public static void main(String[] args) throws IOException {
        printFileContentsAsString("C:\\Users\\carlo\\Desktop\\Movies.txt");
    }

    private static void printFileContentsAsString(String filePath) throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(fileContents);
    }

    private static void printFileCharContentsAsString(String filePath) throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get(filePath)));
        for (var character : fileContents.toCharArray()) {
            System.out.println(character);
        }
    }
}
