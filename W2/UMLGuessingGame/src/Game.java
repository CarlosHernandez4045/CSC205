package W2.UMLGuessingGame.src;

import java.util.Random;
import java.util.Scanner;

public class Game {

    //properties
    private String name = "Guessing Game";
    private int guessNo;
    private int maxAttempts;
    private int currentUserTries;

    //constructor
    public Game(int maxAttempts){
        //defaults to 3 if the maxAttempts are unreasonable.
        this.maxAttempts = maxAttempts > 0 ? maxAttempts : 3;
    }

    //methods

    //Displays the results based on if the user won or not
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

    //Main play sequence
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

    //method that proccesses user guesses. Uses recursion to keep calling itself until user wins or loses.
    private void userGuessSequence(Scanner scan, Player p){

        System.out.println("Input a number: ");
        var userNum = scan.nextLine();
        
        //checks if input is parseable AND if it's valid for our game, which means it isnt below 0 or above 10
        if(Function.evalAndParseInt(userNum) == null){
            System.out.println("Invalid input! Inputs should be a whole number that is between 1 and 10.");
            System.out.println("Please try again.");
            userGuessSequence(scan, p);
            return;
        }
        
        this.currentUserTries += 1;

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

    //gets the necessary details from the player in order to instantiate a player object
    private Player getPlayerDetails(Scanner scan){

        System.out.println("What's your first name?");
        var firstName = scan.nextLine();

        System.out.println("What's your last name?");
        var lastName = scan.nextLine();

        if(firstName.matches(".*\\d.*") | lastName.matches(".*\\d.*")){
            System.out.println("\nNo numbers in names!\n");
            System.out.println("Please try again.");
            return getPlayerDetails(scan);
        }

        System.out.println("What's your phone number?");

        var phoneNo = scan.nextLine();

        if(!Function.phoneNoIsValid(phoneNo)){
            System.out.println("\nInvalid Phone Number Format!\n");
            System.out.println("Please try again.");
            return getPlayerDetails(scan);
        }

        return new Player(firstName, lastName, phoneNo);
    }
}
