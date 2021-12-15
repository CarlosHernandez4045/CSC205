package Exercises;

import java.math.BigDecimal;
import java.util.List;

import Model.Movie;

public class LambdaMovie03 {
    interface ProductFilter {
        boolean accept(Movie movie);
    }

    //This method/exercise only prints products that pass the filter
    static void printFilteredMovies(List<Movie> movies, ProductFilter filter) { 
        movies.forEach(m -> { 
            if(filter.accept(m)) { 
                System.out.println(m);
            }
        });
    }

    //Testing the exercise
    public static void test(){ 
        List<Movie> movies = Movie.getMovieList();

        //making it final to avoid errors
        final BigDecimal priceLimit = new BigDecimal("5.00");

        ProductFilter filter = movie -> movie.getPrice().compareTo(priceLimit) < 0;

        printFilteredMovies(movies, filter);
    }
}
