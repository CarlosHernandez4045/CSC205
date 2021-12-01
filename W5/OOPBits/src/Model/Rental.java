package W5.OOPBits.src.Model;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    //Assignment 1 - Overloaded Constructor, we take only one parameter and give daysRented the default value of 1
    public Rental(Movie movie) { 
        this.movie = movie;
        this.daysRented = 1;
    }

    //getters
    public Movie getMovie() {
        return this.movie;
    }

    public int getDaysRented() {
        return this.daysRented;
    }
}
