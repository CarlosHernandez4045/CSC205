package Model;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int movieID;

    private static List<Movie> movieList = new ArrayList<Movie>();

    public Movie(String title, int movieID) {
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

    public int getMovieID() {
        return this.movieID;
    }

    @Override
    public String toString() {
        return "Movie [movieID=" + movieID + ", title=" + title + "]";
    }

    public boolean equals(Object o) {
        boolean equals = false;
        if(o instanceof Movie) {
            if(((Movie) o).getMovieID() == this.movieID) { 
                equals = true;
            }
        }
        return equals;
    }

}