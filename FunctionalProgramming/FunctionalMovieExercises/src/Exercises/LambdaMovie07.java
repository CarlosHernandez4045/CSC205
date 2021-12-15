package Exercises;

import java.math.BigDecimal;
import java.util.List;

import Model.Movie;

public class LambdaMovie07 {
    interface MovieMaker { 
        Movie create(String title, BigDecimal price);
    }

    static boolean isExpensive(Movie movie) {  return movie.getPrice().compareTo(new BigDecimal("5.00")) >= 0; }

    public static void test() { 
        List<Movie> movies = Movie.getMovieList();

        //using method references through the operator :: instead of a lambda
        System.out.println("Printing all movies:");
        movies.forEach(System.out::println);

        //method references being used on a static method that we implemented above
        movies.removeIf(LambdaMovie07::isExpensive);

        //method reference being used on an instance method
        System.out.println("\nPrinting all movies after removing the expensive ones through a static method reference:");
        movies.stream().map(Movie::getTitle).forEach(System.out::println);

        //method reference being used on a constructor
        MovieMaker movieMaker = Movie::new;

        System.out.println("\nThe new movie we created through a method reference in a constructor and our movie maker interface:");
        Movie djangoMovie = movieMaker.create("The Joker", new BigDecimal("8.88"));
        System.out.println(djangoMovie);
    }
}
