package LamdaDemo.LMD1.src;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    private static final List<Product> PRODUCTS = Arrays.asList(
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Gouda Cheese", new BigDecimal("1.65")),
        new Product(Category.UTENSILS, "Plates", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65")),
        new Product(Category.FOOD, "Oranges", new BigDecimal("1.65"))
    );

    public static List<Product> getProducts() { 
        return new ArrayList<>(PRODUCTS);
    }
}
