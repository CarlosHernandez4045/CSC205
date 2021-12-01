package W5.OOPBits.src.Model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
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
