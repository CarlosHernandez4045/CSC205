package W2.Geometry.src.Model;

public class Square extends Dazzle implements Shape {
    private double length;

    public Square(double length) {
        super();
        this.length = length;
    }

    @Override
    public double area() { 
        return this.length * this.length; 
    }

    @Override
    public double shade(int color) {
        return 0;
    }

    @Override
    public String opacity(int opacity) {
        // TODO Auto-generated method stub
        return null;
    }
}
