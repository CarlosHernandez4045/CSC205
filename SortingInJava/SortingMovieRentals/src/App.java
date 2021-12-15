import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import Model.Movie;
import Model.Rental;


public class App {
    public static void main(String[] args) throws Exception {
        ParseCSV(); //parses the CSV and generates the lists we use to sort them
        sortAndPrintMoviesByName(); //sorts the movies by movie name and prints them
        sortAndPrintRentalsByDaysRented(); //sorts the rentals by days rented reverse sort (least to greatest)

        //I've included the option to leave in the movie names in the printRentals method if that's something you want to look at!
    }

    public static void sortAndPrintMoviesByName(){
        //Listing movies by movie name
        List<Movie> movies = Movie.getMovieList();
        System.out.println("The list of movies before sorting them:\n" + movies.stream().map(Movie::getTitle).collect(Collectors.toList()));
        
        //sort the movie names
        movies.sort((m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
        System.out.println("\nThe list of movies after sorting them:\n" + movies.stream().map(Movie::getTitle).collect(Collectors.toList()));
    }

    public static void sortAndPrintRentalsByDaysRented(){
        //Listing rentals
        List<Rental> rentals = Rental.getRentalList();
        var daysRentedNumbers = rentals.stream().map(Rental::getDaysRented).collect(Collectors.toList());
        System.out.println("\nThe list of rental days before sorting them:\n" + rentals.stream().map(Rental::getDaysRented).collect(Collectors.toList()));
        
        //Sorting and printing the rentals
        rentals.sort((r1, r2) -> r1.getDaysRented().compareTo(r2.getDaysRented()));
        System.out.println("\nThe list of rental days after reverse sorting them (least to greatest):\n" + rentals.stream().map(Rental::getDaysRented).collect(Collectors.toList()));
        
        //If you want the movie name accompanied with the days rented. 
        // System.out.println("\nThe list of rental days after reverse sorting them (least to greatest):\n" + rentals);

    }


    public static void ParseCSV() throws Exception{
        System.out.println("Hello, World!");

        var br = new BufferedReader(new FileReader("src\\CSVFile.txt"));

        //using regex to find and parse our movie rental properties
        Pattern daysRentedPattern = Pattern.compile("[\\d]+");
        Pattern moviePriceCodePattern = Pattern.compile("[\\s]+[\\D]?[\\s]+");

        String header = br.readLine();
        String line;
        
        //Parse through data, use regex to find our properties, then fill
        while((line = br.readLine()) != null) { 
            Matcher daysRented = daysRentedPattern.matcher(line);
            Matcher priceCode = moviePriceCodePattern.matcher(line);
            String movieTitle = line.replaceAll("[\\s]+[\\D]?[\\s]+|[\\d]+|[,]", "").trim();
            
            if(priceCode.find() && daysRented.find()){ 
                Movie movie = new Movie(movieTitle, priceCode.group().charAt(1));
                Rental rental = new Rental(movie, Integer.valueOf(daysRented.group()));
            }
        }
        br.close();
    }
}
