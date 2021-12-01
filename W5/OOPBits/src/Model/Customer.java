package W5.OOPBits.src.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Customer {
    private String name;
    private double debt;
    private double accountBalance; 

    private List<Rental> rentals = new ArrayList<Rental>();

    private static List<Customer> customerList = new ArrayList<Customer>();

    public Customer(String name, Rental rental) {
        this.name = name;
        this.debt = 0;

        if(customerList.contains(this)){
            Optional<Customer> matchCustomer = customerList.stream().
                filter(p -> p.getName().equals(this.name)).findFirst();
            Customer matchingCustomer = matchCustomer.get();
            matchingCustomer.addRentals(rental);
        } else {
            customerList.add(this);
            rentals.add(rental);
        }
    }
    public void addRentals(Rental rental){
        rentals.add(rental);
    }

    //Assignment 3 - Variable Parameters, we take any amount of doubles to add to debt
    public void addDebt(double... debts){
        for(double debt : debts) { 
            this.debt += debt;
        }
    }

    //Assignment 3 - Optional Parameters, we take a minimum of 1 double in order to take a payment, but allow flexibility for more
    public void addToAccountBalance(double initialAmount, double... payments) { 
        this.accountBalance += initialAmount;

        for(double payment : payments) { 
            this.accountBalance += payment;
        }
    }


    public String rentalRecords(){
        double totalAmount = 0;
        int customerRenterPoints = 0;
        String result = "Rental Records for "  + this.name + "\n";
        for (Rental rental : rentals) {
            double currentRentalCost = 0;
            var priceCode = rental.getMovie().getPriceCode();
            switch (priceCode) {
                case Movie.regular:
                    currentRentalCost += 2;
                    if(rental.getDaysRented() > 2) {
                        currentRentalCost += (rental.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.children:
                    currentRentalCost += 1.5;
                    if(rental.getDaysRented() > 2) {
                        currentRentalCost += (rental.getDaysRented() - 3) * 1.5;
                    }
                    break;
                case Movie.newRelease:
                    currentRentalCost += rental.getDaysRented() * 3;
                    break;
                default:
                    break;
            }
            //adding frequent renter points
            customerRenterPoints++;
            //bonus for new release 2 day rentals
            if(priceCode == Movie.newRelease && rental.getDaysRented() > 1) {
                customerRenterPoints++;
            }
            
            //add to the results string;
            result += "\t" + rental.getMovie().getTitle() +
                      "\t" + currentRentalCost + "\n\r";
            totalAmount += currentRentalCost;
        }  
        //add the total amount
        result += "\t"+ "Amount owed is : " + totalAmount + "\n \r" 
                + "\t"+ this.name + " earned : " + customerRenterPoints + " frequent renter points \r \n";
        return result;
    }
    

    // getters
    public String getName() {
        return this.name;
    }

    public double getDebt() { 
        return this.debt;
    }

    public static List<Customer> getCustomerList(){
        return customerList;
    }

    public double getAccountBalance() { 
        return this.accountBalance;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean equals = false;
        if(o instanceof Customer) {
            Customer toCompare = (Customer) o;
            return this.name.equals(toCompare.name);
        }
        return equals;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
