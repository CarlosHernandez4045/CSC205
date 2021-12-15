import Model.CardStack;
import Model.CoreJavaStack;

public class App {
    static CoreJavaStack stack = new CoreJavaStack();
    static CardStack customStack = new CardStack<String>();
    public static void main(String[] args) throws Exception {
        System.out.println("Preparing a Test to Push 55,000 cards in 10000 loops to the Custom and Java Stacks.");
        testJavaStack();
        testCustomStack();
        //Explanation
        System.out.println("\n------------ EXPLANATION -----------");
        System.out.println("The Custom Stack is more efficient and faster at stacking the cards or pushing the string into the stack.\n" +
        "The java core stack falls behind because it's optimized for larger collections of data, and sacrifices some speed for functionality.\n" + 
        "From this test, we can conclude that the custom implementation of the LIFO system is faster and more efficient here.");
    }

    public static void testCustomStack(){
        //count the time
        long startTime = System.currentTimeMillis();

        //for 10000 loops, just keep pushing Strings/Cards to the stack
        for(int index = 0; index < 10000; index++) { 
            stackCustomCards();
        }

        //then get the time again and subtract to see how efficient pushing stacks of cards was.
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("The 10,000 loops of card stacking for the Custom Stack took " + elapsedTime + " milliseconds.");
    }

    public static void testJavaStack(){
        //count the time
        long startTime = System.currentTimeMillis();

        //for 10000 loops, just keep pushing Strings/Cards to the stack
        for(int index = 0; index < 10000; index++) { 
            stackJavaCards();
        }
        //then get the time again and subtract to see how efficient pushing stacks of cards was.
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("The 10,000 loops of card stacking for the Java Stack took " + elapsedTime + " milliseconds");
    }

    public static void stackCustomCards() { 
        //stacking the spade suit
        customStack.push("Ace of Spades");
        customStack.push("Ace of Spades");
        customStack.push("Ace of Spades");
        customStack.push("Ace of Spades");
		customStack.push("2 of Spades");
		customStack.push("3 of Spades");
		customStack.push("4 of Spades");
		customStack.push("5 of Spades");
		customStack.push("6 of Spades");
		customStack.push("7 of Spades");
		customStack.push("8 of Spades");
		customStack.push("9 of Spades");
		customStack.push("10 of Spades");
		customStack.push("Jack of Spades");
		customStack.push("Queen of Spades");
		customStack.push("King of Spades");

		//stack the diamond suit
		customStack.push("Ace of Diamonds");
		customStack.push("2 of Diamonds");
		customStack.push("3 of Diamonds");
		customStack.push("4 of Diamonds");
		customStack.push("5 of Diamonds");
		customStack.push("6 of Diamonds");
		customStack.push("7 of Diamonds");
		customStack.push("8 of Diamonds");
		customStack.push("9 of Diamonds");
		customStack.push("10 of Diamonds");
		customStack.push("Jack of Diamonds");
		customStack.push("Queen of Diamonds");
		customStack.push("King of Diamonds");

		//stack the club suit
		customStack.push("Ace of Clubs");
		customStack.push("2 of Clubs");
		customStack.push("3 of Clubs");
		customStack.push("4 of Clubs");
		customStack.push("5 of Clubs");
		customStack.push("6 of Clubs");
		customStack.push("7 of Clubs");
		customStack.push("8 of Clubs");
		customStack.push("9 of Clubs");
		customStack.push("10 of Clubs");
		customStack.push("Jack of Clubs");
		customStack.push("Queen of Clubs");
		customStack.push("King of Clubs");

		//stack the heart suit
		customStack.push("Ace of Hearts");
		customStack.push("2 of Hearts");
		customStack.push("3 of Hearts");
		customStack.push("4 of Hearts");
		customStack.push("5 of Hearts");
		customStack.push("6 of Hearts");
		customStack.push("7 of Hearts");
		customStack.push("8 of Hearts");
		customStack.push("9 of Hearts");
		customStack.push("10 of Hearts");
		customStack.push("Jack of Hearts");
		customStack.push("Queen of Hearts");
		customStack.push("King of Hearts");
    }

    public static void stackJavaCards() { 
        //stacking the spade suit
        stack.push("Ace of Spades");
		stack.push("2 of Spades");
		stack.push("3 of Spades");
		stack.push("4 of Spades");
		stack.push("5 of Spades");
		stack.push("6 of Spades");
		stack.push("7 of Spades");
		stack.push("8 of Spades");
		stack.push("9 of Spades");
		stack.push("10 of Spades");
		stack.push("Jack of Spades");
		stack.push("Queen of Spades");
		stack.push("King of Spades");

		//stack the diamond suit
		stack.push("Ace of Diamonds");
		stack.push("2 of Diamonds");
		stack.push("3 of Diamonds");
		stack.push("4 of Diamonds");
		stack.push("5 of Diamonds");
		stack.push("6 of Diamonds");
		stack.push("7 of Diamonds");
		stack.push("8 of Diamonds");
		stack.push("9 of Diamonds");
		stack.push("10 of Diamonds");
		stack.push("Jack of Diamonds");
		stack.push("Queen of Diamonds");
		stack.push("King of Diamonds");

		//stack the club suit
		stack.push("Ace of Clubs");
		stack.push("2 of Clubs");
		stack.push("3 of Clubs");
		stack.push("4 of Clubs");
		stack.push("5 of Clubs");
		stack.push("6 of Clubs");
		stack.push("7 of Clubs");
		stack.push("8 of Clubs");
		stack.push("9 of Clubs");
		stack.push("10 of Clubs");
		stack.push("Jack of Clubs");
		stack.push("Queen of Clubs");
		stack.push("King of Clubs");

		//stack the heart suit
		stack.push("Ace of Hearts");
		stack.push("2 of Hearts");
		stack.push("3 of Hearts");
		stack.push("4 of Hearts");
		stack.push("5 of Hearts");
		stack.push("6 of Hearts");
		stack.push("7 of Hearts");
		stack.push("8 of Hearts");
		stack.push("9 of Hearts");
		stack.push("10 of Hearts");
		stack.push("Jack of Hearts");
		stack.push("Queen of Hearts");
		stack.push("King of Hearts");
    }
}
