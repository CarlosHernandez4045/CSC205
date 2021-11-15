package W4.ParsingMovieRentals.src;

import W4.ParsingMovieRentals.src.Model.ColorConsole;

public class App {
    public static void main(String[] args) throws Exception {
        //takes in the CSV and sorts it
        var report = FileParser.SortInputCSVAndCreateReport("W4\\ParsingMovieRentals\\src\\TextFiles\\InputCSV.txt");

        //prints the results to the console
        ColorConsole.printBanner("VIDEO RENTALS");
        System.out.println(report.toString());

        //creates the report based on the string builder and the output file
        FileParser.CreateReport(report, "W4\\ParsingMovieRentals\\src\\TextFiles\\MovieReport.txt");
    }
}
