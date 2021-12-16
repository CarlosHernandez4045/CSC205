import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class EnterTheCollector {

    public static void main(String[] args) {
        Product door = new Product(1, "Wooden Door", 50);
        Product floorPanel = new Product(2, "Floor Panel", 20);
        Product window = new Product(3, "Glass Window", 10);
        Product computer = new Product(4,"Computer", 50);

        List<Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.add(computer);

        for (Product product : products) {
            System.out.println(product);
        }

        Map<String, Long> lightProducts = products.stream()
        .filter(product -> product.getWeight() < 30)
        .sorted(comparingInt(Product::getWeight))
        .collect(groupingBy(Product::getName, counting()));

        System.out.println(lightProducts);

        for (var mappedProduct : lightProducts.entrySet()) {
            System.out.println(mappedProduct.getKey()+ ":" + mappedProduct.getValue());
        }

        Map<String, Long> lightProducts2 = products
            .stream()
            .filter(product -> product.getWeight() < 30)
            .map(product -> product.setWeight(2))
            .collect(groupingBy(Product::getName, counting()));


        products
            .stream()                                           // beginning
            .filter(p -> p.getName().startsWith("W"))           //manipulation
            .sorted(comparingInt(Product::getWeight))
            .collect(groupingBy(Product::getName, counting())); // end point
        
        var resultArray = products.stream().map(p -> new Product(p.getID(), p.getName(), p.getWeight() * 10)).toArray();
        var resultMap = Arrays.asList(resultArray);
        
        System.out.println("----------RESULT MAP---------");
        for (var mappedProduct : resultMap) {
            System.out.println(mappedProduct);
        }
        
        System.out.println("----------ORIGINAL PRODUCTS---------");
        for (Product product : products) {
            System.out.println(product);
        }        
    }
}

