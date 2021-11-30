package W5.CustomComparableInterface.src;

import W5.CustomComparableInterface.src.Model.ColorConsole;
import W5.CustomComparableInterface.src.Sorters.AlphabeticalMoviesParser;
import W5.CustomComparableInterface.src.Sorters.DaysRentedParser;

public class App {
    public static void main(String[] args) throws Exception {
        String inputCSV = "C:\\Users\\carlo\\Documents\\CodingWorkspaces\\VSCode\\CSC205\\W5\\CustomComparableInterface\\src\\TextFiles\\InputCSV.txt";
        String outputAlphabeticalReport = "C:\\Users\\carlo\\Documents\\CodingWorkspaces\\VSCode\\CSC205\\W5\\CustomComparableInterface\\src\\TextFiles\\SortedByMovieNameReport.txt";
        
        
        testSortingByName(inputCSV, outputAlphabeticalReport);

        /*
            THE SECTION BELOW CAN BE UNCOMMENTED TO TEST FURTHER IMPLEMENTATIONS OF COMPARABLE
            This method and class instead sorts the CSV by the Days Rented, and creates a report of Rentals sorted by Least to Greatest
            It's something extra I did in order to interact and learn more about the interface, but is not necessary to test just sorting
            by name. Thank you for reading!
        */

        // String outputDaysRentedReport = "C:\\Users\\carlo\\Documents\\CodingWorkspaces\\VSCode\\CSC205\\W5\\CustomComparableInterface\\src\\TextFiles\\SortedByDaysRentedReport.txt";
        // testSortingByDaysRented(inputCSV, outputDaysRentedReport);
    }

    private static void testSortingByName(String inputCSV, String outputReport) throws Exception {
        //takes in the CSV and creates a report of the movies alphabetically
        var report = AlphabeticalMoviesParser.SortCSVByMovieName(inputCSV);

        //prints the results to the console
        ColorConsole.printBanner("ALPHABETICALLY SORTED MOVIE REPORT");
        System.out.println(report.toString());

        //creates the report based on the string builder and the output file
        AlphabeticalMoviesParser.CreateReport(report, outputReport);
    }

    private static void testSortingByDaysRented(String inputCSV, String outputReport) throws Exception {
        
        //takes in the CSV and creates a report of the movies by how long they have been rented
        var report = DaysRentedParser.SortCSVByDaysRented(inputCSV);

        //prints the results to the console
        ColorConsole.printBanner("DAYS RENTED SORTED MOVIE REPORT");
        System.out.println(report.toString());

        //creates the report based on the string builder and the output file
        DaysRentedParser.CreateReport(report, outputReport);
    }
}
