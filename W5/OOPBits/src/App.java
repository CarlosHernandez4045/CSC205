package W5.OOPBits.src;

import W5.OOPBits.src.CurringPattern.AssembleCar;
import W5.OOPBits.src.Model.ColorConsole;
import W5.OOPBits.src.Model.Customer;
import W5.OOPBits.src.Model.Movie;
import W5.OOPBits.src.Model.Rental;

public class App {
    public static void main(String[] args) throws Exception {

        // var report = FileParser.SortInputCSVAndCreateReport("W4\\ParsingMovieRentals\\src\\TextFiles\\InputCSV.txt");

        // //prints the results to the console
        // ColorConsole.printBanner("VIDEO RENTALS");
        // System.out.println(report.toString());

        // //creates the report based on the string builder and the output file
        // FileParser.CreateReport(report, "W4\\ParsingMovieRentals\\src\\TextFiles\\MovieReport.txt");

        //assignments 1-3
        testAssignment1();
        testAssignment2();
        testAssignment3();

        //assignment 4
        testCurring();
        testCurringFail();
    }
    
    //Here we will test the first part of the assignment
    private static void testAssignment1() {
        System.out.println("ASSIGNMENT 1 - Overloaded Rental Constructor with 1 Parameter");
        System.out.println("------------------");
        var movie = new Movie("Spiderman", 'N');
        var rental = new Rental(movie);

        System.out.println("Rental object with 1 parameter was created.");
        System.out.println("It contains movie: " + rental.getMovie().getTitle());
        System.out.println("The days rented was assigned to: " + rental.getDaysRented());
    }

    private static void testAssignment2() {
        System.out.println("\nASSIGNMENT 2 - Function With Variable Amounts of Double Parameters");
        System.out.println("------------------");

        //Creating a new customer james to show our new variable parameter function
        Customer james = new Customer("James Paul", new Rental(new Movie("The Incredible Hulk", 'C')));
        //variable amounts of double data type parameters
        System.out.println("A new customer has been created, his name is " + james.getName() + " and his debt is " + james.getDebt() + ".");

        //defining some debts for James
        var lateMovieDebt = 2.29;
        var extremelyLateMovieDebt = 4.63;
        var currentLateFeeDebt = 2.00;

        james.addDebt(lateMovieDebt, extremelyLateMovieDebt, currentLateFeeDebt); //here we use 3 parameters, but we can use any

        System.out.println("\nAfter adding debt through our variable parameter function, James now has accumulated a debt of: " + String.valueOf(james.getDebt()));
    }

    private static void testAssignment3() {
        System.out.println("\nASSIGNMENT 3 - Function with Optional Amounts of Double Parameters");
        System.out.println("------------------");
        Customer chris = new Customer("Chris Jacobs", new Rental(new Movie("The Incredible Hulk", 'C')));
        System.out.println("A new customer has been created, his name is " + chris.getName() + " and his Account Balance is " + chris.getAccountBalance() + ".");

        chris.addToAccountBalance(1000); //here we only fill in the required parameter
        System.out.println("\nAfter the minimum of 1 payment through our optional parameter function, Chris' account balance is now: " + String.valueOf(chris.getAccountBalance()));
        
        chris.addToAccountBalance(1000, 10, 34, 24, 12, 23); //here we also fill in optional parameters
        System.out.println("\nAfter some payments that through the same function, Chris' account balance is now: " + String.valueOf(chris.getAccountBalance()));
    }

        //Here we will test the final part of the assignment
        private static void testCurring() { 
            System.out.println("\nASSIGNMENT 4 - Curried Function");
            System.out.println("------------------");
            
            var buildCar = new AssembleCar();
            buildCar.brainstorm()
                    .buildInternals()
                    .buildBody()
                    .putInternalsInBody()
                    .qualityAssurance()
                    .releaseProductCar();
        }
    
        private static void testCurringFail() { 
            System.out.println("\nASSIGNMENT 4 - Curried Function that FAILS");
            System.out.println("------------------");
    
            var buildCar = new AssembleCar();
            buildCar.brainstorm()
                    .buildInternals()
                    .putInternalsInBody()
                    .buildBody()
                    .qualityAssurance()
                    .releaseProductCar();
        }
        
    
}
