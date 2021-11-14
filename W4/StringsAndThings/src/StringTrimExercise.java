package W4.StringsAndThings.src;

public class StringTrimExercise {    
    public static void main(String[] args) {
    //this string is what we'll use to remove whitespace from
    String stringToTrim = "     surrounded by whitespace     ";

    //Demonstrating the functionality of .trim() to console
    System.out.println("Example String:");
    System.out.println(stringToTrim);

    System.out.println("\nThe example string after .Trim() with removed whitespace:");
    System.out.println(trimString(stringToTrim));

}

//returns the string trimmed, removing the trailing whitespace
public static String trimString(String s){
    return s.trim();
    }
}
