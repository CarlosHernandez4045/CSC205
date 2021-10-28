package W2.Geometry.src;

import java.util.ArrayList;
import java.util.List;

import W2.Geometry.src.Model.Rectangle;
import W2.Geometry.src.Model.Shape;
import W2.Geometry.src.Model.Square;
import W2.Geometry.src.Model.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Shape> shapesList = new ArrayList<Shape>();

        var rect = new Rectangle(20, 30);
        var sqr = new Square(20);
        var sqr1 = new Square(30);
        var sqr2 = new Square(440);
        var rect1 = new Rectangle(200, 60);
        var rect2 = new Rectangle(20.6, 300);
        var rect3 = new Rectangle(201, 301);
        var tri = new Triangle(201, 301);


        shapesList.add(rect);
        shapesList.add(sqr);
        shapesList.add(sqr1);
        shapesList.add(sqr2);
        shapesList.add(rect1);
        shapesList.add(rect2);
        shapesList.add(rect3);
        shapesList.add(tri);
        for (var shape : shapesList) { 
            var area = shape.area();

            System.out.println(shape.getClass().getName());
            System.out.println(shape instanceof Square);
            System.out.println(area);
        }

        var rectArea = rect.area();

    }
}
