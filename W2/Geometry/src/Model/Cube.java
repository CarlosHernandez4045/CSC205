package W2.Geometry.src.Model;

public class Cube extends Shape{
    
    private double edge;

    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Cube(double edge) {

        this.edge = edge;
        explanation = "We multiply 6 by the edge squared in order to get area for a cube. \n" +
        "In this case multiplying 6 by " + this.edge*this.edge + " got us " + getArea() + ".";
    }

    @Override
    public double getArea() { 
        return 6 * (edge*edge); 
    }


}
