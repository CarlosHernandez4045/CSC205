package W3.GeometryInClass.src.Model;

public class Triangle extends Shape {
    
    private double base;
    private double height;

    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        explanation = "We multiply base by height, then divide by 2 in order to get area for a rectangle. \n" +
        "In this case multiplying the base " + this.base + " and height " + this.height + " then dividing by 2 got us " + getArea() + ".";
    }

    public double getArea(){ 
        return (this.height * this.base) / 2; 
    }

    public double getBase(){
        return this.base;
    }

    public double getHeight(){
        return this.height;
    }
}
