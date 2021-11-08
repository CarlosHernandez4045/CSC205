package W3.OOPDesign.src.Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    //list to make iterating through customers easier
    private static List<Customer> customerList = new ArrayList<Customer>();

    public Customer(String name) {
        this.name = name;
        customerList.add(this);
    }
    public void addRentals(Rental rental){
        rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    //gets the total charge of customers rentals
    public double getTotalCharge(){
        double totalCharge = 0;

        for(Rental rental : rentals){
            totalCharge += rental.getCharge();
        }

        return totalCharge;
    }

    public double getTotalFrequentRenterPoints() {
        double totalFrequentRenterPoints = 0;

        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
        }

        return totalFrequentRenterPoints;
    }

    //the customers rental records and statement, including what they owe and what discounts they have been paid
    public String rentalRecords(){
        double totalDiscount = 0;
        String result = "Rental Records for "  + this.name + "\n";
        for (Rental rental : rentals) {
            //add to the results string;
            result += "\t" + rental.getMovie().getTitle() +
                      "\t" + rental.getCharge() + "\n\r" +
                      "\tDiscount paid back for " + rental.getMovie().getTitle() + ": " + rental.getDiscountPaidInCash() + "\n\r";
            totalDiscount += rental.getDiscountPaidInCash();
        }  
        //add the total amount
        result += "\t"+ "Amount owed is : " + getTotalCharge() + "\n \r" 
                + "\t"+ this.name + " earned : " + getTotalFrequentRenterPoints() + " frequent renter points \r \n"
                + "\tDiscounts paid back to "+ this.name + " in total : " + totalDiscount + "\r \n";
        return result;
    }
    
    // getters
    public static List<Customer> getCustomerList(){
        return customerList;
    }


}
