package W5.CustomComparableInterface.src.Model;

import java.util.ArrayList;
import java.util.List;

public class Rental implements Comparable<Rental>{
    private Movie movie;
    private int daysRented;

    private static List<Rental> rentalList = new ArrayList<Rental>();

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
        rentalList.add(this);    
    }


    //getters
    public Movie getMovie() {
        return this.movie;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public static List<Rental> getRentalList() {
        return rentalList;
    }

    @Override
    public int compareTo(Rental o) {
        return this.daysRented - o.daysRented;
    }


}
