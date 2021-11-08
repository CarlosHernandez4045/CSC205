package W3.GeometryInClass.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import W2.Geometry.src.Model.Cube;
import W2.Geometry.src.Model.Line;
import W2.Geometry.src.Model.Point;
import W2.Geometry.src.Model.Rectangle;
import W2.Geometry.src.Model.Shape;
import W2.Geometry.src.Model.Square;
import W2.Geometry.src.Model.Triangle;
import W3.GeometryInClass.src.Model.Callable;

public class App {
    public static void main(String[] args) throws Exception {

        List<Shape> shapesList = new ArrayList<Shape>();

        Rectangle rect = new Rectangle(20, 20);
        Rectangle rect2 = new Rectangle(20, 20);
        Rectangle rect3 = new Rectangle(20, 20);
        var sqr = new Square(20);
        var sqr2 = new Square(30);
        var sqr3 = new Square(40);
        var tri = new Triangle(20, 40);

        shapesList.add(rect);
        shapesList.add(rect2);
        shapesList.add(rect3);
        shapesList.add(sqr);
        shapesList.add(sqr2);
        shapesList.add(sqr3);
        shapesList.add(tri);


        for (var item : shapesList) {
            System.out.println(item.getClass().getName());
            if(item instanceof Callable){
                Callable caller = (Callable)item;
                System.out.print("Invoking Caller to Change the length from " + item.getArea() + " to ");
                invoke(caller, "Item");
            }
        }
    }

    public static void invoke(Callable callable, String message){
        if(message.startsWith("Increase")){
            callable.callMe(10);
        }
        else{
            callable.callMe(-5);
        }
    }

    public static void getUserChoiceAndStart(){
        Scanner scan = new Scanner(System.in);

        //Initial UI seen on canvas
        System.out.println("---------------------------------------");
        System.out.println("-----Please Select from the Shapes-----");
        System.out.println("---------------------------------------");
        System.out.println("1 - for Point");
        System.out.println("2 - for Line");
        System.out.println("3 - for Rectangle");
        System.out.println("4 - for Cube");
        System.out.println("5 - for Triangle");
        System.out.println("Enter the number for the Choice of the Geometrical Shape:");

        String userChoice = System.console().readLine().trim();

        //switch case that displays users choice outside the method so the method can be pure processing
        switch (userChoice) {
            case "1":
                System.out.println("Great Choice, you selected: Point\n");
                calculatePoint();
                scan.close();
                break;
            case "2":
                System.out.println("Great Choice, you selected: Line\n");
                calculateLine();
                scan.close();
                break;
            case "3":
                System.out.println("Great Choice, you selected: Rectangle\n");
                calculateRectangle();
                scan.close();
                break;
            case "4":
                System.out.println("Great Choice, you selected: Cube");
                calculateCube();
                scan.close();
                break;
            case "5":
                System.out.println("Great Choice, you selected: Triangle");
                calculateTriangle();
                scan.close();
                break;
            default:
                System.out.println("Invalid input! Please run the program and try again.");
                break;
        }


    }

    //methods to calculate the different shapes the user chose
    public static void calculatePoint(){

        Point userPoint = new Point();

        System.out.println("\nArea of the Point: " + userPoint.getArea() + " square inches, or no area!\n");
        System.out.println("Explanation: " + userPoint.getExplanation());
    }


    public static void calculateLine(){
        Line userLine = new Line();

        System.out.println("\nArea of the Line: " + userLine.getArea() + " square inches, or no area!\n");
        System.out.println("Explanation: " + userLine.getExplanation());
    }


    public static void calculateRectangle(){

        System.out.println("Enter the numeric value in inches for the width of the Rectangle:");
        double enteredWidth = Function.tryParseAndAbsoDouble(System.console().readLine());

        System.out.println("\nEnter the numeric value in inches for the length of the Rectangle:");
        double enteredLength = Function.tryParseAndAbsoDouble(System.console().readLine());

        if(enteredWidth == 0.0 | enteredLength == 0.0){
            System.out.println("\nInvalid input detected during calculation. Try again.\n");
            calculateRectangle();
            return;
        }

        Rectangle userRect = new Rectangle(enteredLength, enteredWidth);

        System.out.println("\nArea of the rectangle you have constructed: " + userRect.getArea() + " square inches.\n");
        System.out.println("Explanation: " + userRect.getExplanation());
    }


    public static void calculateCube(){
        System.out.println("Enter the numeric value in inches for the length of a side of the Square:");
        double enteredLength = Function.tryParseAndAbsoDouble(System.console().readLine());

        if(enteredLength == 0.0){
            System.out.println("\nInvalid input detected during calculation. Try again.\n");
            calculateCube();
            return;
        }

        Square userSquare = new Square(enteredLength);

        System.out.println("\nArea of the square you have constructed: " + userSquare.getArea() + " square inches.\n");
        System.out.println("Explanation: " + userSquare.getExplanation());
    }


    public static void calculateTriangle(){
        System.out.println("Enter the numeric value in inches for the base of the Triangle:");
        double enteredBase = Function.tryParseAndAbsoDouble(System.console().readLine());

        System.out.println("\nEnter the numeric value in inches for the height of the Triangle:");
        double enteredHeight = Function.tryParseAndAbsoDouble(System.console().readLine());

        if(enteredBase == 0.0 | enteredHeight == 0.0){
            System.out.println("\nInvalid input detected during calculation. Try again.\n");
            calculateTriangle();
            return;
        }

        Triangle userTriangle = new Triangle(enteredBase, enteredHeight);

        System.out.println("\nArea of the Triangle you have constructed: " + userTriangle.getArea() + " square inches.\n");
        System.out.println("Explanation: " + userTriangle.getExplanation());
    }
}
