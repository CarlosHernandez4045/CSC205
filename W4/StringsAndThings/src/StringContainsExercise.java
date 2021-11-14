package W4.StringsAndThings.src;

public class StringContainsExercise {
    public static void main(String[] args) {
        //the string we'll use to see if it contains a comma
        String comparedString = "Hello, this is a string to see if it contains commas";

        //demonstrates the functionality of .contains() to the console
        System.out.println("We're seeing if the following string contains a comma:\n" + comparedString + "\n");

        if(doesStringContainComma(comparedString)){
            System.out.println("The string compared does have a comma.");
        }
        else {
            System.out.println("The string compared does not have a comma.");
        }
    }

    //this function returns a true or false depending on whether the string passed to it contains a comma
    public static Boolean doesStringContainComma(String s) {
        return s.contains(",");
    }
}
