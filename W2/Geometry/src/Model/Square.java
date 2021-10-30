package W2.Geometry.src.Model;

public class Square extends Shape {

    private double length;


    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Square(double length) {

        this.length = length;
        explanation = "The length of a side squared gets us the area of a square. \n" +
        "In this case multiplying " + this.length + " by itself got us " + getArea() + ".";
    }
    
    public double getArea() { 
        return this.length * this.length; 
    }


    
}
