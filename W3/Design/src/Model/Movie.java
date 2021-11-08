package W3.Design.src.Model;

public class Movie {
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
    public String getTitle() {
        return this.title;
    }

    public int getPriceCode() {
        return this.priceCode;
    }
}
