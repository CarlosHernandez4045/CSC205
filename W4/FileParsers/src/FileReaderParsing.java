package W4.FileParsers.src;

import java.io.FileReader;

public class FileReaderParsing {
    public static void main(String[] args) throws Exception {
        String file = "C:\\Users\\carlo\\Desktop\\Movies.txt";
        
        printContentsOfFile(file);
    }

    private static void printContentsOfFile(String file) throws Exception {
        FileReader fr = new FileReader(file);

        int i;

        //using StringBuilder that we learned about
        StringBuilder sb = new StringBuilder(); 

        //add each character to the StringBuilder
        while((i = fr.read()) != -1) {
            sb.append((char)i);
        }
        
        System.out.println(sb);

        fr.close();
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
