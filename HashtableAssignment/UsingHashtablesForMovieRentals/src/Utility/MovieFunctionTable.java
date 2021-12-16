package Utility;

import java.util.HashMap;
import java.util.Hashtable;

import Model.Movie;

public class MovieFunctionTable {

    private static Hashtable movieHashtable = new Hashtable<Integer, Movie>();

    public static void addMovie(final Movie movieToAdd) { 

        int currentId = movieToAdd.getMovieID();

        if(movieHashtable.containsKey(currentId)){
            System.out.println("Couldn't add! There was a duplicate found.");
        }
        else { 
            movieHashtable.put(currentId, movieToAdd);
            System.out.println("Added movie to Hashtable: " + movieToAdd.toString());
        }
    }

    public static Movie lookupById(final int id) { 
        return (Movie) movieHashtable.get(id);
    }

    public static Boolean containsMovieAlready(final Movie movie) {
        return movieHashtable.containsValue(movie);
    }

    public static void removeById(final int id) { 
        movieHashtable.remove(id);
        System.out.println("Successfully removed Movie with ID: " + id);
    }
}
