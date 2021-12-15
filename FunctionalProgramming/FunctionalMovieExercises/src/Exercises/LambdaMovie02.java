package Exercises;

import java.math.BigDecimal;
import java.util.List;

import Model.Movie;

public class LambdaMovie02 {
    
    //This exercise/method prints items less then the price limit!
    static void printUnderPriceLimit(List<Movie> movies, BigDecimal priceLimit) { 
        movies.forEach(m -> { 
            if(m.getPrice().compareTo(priceLimit) < 0) { 
                System.out.println(m);
            }
        });
    }

    //testing the above function
    public static void test(){
        List<Movie> movies = Movie.getMovieList();

        BigDecimal priceLimit = new BigDecimal("5.00");

        printUnderPriceLimit(movies, priceLimit);
    }
}
