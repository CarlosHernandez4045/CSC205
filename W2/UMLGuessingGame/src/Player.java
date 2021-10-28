package W2.UMLGuessingGame.src;

public class Player {
    
    private String firstName;
    private String lastName;
    private String phoneNo;
    
    private static Player latestPlayer;

    //constructor
    public Player(String firstName, String lastName, String phoneNo){

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;

        latestPlayer = this;
    }

    //getters
    public static Player getLatestPlayer(){
        return latestPlayer;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
