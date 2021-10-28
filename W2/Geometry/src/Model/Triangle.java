package W2.Geometry.src.Model;

public class Triangle extends Dazzle implements Shape {
    
    private double length;
    private double width;

    public Triangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){ return this.width * this.length; }

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
