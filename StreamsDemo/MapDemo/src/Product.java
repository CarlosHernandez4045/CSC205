public class Product {

    private String name;
    private int weight; 
    private int id;

    public Product(int id, String name, int weight) {
        this.weight = weight;
        this.name = name;
        this.id = id;
    }

    public int getWeight(){ 
        return this.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product setWeight(int factor) {
        this.weight = this.weight * factor;
        return this;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product {cost=" + id + ", name=" + name + ", weight=" + weight + "}";
    }
    
}
