package W3.GeometryInClass.src.Model;

public abstract class Shape {

    //makes the shapes iterable if need be later on, and also makes every child class inherit it's own getExplanation() method, even without implementing it
    protected String explanation;
    
    public abstract double getArea();

    public String getExplanation(){
        return explanation;
    };
}
