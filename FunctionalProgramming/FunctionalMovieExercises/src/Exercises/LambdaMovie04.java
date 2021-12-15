package Exercises;

import java.math.BigDecimal;
import java.util.List;

import Model.Movie;

public class LambdaMovie04 {
    public static void test(){
        List<Movie> movies = Movie.getMovieList();
        BigDecimal priceLimit = new BigDecimal("5.00");
    
        int numberOfAffordableMovies = 0;
    
        for(Movie movie : movies) { 
            if(movie.getPrice().compareTo(priceLimit) < 0) { 
                numberOfAffordableMovies++;
            }
        }

        System.out.println("Out of " + movies.size() + " movies, we found " + numberOfAffordableMovies + " affordable/cheap one(s).");
    }
}
