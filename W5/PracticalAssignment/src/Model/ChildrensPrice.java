package W5.PracticalAssignment.src.Model;

public class ChildrensPrice extends Price{
    @Override
    public char getPriceCode() {
        return Movie.children;
    }
    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if(result > 3){
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
