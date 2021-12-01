package W5.PracticalAssignment.src;

import W5.PracticalAssignment.src.Model.Movie;
import java.util.ArrayList;
import java.util.Collections;

public class TestVideoRentals {
    public static void main(String[] args) throws Exception {
        startTest();
    }

    public static void startTest(){
        //instantiating our 10 movies 
        Movie movie1 = new Movie("Ghostbusters", 'C');
        Movie movie2 = new Movie("Encanto", 'C');
        Movie movie3 = new Movie("Venom", 'R');
        Movie movie4 = new Movie("Clifford the Big Red Dog", 'C');
        Movie movie5 = new Movie("Die Hard", 'N');
        Movie movie6 = new Movie("No Time To Die", 'R');
        Movie movie7 = new Movie("Spiderman: No Way Home", 'N');
        Movie movie8 = new Movie("Avengers 3", 'N');
        Movie movie9 = new Movie("James Bond: 2021", 'N');
        Movie movie10 = new Movie("Elf", 'N');

        //adding them to a list
        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);
        moviesList.add(movie5);
        moviesList.add(movie6);
        moviesList.add(movie7);
        moviesList.add(movie8);
        moviesList.add(movie9);
        moviesList.add(movie10);

        
        //Show them before sorting
        System.out.println("ArrayList before sorting: ");
        for (Movie movie : moviesList) {
            System.out.println(movie);
        }
        //Explain what we're doing
        System.out.println("\nWe will sort these movies alphabetically, and also by price code.\n"
        + "New releases go first, followed by Regular releases, then Children's releases.\n" 
        + "Each category will be alpabetically ordered on it's own.\n");
        
        //sort them
        Collections.sort(moviesList);

        //Show them after sorting
        System.out.println("ArrayList after sorting: ");
        for (Movie movie : moviesList) {
            System.out.println(movie);
        }

    }
}
