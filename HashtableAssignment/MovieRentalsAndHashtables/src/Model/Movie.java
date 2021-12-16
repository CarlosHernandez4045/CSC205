package W4.ParsingMovieRentals.src.Model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int movieID;

    private static List<Movie> movieList = new ArrayList<Movie>();

    public Movie(String title) {
        this.title = title;
        this.movieID = movieID;

        if(!movieList.contains(this)) {
            movieList.add(this);
        }
    }


    //getters
    public String getTitle() {
        return this.title;
    }

    public char getPriceCode() {
        return this.priceCode;
    }

    public boolean equals(Object o) {
        boolean equals = false;
        if(o instanceof Movie) {
            if(((Movie)o).getTitle() == this.title && ((Movie)o).getPriceCode() == this.priceCode) { 
                equals = true;
            }
        }
        return equals;
    }

}
