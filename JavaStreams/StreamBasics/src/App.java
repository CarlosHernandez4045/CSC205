import java.util.List;

import Data.ExampleData;
import Exercises.BasicStreamsExercise01;
import Exercises.BasicStreamsExercise02;
import Model.Product;
import Model.Category;

public class App {
    public static void main(String[] args) throws Exception {
            List<Product> products = ExampleData.getProducts();
            List<Product> sortedUtensils = BasicStreamsExercise01.findUtensilsSortedByName(products);
            List<String> productNamesFromCategory = BasicStreamsExercise02.getProductNamesForCategory(products, Category.FOOD);

            
            // System.out.println("----------ORIGINAL PRODUCTS-------------");
            // products.forEach(p -> System.out.println("Category: " + p.getCategory() + " Name: " + p.getName()));
            // System.out.println("----------SORTED UTENSIL PRODUCTS-------------");
            // sortedUtensils.forEach(p -> System.out.println("Category: " + p.getCategory() + " Name: " + p.getName()));
            // System.out.println("----------PRODUCT NAMES FOR CATEGORY: FOOD-------------");
            // productNamesFromCategory.forEach(p -> System.out.println(p));

            

    }
}
