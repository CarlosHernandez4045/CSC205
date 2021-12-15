// AUTHOR: Carlos Hernandez
// CLASS: CSC205
/* PURPOSE: This program will use the Movie.java object from past programming assignments to demonstrate the power of lambdas
  and functional programming. */

import Exercises.LambdaMovie01;
import Exercises.LambdaMovie02;
import Exercises.LambdaMovie03;
import Exercises.LambdaMovie04;
import Exercises.LambdaMovie05;
import Exercises.LambdaMovie06;
import Exercises.LambdaMovie07;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------LAMBDA 1 EXERCISE---------");
        LambdaMovie01.test();

        System.out.println("\n---------LAMBDA 2 EXERCISE---------");
        LambdaMovie02.test();

        System.out.println("\n---------LAMBDA 3 EXERCISE---------");
        LambdaMovie03.test();

        System.out.println("\n---------LAMBDA 4 EXERCISE---------");
        LambdaMovie04.test();

        System.out.println("\n---------LAMBDA 5 EXERCISE---------");
        LambdaMovie05.test();

        System.out.println("\n---------LAMBDA 6 EXERCISE---------");
        LambdaMovie06.test();

        System.out.println("\n---------LAMBDA 7 EXERCISE---------");
        LambdaMovie07.test();
    }
}
