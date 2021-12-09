package LamdaDemo.LMD1.src;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello lambda!");

        List<Product> products = SampleData.getProducts();

        var results = products.stream().map(p -> p.getName()+ ";" + p.getPrice());
        
        for (String product : results.collect(Collectors.toList())) {
            System.out.println(product);
        }

        // products.sort(new Comparator<Product>() {
        //    @Override
        //    public int compare(Product p1, Product p2) {
        //     return p1.getPrice().compareTo(p2.getPrice());
        //    } 
        // });
    }
}
