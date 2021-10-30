package W2.UMLGuessingGame.src;

import java.util.regex.Pattern;

public class Function {

    public static Boolean phoneNoIsValid(String phoneNo){
        String phoneNoPattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

        return Pattern.matches(phoneNoPattern, phoneNo) ? true : false;
    }

    public static Integer evalAndParseInt(String s){
        try {
            return (Integer.parseInt(s) < 0 | Integer.parseInt(s) > 10) ? null : Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
