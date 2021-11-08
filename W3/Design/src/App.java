package W3.Design.src;

import W3.Design.src.Model.ColorConsole;
import W3.Design.src.Model.Movie;
import W3.Design.src.Model.Rental;
import W3.Design.src.Model.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        startTest();
    }

    public static void startTest(){
        Movie noTimeToDieMovie = new Movie("No time to Die", 'N');
        Movie annaMovie = new Movie("Anna", 'C');
        Movie frozenMovie = new Movie("Frozen", 'C');

        Customer david = new Customer("David Smith");
        Customer marry = new Customer("Marry Ann");
        Customer jack = new Customer("Jack Moore");

        david.addRentals(new Rental(noTimeToDieMovie, 3));
        david.addRentals(new Rental(annaMovie, 2));
        marry.addRentals(new Rental(annaMovie, 1));
        marry.addRentals(new Rental(frozenMovie, 4));
        jack.addRentals(new Rental(annaMovie, 5));
        jack.addRentals(new Rental(noTimeToDieMovie, 3));

        ColorConsole.printBanner("VIDEO RENTALS");

        for(var customer : Customer.getCustomerList()){
            System.out.println(customer.rentalRecords());
            ColorConsole.println("-------------------------------------------------------------"); //uses color console to get a different color seperator
        }
    }
}
