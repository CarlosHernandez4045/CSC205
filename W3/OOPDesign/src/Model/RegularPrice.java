package W3.OOPDesign.src.Model;

public class RegularPrice extends Price{
    @Override
    public char getPriceCode() {
        return Movie.regular;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if(result > 2){
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }


}
