package W4.StringsAndThings.src;

public class StringConcatExercise {
    public static void main(String[] args) {
        //this string is what we'll be using to concatenate or add on to
        String concatExample = "beginning";

        //showing the functionality the .concat() method
        System.out.println("String before string.concat():");
        System.out.println("\n" + concatExample);

        System.out.println("String after string.concat():");
        System.out.println("\n" + concatEndToString(concatExample));
    }

    //this function adds the 'End' to the end of whatever string passed to it
    public static String concatEndToString(String s){
        return s.concat("End");
    }
}
