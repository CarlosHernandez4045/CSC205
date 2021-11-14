package W4.StringsAndThings.src;

import java.nio.charset.MalformedInputException;

public class StringEqualsExercise {
    public static void main(String[] args) {
        //the 2 strings we'll use two see if they equal 'CSC205'
        String helloString = "Hello";
        String csc205String = "CSC205";

        //demonstrates the functionality of .equals() to the console
        System.out.println("String we're seeing is equal to 'CSC205':\n" + helloString);
        if(doesStringEqualCSC205(helloString)){
            System.out.println(helloString + " is equal to 'CSC205'");
        } else {
            System.out.println(helloString + " is not equal to 'CSC205'");
        }

        System.out.println("\nString we're seeing is equal to 'CSC205':\n" + csc205String);
        if(doesStringEqualCSC205(csc205String)){
            System.out.println(csc205String + " is equal to 'CSC205'");
        } else {
            System.out.println(csc205String + " is not equal to 'CSC205'");
        }
    }

    //this function returns a true or false depending on whether the string equals 'CSC205'
    public static Boolean doesStringEqualCSC205(String s){
        return s.equals("CSC205");
    }
    
}
