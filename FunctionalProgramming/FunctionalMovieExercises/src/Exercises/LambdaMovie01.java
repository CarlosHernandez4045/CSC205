package Exercises;

import java.util.Comparator;
import java.util.List;
import Model.Movie;

public class LambdaMovie01 {
    public static void test() { 
        List<Movie> movies = Movie.getMovieList();

        //Interface Comparator with an anonymous class
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getPrice().compareTo(movie2.getPrice());
            }
        });

        //Interface Comparator with a lambda expression
        movies.sort((m1, m2) -> m1.getPrice().compareTo(m2.getPrice()));

        //Comparator with more verbose syntax
        movies.sort((Movie m1, Movie m2) -> { 
            return m1.getPrice().compareTo(m2.getPrice());
        });

        //Finally print the results (redone in lambda form)
        movies.forEach(m -> System.out.println(m));
    }
}
