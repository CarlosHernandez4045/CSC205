package Utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import Model.Movie;


public class FileParser {
      //this function sorts the input CSV and populates the data
      public static void ParseCSVAndPopulateData(String filePath) throws Exception{
        File inputFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String header = br.readLine();
        String contents;


        //Read from our CSV, create Movies, and add those movies to a hashtable for further functionality.
        while((contents = br.readLine()) != null){
            var splitLine = contents.split(",");
            Movie movie = new Movie(splitLine[1].trim(), Integer.parseInt(splitLine[0].trim()));

            //add it to a hashtable.
            MovieFunctionTable.addMovie(movie);
        }
    }

    public static void ParseCSVAndRemoveData(String filePath) throws Exception{
        File inputFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String header = br.readLine();
        String contents;


        //Read from our CSV remove associated IDs
        while((contents = br.readLine()) != null){
            var splitLine = contents.split(",");
            //add it to a hashtable.
            MovieFunctionTable.removeById(Integer.parseInt(splitLine[0].trim()));
        }
    }
}