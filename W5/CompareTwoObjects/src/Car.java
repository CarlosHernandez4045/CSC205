package W5.CompareTwoObjects.src;

import java.lang.Comparable;
import java.util.ArrayList;

public class Car implements Comparable<Car>{
    private String name;
    private double price;
    
    private static ArrayList<Car> listCars = new ArrayList<Car>();

    Car() {
        listCars.add(this);
    }
 
    Car(String name, double price) {
       this.name = name;
       this.price = price;
       listCars.add(this);
    }
 
    public String getName() {
       return name;
    }
 
    public double getPrice() {
       return price;
    }

    public static ArrayList<Car> getCarList() {
        return listCars;
    }

    //override toString in order to print the Cars correctly like shown in the canvas screenshot
    @Override
    public String toString(){
        return  this.name + ">"+ this.price;
    }

    //takes in a car paramater and compares the name to see if the car follows, precedes or is equal to the car passed alphabetically
    @Override
    public int compareTo(Car o) {
        if(this.name.compareTo(o.name) > 0) {
            return 3;
        }
        else if(this.name.compareTo(o.name) < 0) {
            return -3;
        } else {
            return 0;
        }
    }
    

}
