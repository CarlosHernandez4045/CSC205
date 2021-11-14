package W4.StringsAndThings.src;

public class StringLengthExercise {
    public static void main(String[] args) {
        //this string is what we'll get the length of
        String stringToGetLength = "Polymorphism";

        //Demonstrating the functionality of .length() to console
        System.out.println("Example String:");
        System.out.println("stringToGetLength");

        System.out.println("\nThe length of the example string through .length():");
        System.out.println(getLengthOfString(stringToGetLength));

    }

    //returns an int which is the length of the string passed to it
    public static int getLengthOfString(String s){
        return s.length();
    }
}
