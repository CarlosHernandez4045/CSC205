package W3.GeometryInClass.src.Model;

public class Point extends Shape {

    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Point(){
        explanation = "In geometry, a point models an exact location, but has no length, width or thickness." + 
        " Therefore, it does not occupy space, or have an area!";
    }

    public double getArea() {
        return 0;
    }
    
}
