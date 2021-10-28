package W2.UMLGuessingGame.src;

public class ResultsHandler {
    
    private static Player player;
    private static int currentUserTries;
    private static int maxAttempts;
    private static Boolean wonGame;
    private static int guessNo;
    

    public ResultsHandler(Player p, int currentTries, int maxTries, Boolean wonTheGame, int guessNum){
        player = p;
        currentUserTries = currentTries;
        maxAttempts = maxTries;
        wonGame = wonTheGame;
        guessNo = guessNum;
    }

    public static String Results(){
        return "Results of the latest played game:" +
        "\nPlayed by: "+ player.getFirstName() + " " + player.getLastName() + 
        "\nUser Tries: "+currentUserTries + 
        "\nMaximum Attempts:" + maxAttempts +
        "\nWon game? " + wonGame +
        "\nThe number to guess was: "+ guessNo;
    }
}
