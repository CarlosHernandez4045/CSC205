package W3.OOPDesign.src.Model;

public class NewReleasePrice extends Price{
    
    @Override
    public char getPriceCode() {
        return Movie.newRelease;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    //the only class that states this method because its the only that deviates from the usual 1 point. 
    //also only class that states this in the UML
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }

}
