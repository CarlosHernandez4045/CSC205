
package Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Product;
import static Model.Category.*;

public class ExampleData {

    private static final List<Product> PRODUCTS = new ArrayList<>(Arrays.asList(
            new Product(FOOD, "Oranges", new BigDecimal("1.65")),
            new Product(FOOD, "Gouda Cheese", new BigDecimal("6.79")),
            new Product(UTENSILS, "Plates", new BigDecimal("12.95")),
            new Product(CLEANING, "Detergent", new BigDecimal("3.79")),
            new Product(FOOD, "Soft Drink", new BigDecimal("1.99")),
            new Product(OFFICE, "Pencils", new BigDecimal("5.79")),
            new Product(FOOD, "Rice", new BigDecimal("2.99")),
            new Product(CLEANING, "Scourer", new BigDecimal("2.29")),
            new Product(FOOD, "Milk", new BigDecimal("1.39")),
            new Product(OFFICE, "Notebook", new BigDecimal("4.99")),
            new Product(FOOD, "Tea", new BigDecimal("4.29")),
            new Product(FOOD, "Tomato Sauce", new BigDecimal("1.39")),
            new Product(FOOD, "Peanut Butter", new BigDecimal("2.39")),
            new Product(FOOD, "Red Bell Pepper", new BigDecimal("0.99")),
            new Product(UTENSILS, "Spoons", new BigDecimal("14.95")),
            new Product(OFFICE, "Adhesive Tape", new BigDecimal("5.39")),
            new Product(CLEANING, "Dish Brush", new BigDecimal("3.49")),
            new Product(UTENSILS, "Knives", new BigDecimal("9.95")),
            new Product(FOOD, "Brown Bread", new BigDecimal("3.99")),
            new Product(FOOD, "Potatoes", new BigDecimal("1.59")),
            new Product(CLEANING, "Dishcloth", new BigDecimal("2.59")),
            new Product(FOOD, "Apples", new BigDecimal("1.29")),
            new Product(OFFICE, "Ballpoint pens", new BigDecimal("6.79")),
            new Product(FOOD, "Spaghetti", new BigDecimal("2.79")),
            new Product(UTENSILS, "Forks", new BigDecimal("14.95")),
            new Product(UTENSILS, "Paper towel", new BigDecimal("3.69")),
            new Product(FOOD, "Coffee", new BigDecimal("7.49")),
            new Product(OFFICE, "Highlighter", new BigDecimal("2.29")),
            new Product(FOOD, "Orange Juice", new BigDecimal("3.49")),
            new Product(FOOD, "Spring Water", new BigDecimal("0.99"))));

    public static List<Product> getProducts() {
        return new ArrayList<>(PRODUCTS);
    }
}