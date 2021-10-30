package W2.Geometry.src.Model;

public class Rectangle extends Shape {
    
    private double length;
    private double width;

    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        explanation = "We multiply length times width in order to get area for a rectangle. \n" +
     "In this case multiplying length " + this.length + " by width " + this.width + " got us " + getArea() + ".";
    }

    public double getArea(){ return this.width * this.length; }

}
