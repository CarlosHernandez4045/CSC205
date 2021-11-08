package W3.GeometryInClass.src;

public class Function {

    //sees if a string is parseable, if it is, it returns the absolute value. 
    //Since 0.0 is invalid for our uses of calculating areas, we return that if unsuccessful so we can act on it later.
    public static Double tryParseAndAbsoDouble(String val){
        try {

            return Math.abs(Double.parseDouble(val));

        } catch (NumberFormatException e) {

            return 0.0;
        }
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
		System.out.flush();  
    }

}
