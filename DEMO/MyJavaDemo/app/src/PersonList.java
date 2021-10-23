/// Author: Carlos Hernandez
/// Date: 22 October 2021
/// Course: CSC205
/// Info: We'll be using this class to iterate through our person class, making our code cleaner and more concise

package DEMO.MyJavaDemo.app.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonList implements Iterable<Person> {
    //we'll be using this class to iterate through our person class
    private final List<Person> pList = new ArrayList<Person>();

    @Override
    public Iterator<Person> iterator() {
        return pList.iterator();
    }

    public int size() { return pList.size(); }

    public void add(Person p) { pList.add(p); }

    //override add method in order to add multiple instances of Person to the list at once if needed
    public void add(Person... p) { 
        for(Person person : p){
            pList.add(person);
        }
    }

    public void remove(Person p) { pList.add(p); }
}
