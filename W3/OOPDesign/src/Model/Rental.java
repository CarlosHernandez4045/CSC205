package W3.OOPDesign.src.Model;

public class Rental implements Discount {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    //getters
    public Movie getMovie() {
        return this.movie;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }

    public double getFrequentRenterPoints() { 
        return movie.getFrequentRenterPoints(daysRented);
    }

    @Override
    public double getDiscountPaidInCash() {

        switch (movie.getPriceCode()) {
            case Movie.children:
                return movie.getCharge(daysRented) * 0.02; // 2% discount

            case Movie.regular:
                return movie.getCharge(daysRented) * 0.05; // 5% discount

            case Movie.newRelease:
                return movie.getCharge(daysRented) * 0.01; // 1% discount
            default:
                break;
        }
        return 0.0;
    }
}
