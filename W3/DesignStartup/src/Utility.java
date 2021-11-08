package W3.DesignStartup.src;

public class Utility {
  
    // Function to perform left padding
    public static String
    leftPadding(String input, char ch, int L)
    {
  
        String result
            = String
  
                  // First left pad the string
                  // with space up to length L
                  .format("%" + L + "s", input)
  
                  // Then replace all the spaces
                  // with the given character ch
                  .replace(' ', ch);
  
        // Return the resultant string
        return result;
    }
  
    // Function to perform right padding
    public static String
    rightPadding(String input, char ch, int L)
    {
  
        String result
            = String
  
                  // First right pad the string
                  // with space up to length L
                  .format("%" + (-L) + "s", input)
  
                  // Then replace all the spaces
                  // with the given character ch
                  .replace(' ', ch);
  
        // Return the resultant string
        return result;
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        String str = "Class of 2021 CIS 205";
        char ch = '-';
        int L = 20;
  
        System.out.println(
            leftPadding(str, ch, L));
        System.out.println(
            rightPadding(str, ch, L));
    }
}