package W4.FileParsers.src;

import java.io.FileReader;

public class FileReaderParsing {
    public static void main(String[] args) throws Exception {
        String file = "C:\\Users\\carlo\\Desktop\\Movies.txt";
        
        printContentsOfFile(file, "All");
    }

    private static void printContentsOfFile(String file, String whatToPrint) throws Exception {
        FileReader fr = new FileReader(file);
        
        int i;
        
        //using StringBuilder that we learned about
        StringBuilder sb = new StringBuilder(); 
        
        //add each character to the StringBuilder
        while((i = fr.read()) != -1) {
            sb.append((char)i);
        }
        System.out.println(sb);
        String[] sbContentsArray = sb.toString().replace("\n", "#").split("#");
        
        fr.close();
        
        switch (whatToPrint) {
        case "Films":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[0]);
            }
            break;
        case "Genres":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[1]);
            }
            break;
        case "Lead Studios":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[2]);
            }
            break;
        case "Audience Scores":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[3]);
            }
            break;
        case "Profitability":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[4]);
            }
            break;
        case "Rotten Tomatoes %":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[5]);
            }
            break;
        case "Worldwide Grosses":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[6]);
            }
            break;
        case "Years":
            for (String stringLine : sbContentsArray) {
                var stringLineSplit = stringLine.split(",");
                System.out.println(stringLineSplit[7]);
            }
            break;
        default:
            for (var stringLine : sbContentsArray) {
                System.out.println(stringLine);
            }
            break;
        }
    }

    private static void printCharContentsOfFile(String file) throws Exception {
        FileReader fr = new FileReader(file);

        int i;

        //add each character to the StringBuilder
        while((i = fr.read()) != -1) {
            System.out.println((char)i);
        }

        fr.close();
    }
}
