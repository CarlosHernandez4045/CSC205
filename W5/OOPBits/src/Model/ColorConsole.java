//reference https://www.codegrepper.com/code-examples/java/how+to+print+color+text+in+java+console + CSC205 Startup Code

package W5.OOPBits.src.Model;

public class ColorConsole {
    // Declaring ANSI_RESET so that we can reset the color
	private static final String ANSI_RESET = "\u001B[0m";
	

	public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";

    private static String foreGroundColor = ColorConsole.TEXT_BLUE;
	
	
	public static void setForeGroundColor(String foreGroundColor) {
		ColorConsole.foreGroundColor = foreGroundColor;
	}

    public static void println(Object val){
		System.out.println(ColorConsole.foreGroundColor
		+ val
		+ ANSI_RESET);
	}

    public static void clearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name");//Check OS system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void printBanner(String banner) {
		ColorConsole.clearConsole();
		ColorConsole.setForeGroundColor(ColorConsole.TEXT_YELLOW);
	
		banner = leftPadding(banner, ' ', 40);
		banner = rightPadding(banner, ' ', 40);

		String separator = "*";
		separator = leftPadding(separator, '*', banner.length()+ 35);
		separator = rightPadding(separator, '*',banner.length()+ 35);
		ColorConsole.setForeGroundColor(ColorConsole.TEXT_YELLOW);
		ColorConsole.println(separator);
		ColorConsole.setForeGroundColor(ColorConsole.TEXT_BLUE);
		ColorConsole.println(banner);
		ColorConsole.setForeGroundColor(ColorConsole.TEXT_YELLOW);
		ColorConsole.println(separator);
	}

    //method for left padding
    private static String leftPadding(String input, char ch, int L)
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

    //method for right padding 
    public static String rightPadding(String input, char ch, int L) {

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
}
