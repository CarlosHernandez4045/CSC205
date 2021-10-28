package W2.UMLGuessingGame.src;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Game {

    //properties
    private String name = "Guessing Game";
    private int guessNo;
    private int maxAttempts;
    private int currentUserTries;

    //constructor
    public Game(int maxAttempts){
        this.maxAttempts = validateAttempts(maxAttempts);
    }

    //methods
    private int validateAttempts(int maxAttempts) { 
        //defaults to 3 if the maxAttempts are unreasonable.
        return maxAttempts > 0 ? maxAttempts : 3; 
    }

    private Boolean phoneNoIsValid(String phoneNo){
        String phoneNoPattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

        return Pattern.matches(phoneNoPattern, phoneNo) ? true : false;
    }

    //Displays the latest results from all games played
    private void Result(Boolean wonGame, Player p){
        System.out.println("Game has ended.");
        if(wonGame){
            System.out.println("You won! The number the computer generated was: " + this.guessNo);
        } else {
            System.out.println("You lost. The number the computer generated was: " + this.guessNo);
        }
        System.out.println("This game was ended in "+ this.currentUserTries + " turn(s) by " + p.getFirstName() + " " + p.getLastName() +".");
        System.out.println("------------------------------------------");
    }

    public void Play(){
        Random rand = new Random();
        this.guessNo = rand.nextInt(10) + 1;
        this.currentUserTries = 0;

        
        Scanner scan = new Scanner(System.in);

        //get user details
        var player = getPlayerDetails(scan);

        System.out.println("------------------------------------------");
        System.out.println("Game has started. A random number has been generated between 1-10.\n" +
        "You have " + this.maxAttempts + " tries to get it right.");

        userGuessSequence(scan, player);

        scan.close();

    }

    private void userGuessSequence(Scanner scan, Player p){
        this.currentUserTries += 1;

        System.out.println("Input a number: ");
        var userNum = scan.nextLine();
        
        
        if(Integer.valueOf(userNum) == this.guessNo){
            Result(true, p);
        } else {
            if(currentUserTries < maxAttempts){ 
                userGuessSequence(scan, p);
            } else {
                Result(false, p);
            }
        }
    }

    public Player getPlayerDetails(Scanner scan){

        System.out.println("What's your first name?");
        var firstName = scan.nextLine();
        System.out.println("What's your last name?");
        var lastName = scan.nextLine();
        System.out.println("What's your phone number?");

        var phoneNo =  scan.nextLine();

        if(!phoneNoIsValid(phoneNo)){
            System.out.println("\nInvalid Phone Number Format!");
            System.out.println("Please try again.");
            getPlayerDetails(scan);
        }

        return new Player(firstName, lastName, phoneNo);
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getGuessNo(){
        return this.guessNo;
    }

    public int getMaxAttempts(){
        return this.maxAttempts;
    }
}
