/// Author: Carlos Hernandez
/// Date: 22 October 2021
/// Course: CSC205
/// Info:  Abstracts address of instances of Person class, also uses Hashtable to return that address using the instance or this class later.

package DEMO.MyJavaDemo.app.src;

import java.util.Hashtable;

public class Address {
    String address1;
    String address2;
    String city;
    String state;
    Person currentPerson;
    int zipCode;
    
    //to make address retrievable by person
    private static Hashtable<Person, String> addressHashtable = new Hashtable<Person, String>();
    
    //simple constructors
    public Address(Person p, String address1, String address2, String city, String state, int zipCode){
        this.currentPerson = p;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

        addressHashtable.put(p, setAddressKey());
    }
    public Address(Person p, String address1, String address2, String city, String state){
        this.currentPerson = p;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;

        addressHashtable.put(p, setAddressKey());
    }
    public Address(Person p, String address1, String address2, String city){
        this.currentPerson = p;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;

        addressHashtable.put(p, setAddressKey());
    }
    public Address(Person p, String address1, String address2){
        this.currentPerson = p;
        this.address1 = address1;
        this.address2 = address2;

        addressHashtable.put(p, setAddressKey());
    }
    public Address(Person p, String address1){
        this.currentPerson = p;
        this.address1 = address1;

        addressHashtable.put(p, setAddressKey());
    }
    public Address(Person p){
        this.currentPerson = p;

        addressHashtable.put(p, setAddressKey());
    }

    //methods
    public static boolean containsPerson(Person p){
        return addressHashtable.containsKey(p);
    }

    public static String getAddressOfPerson(Person p){
        try {
            return addressHashtable.get(p);
        } catch (Exception e) {
            return "Error when retrieving address.";
        }
    }

    //getters and setters
    private String setAddressKey(){
        if(address1 != null & address2 != null & city != null & state != null & zipCode != 0){
            return 
            "\nAddress 1: " + address1 + 
            "\nAddress 2: " + address2 +
            "\nCity: " + city +
            "\nState: " + state + 
            "\nZip Code: " + zipCode;

        } else if(address1 != null & address2 != null & city != null & state != null){
            return 
            "\nAddress 1: " + address1 + 
            "\nAddress 2: " + address2 +
            "\nCity: " + city +
            "\nState: " + state;

        } else if(address1 != null & address2 != null & city != null ){
            return 
            "\nAddress 1: " + address1 + 
            "\nAddress 2: " + address2 +
            "\nCity: " + city;

        } else if(address1 != null & address2 != null ){
            return 
            "\nAddress 1: " + address1 + 
            "\nAddress 2: " + address2;
        } else if(address1 != null & address2 != null ){
            return 
            "\nAddress 1: " + address1;
        }

        return null;
    }

    public String getAddress1(){
        return address1;
    }

    public void setAddress1(String address1){
        this.address1 = address1;
    }

    public String getAddress2(){
        return address2;
    }

    public void setAddress2(String address2){
        this.address2 = address2;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int getZipCode(){
        return zipCode;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
}
