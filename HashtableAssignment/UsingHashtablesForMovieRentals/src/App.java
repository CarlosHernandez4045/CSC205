import java.io.File;

import Model.Movie;
import Utility.FileParser;
import Utility.MovieFunctionTable;

public class App {
    private static final String INPUT_CSV_DIRECTORY = "C:\\Users\\carlo\\Documents\\CodingWorkspaces\\VSCode\\CSC205\\HashtableAssignment\\UsingHashtablesForMovieRentals\\src\\InputCSV.txt";
    public static void main(String[] args) throws Exception {
        //takes in the CSV and sorts it, populating Movies, and a Hashtable
        FileParser.ParseCSVAndPopulateData(INPUT_CSV_DIRECTORY);
        //I was a bit confused on this assignment. So I made this test function to show the functionality you wanted added and how it got added.
        testFunctionsOfHashtable();
    }

    public static void testFunctionsOfHashtable() throws Exception { 
        System.out.println("\nNow that we have a hashtable and an ID system implemented, we can do several things, like adding, finding and removing movies!" +
        "\nBelow you'll find several different tests we'll run for different areas of functionality." );

        System.out.println("\n---------FINDING MOVIES----------");

        System.out.println("We're going to see if the hashtable has the object of the movie 'Venom' we should've parsed from the CSV file." + 
        "\nBelow are the results:");
        if(MovieFunctionTable.containsMovieAlready(new Movie("Venom", 52345))){ 
            System.out.println("\nThe Hashtable has that movie already!");
        } else { 
            System.out.println("\nThe Hashtable does not have that movie already.");
        }

        System.out.println("\nNow we're going to see if we can find movies through the ID we paired with it. 19854 should return WALL-E." + 
        "\nBelow are the results:");
        
        System.out.println("Movie returned: " + MovieFunctionTable.lookupById(19854));

        System.out.println("\n---------ADDING MOVIES----------");
        System.out.println("Our hashtable also supports adding movies. We'll see if that works below:\n");

        MovieFunctionTable.addMovie(new Movie("The Polar Express", 87872));


        System.out.println("\n---------REMOVING MOVIES----------");
        System.out.println("Additionally, with our hashtable, we can remove movies. Let's remove the movie we just added.\nWe'll show that off below:\n");

        //The ID we associated with the Movie we want to remove.
        MovieFunctionTable.removeById(87872);

        System.out.println("\n---------REMOVING MOVIES WITH CSV----------");
        System.out.println("As a bonus, we'll demonstrate the removal functionality with the hashtable parsing a CSV.\n" +
        "We'll remove all the Movies we added to our hashtable through a quick parse shown below:\n");

        FileParser.ParseCSVAndRemoveData(INPUT_CSV_DIRECTORY);
    }
}