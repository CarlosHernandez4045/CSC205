package W4.FileParsers.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderParsing {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\carlo\\Desktop\\Movies.txt");

        printContentsOfFile(file, "Films");
    }

    public static void printContentsOfFile(File file, String whatToShow) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineContents;

        // switch based on what we want to parse and parse that
        switch (whatToShow) {
        case "Films":
            bufferedReader.readLine();
            System.out.println("Movies in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[0].trim());
            }
            bufferedReader.close();
            break;
        case "Genres":

            bufferedReader.readLine();
            System.out.println("Genres in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[1].trim());
            }
            bufferedReader.close();

            break;
        case "Lead Studios":

            bufferedReader.readLine();
            System.out.println("Lead Studios in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[2].trim());
            }
            bufferedReader.close();
            break;
        case "Audience Scores":

            bufferedReader.readLine();
            System.out.println("Audience Scores in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[3].trim());
            }
            bufferedReader.close();
            break;
        case "Profitability":

            bufferedReader.readLine();
            System.out.println("Profitabilities in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[4].trim());
            }
            bufferedReader.close();
            break;
        case "Rotten Tomatoes %":

            bufferedReader.readLine();
            System.out.println("Rotten Tomatoes % in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[5].trim());
            }
            bufferedReader.close();
            break;
        case "Worldwide Grosses":

            bufferedReader.readLine();
            System.out.println("Worldwide Grosses in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[5].trim());
            }
            bufferedReader.close();
            break;
        case "Years":
            bufferedReader.readLine();
            System.out.println("Years in file:");
            while ((lineContents = bufferedReader.readLine()) != null) {
                var lineContentsSplit = lineContents.split(",");
                System.out.println(lineContentsSplit[6].trim());
            }
            bufferedReader.close();

            break;
        // if default we want to print all the contents
        default:
            while ((lineContents = bufferedReader.readLine()) != null) {
                System.out.println(lineContents);
            }
            bufferedReader.close();
            break;
        }
    }
}
