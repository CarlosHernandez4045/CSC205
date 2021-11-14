package W4.StringsAndThings.src;

public class StringToCharArrayExercise {
    
    public static void main(String[] args) {
        //we'll be using this string and converting it to an array of characters
        String stringToConvertToChar = "Computer Science 205 Class";

        //Displaying the functionality to console
        System.out.println("String Example:\n" + stringToConvertToChar + "\n");

        char[] stringConvertedToCharArray = convertStringToCharArray(stringToConvertToChar);

        for(char character : stringConvertedToCharArray){
            System.out.println(character);
        }
    }

    //this function takes any string and returns an array of characters in that string
    public static char[]  convertStringToCharArray(String s){
        return s.toCharArray();
    }
}
