package Model;

import java.util.ArrayList;
import java.util.List;

public class Movie implements Comparable<Movie> {
    
    public static final char children = 'C';
    public static final char regular = 'R';
    public static final char newRelease = 'N';

    private String title;
    private char priceCode;

    private static List<Movie> movieList = new ArrayList<Movie>();

    public Movie(String title, char priceCode) {
        this.title = title;
        this.priceCode = regulatePriceCode(priceCode);

        if(!movieList.contains(this)) {
            movieList.add(this);
        }
    }


    private char regulatePriceCode(char priceCode){

        if(priceCode != 'C' && priceCode != 'R' && priceCode != 'N'){
            return 'R';
        }
        else {
            return priceCode;
        }
    }

    //getters
    public String getTitle() {
        return this.title;
    }

    public char getPriceCode() {
        return this.priceCode;
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }


    //overrides

    @Override
    public String toString() {
        return "Movie [priceCode=" + priceCode + ", title=" + title + "]";
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


    @Override
    public int compareTo(Movie o) {
        if(this.title.compareTo(o.title) < 0) { 
            return -3;
        } else if(this.title.compareTo(o.title) > 0) { 
            return 3;
        } else {
            return 0;
        }
    }

}

