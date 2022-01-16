// CLASS: CSC205
// AUTHOR: Carlos Hernandez
// PURPOSE: This code is an implementation of the sample code from ref:https://www.swtestacademy.com/java-streams-basics-with-examples/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//THANK YOU FOR THE GREAT SEMESTER AND EVERYTHING YOU DID FOR THE CLASS! I appreciate all the help you've extended over the last couple of courses!!

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------First Sample Demo Code---------");
        testExample();
        System.out.println("\n--------Second Sample Demo Code---------");
        testExampleWithDebugLines();
        System.out.println("\n--------Third Sample Demo Code---------");
        testExampleWithoutTerminalOperation();

        /*NOTICE: The below sample code is designed to throw an exception because we can't reuse streams once they we close them. 
        Uncomment the below to test this part of the sample code! */

        // System.out.println("--------Fail Sample Demo Code---------");
        // testFailExample();
    }

    //The sample code uses streams to filter the ood numbers, limit execution to 4, and then transform each element by multiplying by 2, then printing results
    private static void testExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
            .filter(number -> number % 2 == 1) //uses stream filter to filter odd numbers
            .limit(4) //limits the stream to 4 elements
            .map(number -> number * 2) //maps each element to itself multiplied by 2
            .forEach(System.out::println); //prints the results
    }

    //This sample code does the same operations while printing statements to the console to better see the execution process
    private static void testExampleWithDebugLines(){
        System.out.println("Stream operations are starting!");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
            .filter(number -> {
                System.out.println("Processing filter operation for number: " + number);
                return number % 2 == 1;
            }) //uses stream filter to filter odd numbers
            .limit(4) //limits the stream to 4 elements
            .map(number -> {
                System.out.println("Processing map operation for number: " + number);
                return number * 2;
            }) //maps each element to itself multiplied by 2
            .forEach(number -> System.out.println("Result of stream: " + number)); //prints the results

        System.out.println("Stream operations finished!");
    }

    //This sample code comments out the terminal operation .forEach in the stream to showhow necessary they are
    private static void testExampleWithoutTerminalOperation(){
        System.out.println("Stream operations are starting!");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
            .filter(number -> {
                System.out.println("Processing filter operation for number: " + number);
                return number % 2 == 1;
            }) //uses stream filter to filter odd numbers
            .limit(4) //limits the stream to 4 elements
            .map(number -> {
                System.out.println("Processing map operation for number: " + number);
                return number * 2;
            }); //maps each element to itself multiplied by 2
            // .forEach(number -> System.out.println("Result of stream: " + number)); //prints the results

        System.out.println("Stream operations finished!");
    }

    //This sample code purposefully fails in order to show how you can't chain multiple terminal operations as the stream is closed and results in an Exception.
    private static void testFailExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> numberStream = numbers.stream()
            .filter(number -> number % 2 == 1) //uses stream filter to filter odd numbers
            .map(number -> number * 2);

        numberStream.forEach(System.out::println);
        numberStream.forEach(System.out::println); //Throws exception as we can't reuse stream after it is closed.

    }
}
