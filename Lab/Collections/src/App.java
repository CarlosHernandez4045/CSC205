package Lab.Collections.src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        var dbContext = new PersonDataContext(true);
        
        ArrayList<Person> personsDB = dbContext.getPeople();

        // parallel
        for(Person person : personsDB) {
            System.out.println(person);
            person.setFn(person.getFn().toUpperCase());
        }



        //optimized code - runs on multiple processors
        personsDB.forEach(p -> p.getFn().toUpperCase()); 
    }
}
