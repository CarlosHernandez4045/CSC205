package W5.PracticalAssignment.src.Model;

public abstract class Price {
    
    public abstract char getPriceCode();

    public abstract double getCharge(int daysRented);
    
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    };
}
