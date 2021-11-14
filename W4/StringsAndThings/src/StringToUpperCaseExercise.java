package W4.StringsAndThings.src;

public class StringToUpperCaseExercise {
    public static void main(String[] args) throws Exception {
        //we'll be using this string to demonstrate the method that converts it to uppercase
        String stringToUpper = "this string will be converted to to upper case";

        //Displays the functionality of .UpperCase() to the console
        System.out.println("Example String:\n" + stringToUpper);
        System.out.println("\nConverting it to uppercase:");

        System.out.println(uppercaseString(stringToUpper));


    }

    //function that returns the uppercase version of the string passed to it
    public static String uppercaseString(String s) {
        return s.toUpperCase();
    }
}
