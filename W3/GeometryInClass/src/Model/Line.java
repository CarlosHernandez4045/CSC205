package W3.GeometryInClass.src.Model;

public class Line extends Shape {

    //we redefine the protected variable explanation in the constructor 
    //This is so when we call getExplanation(), we get the explanation we want instead of the superclass' explanation variable.
    public Line(){
        explanation = "Since lines aren't shapes, they have no area.\n " +
         "We use lines to make up shapes. \nThe drawings of lines or thin rectangles that take up space on paper are different from the actual concept of a line in Geometry.";
    }

    public double getArea() {
        return 0;
    }
    
}
