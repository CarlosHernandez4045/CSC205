package W4.StringsAndThings.src;

public class StringSplitExercise {
    public static void main(String[] args) throws Exception {
        //the string we'll split based on the commas in it
        String stringToSplit = "Hello, this is a string, and we're splitting it!";

        //demonstrates the functionality of .split() to the console
        System.out.println("Example String:\n" + stringToSplit);
        System.out.println("\nSplitting it through commas:");
        for(var substring : splitThroughCommas(stringToSplit)){
            System.out.println(substring);
        }

        System.out.println("\nSplitting it through whitespace:");
        for(var substring : splitThroughWhitespace(stringToSplit)){
            System.out.println(substring);
        }


    }

    //this method returns an array of string based on the string passed to it, splitting it on commas
    public static String[] splitThroughCommas(String s) {
        return s.split(",");
    }
    
    //this method returns an array of string based on the string passed to it, splitting it on whitespace
    public static String[] splitThroughWhitespace(String s) {
        return s.split("\\s+");
    }
}
