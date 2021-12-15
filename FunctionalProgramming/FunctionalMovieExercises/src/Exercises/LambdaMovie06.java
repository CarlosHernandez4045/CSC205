package Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;

import Model.Movie;

public class LambdaMovie06 {
    public static void test() {
        List<Movie> movies = Movie.getMovieList();

        //try/using block to write to a file
        try (FileWriter fileWriter = new FileWriter("products.txt")) {
            movies.forEach(m -> { 
                //We have to surround this using a try catch because the expression throws an IOException, this is similar to adding
                // a throws declaration to your method. It is still required for lambdas, so we have to handle it here. 
                try {
                    fileWriter.write(m.toString() + "\n");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            });
            System.out.println("Lambda Exercise 6 was successful.");
        } catch (Exception e) {
            System.out.println("FATAL ERROR OCCURED: " + e.getMessage() +
            "\nSTACK TRACE: " + e.getStackTrace());
        }
    }
}
