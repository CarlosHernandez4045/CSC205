package Lab.Collections.src;

import java.util.ArrayList;
import java.util.Comparator;

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
        personsDB.forEach(p -> p.setFn(p.getFn()));

        personsDB.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getPersonID().compareTo(p2.getPersonID());
            }
        });

        //lambda
        personsDB.sort((p1, p2) -> {
            return p1.getPersonID().compareTo(p2.getPersonID());
        });

        personsDB.forEach(p -> System.out.println(p)); 
        personsDB.forEach(p -> p.setLn(p.getLn().toUpperCase())); 
        personsDB.forEach(p -> System.out.println(p)); 

    }
}
