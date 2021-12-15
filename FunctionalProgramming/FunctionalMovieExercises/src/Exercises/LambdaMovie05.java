package Exercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import Model.Movie;

public class LambdaMovie05 {
    public static void test() { 
        List<Movie> movies = Movie.getMovieList();

        BigDecimal priceLimit = new BigDecimal("5.00");
    
        List<Movie> cheapMovies = new ArrayList<Movie>();
    
        //An example of bad practice is below. This is because it modifies the variable cheapMovies, which could cause side effects in the program.
        movies.forEach(movie -> { 
            if(movie.getPrice().compareTo(priceLimit) < 0) {
                cheapMovies.add(movie);
            }
        });

        cheapMovies.forEach(m -> System.out.println(m));
    }
}
