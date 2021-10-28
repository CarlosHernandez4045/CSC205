package W2.Geometry.src.Model;

public abstract class Dazzle {

    private String name;
    private int weight;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public Dazzle() {
        //constructor
    }
}
