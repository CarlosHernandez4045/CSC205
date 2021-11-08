package W3.OOPDesign.src.Model;

public class Movie{
    public static final char children = 'C';
    public static final char regular = 'R';
    public static final char newRelease = 'N';

    private String title;
    private char priceCode;

    public Movie(String title, char priceCode) {
        this.title = title;
        this.priceCode = regulatePriceCode(priceCode);
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
    public double getCharge(int daysRented){
        switch (priceCode) {
            case Movie.children:
                var childrensPrice = new ChildrensPrice();
                return childrensPrice.getCharge(daysRented);

            case Movie.regular:
                var regularPrice = new RegularPrice();
                return regularPrice.getCharge(daysRented);

            case Movie.newRelease:
                var newReleasePrice = new NewReleasePrice();
                return newReleasePrice.getCharge(daysRented);   
            default:
                break;
        }
        return 0.0;
    }

    public double getFrequentRenterPoints(int daysRented){
        switch (priceCode) {
            case Movie.children:
                var childrensPrice = new ChildrensPrice();
                return childrensPrice.getFrequentRenterPoints(daysRented);

            case Movie.regular:
                var regularPrice = new RegularPrice();
                return regularPrice.getFrequentRenterPoints(daysRented);

            case Movie.newRelease:
                var newReleasePrice = new NewReleasePrice();
                return newReleasePrice.getFrequentRenterPoints(daysRented);   
            default:
                break;
        }
        return 0.0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPriceCode() {
        return this.priceCode;
    }
}
