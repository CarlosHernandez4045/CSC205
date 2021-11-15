package W4.ParsingMovieRentals.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import W4.ParsingMovieRentals.src.Model.ColorConsole;
import W4.ParsingMovieRentals.src.Model.Customer;
import W4.ParsingMovieRentals.src.Model.Movie;
import W4.ParsingMovieRentals.src.Model.Rental;

public class App {
    public static void main(String[] args) throws Exception {
        //takes in the CSV and sorts it
        var report = FileParser.SortInputCSVAndCreateReport("W4\\ParsingMovieRentals\\src\\TextFiles\\InputCSV.txt");
        //prints the results to the console
        ColorConsole.printBanner("VIDEO RENTALS");
        System.out.println(report);

        //creates the report based on the string builder and the output file
        FileParser.CreateReport(report, "W4\\ParsingMovieRentals\\src\\TextFiles\\OutputReport.txt");
    }
}
