package W4.StringsAndThings.src;

public class StringCharAtExercise {

    public static void main(String[] args) {
        //we'll index this string to get the character at specific indexes using .CharAt()
        String stringToSeeChar = "Programming";

        //displays the functionality of .charAt() to console
        System.out.println("Example String:");
        System.out.println("\n" + stringToSeeChar);

        System.out.println("The third character for the example string:");
        System.out.println("\n" + getThirdCharacterOfString(stringToSeeChar));
    }

    //this function returns the third character of a string because we index 2 through .CharAt()
    public static char getThirdCharacterOfString(String s){
        return s.charAt(2);
    }
}

