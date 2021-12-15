package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;

//Tweaked the movie class to take in a price in order to be able to do all the lambda exercises shown!
public class Movie {
    private String title;
    private BigDecimal price;

    //manually populating 10 Movies as the assignment states
    private static List<Movie> movieList = Arrays.asList(
        new Movie("Spider-Man: No Way Home", new BigDecimal(29)),
        new Movie("The Matrix", new BigDecimal(13)),
        new Movie("Venom", new BigDecimal(14.25)),
        new Movie("No Time To Die", new BigDecimal(13)),
        new Movie("Elf", new BigDecimal(10.75)),
        new Movie("Encanto", new BigDecimal(9.54)),
        new Movie("Batman Returns 1992", new BigDecimal(4.50)),
        new Movie("Jurassic Park", new BigDecimal(7.30)),
        new Movie("007: Tomorrow Never Dies", new BigDecimal(6.55)),
        new Movie("Rush Hour", new BigDecimal(11.25)),
        new Movie("Terminator 2: Judgement Day", new BigDecimal(5.00))
    );

    public Movie(String title, BigDecimal price) {
        this.title = title;
        this.price = price;

        if(!movieList.contains(this)) {
            movieList.add(this);
        }
    }

    //getters
    public String getTitle() {
        return this.title;
    }

    public static List<Movie> getMovieList(){
        return movieList;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public boolean equals(Object o) {
        boolean equals = false;
        if(o instanceof Movie) {
            if(((Movie)o).getTitle() == this.title) { 
                equals = true;
            }
        }
        return equals;
    }

}
