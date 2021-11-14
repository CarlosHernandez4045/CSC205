package W4.StringsAndThings.src;

public class stringStartsWithExercise {
    public static void main(String[] args) {
        //the string we'll use to see if it starts with "Hello"
        String comparedString = "Hello, we're seeing if this string starts with 'Hello'.";
        
        //Displaying the functionality of startsWith() to the console
        System.out.println("We're seeing if the following string contains a comma:\n" + comparedString + "\n");

        if(doesStringStartWithHello(comparedString)){
            System.out.println("The string compared does start with 'Hello'");
        }
        else {
            System.out.println("The string compared does not start with 'Hello'");
        }
    }

    //this function returns a true or false depending on whether the string passed to it contains "Hello"
    public static Boolean doesStringStartWithHello(String s) {
        return s.startsWith("Hello");
    }
}
