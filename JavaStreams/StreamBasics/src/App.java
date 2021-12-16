import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

import Data.ExampleData;
import Exercises.BasicStreamsExercise01;
import Exercises.BasicStreamsExercise02;
import Exercises.BasicStreamsExercise03;
import Exercises.BasicStreamsExercise04;
import Exercises.BasicStreamsExercise05;
import Exercises.BasicStreamsExercise06;
import Model.Product;
import Model.Category;


public class App {
    private static List<Product> products = ExampleData.getProducts();
    public static void main(String[] args) throws Exception {
        testExercise01();
        testExercise02();
        testExercise03();
        testExercise04();
        testExercise05();
        testExercise06();
    }

    //Sorts the Product List into a sorted Utensil product list.
    static void testExercise01(){ 
        System.out.println("-----------EXERCISE 1-------------");


            List<Product> sortedUtensils = BasicStreamsExercise01.findUtensilsSortedByName(products);        
            System.out.println("Original Products:");
            products.forEach(p -> System.out.println("Category: " + p.getCategory() + " Name: " + p.getName()));
            System.out.println("\nSorted Utensil Products: ");
            sortedUtensils.forEach(p -> System.out.println("Category: " + p.getCategory() + " Name: " + p.getName()));
    }

    //gives the product names for the category passed, in this case we pass food
    static void testExercise02(){ 
        System.out.println("\n-----------EXERCISE 2-------------");

        List<String> productNamesFromCategory = BasicStreamsExercise02.getProductNamesForCategory(products, Category.FOOD);

        System.out.println("Product Names For Food Category: ");
        productNamesFromCategory.forEach(p -> System.out.println(p));
        
        Map<Category, List<Product>> productCategoryHashmap = Map.of(
            Category.FOOD, createProductList(Category.FOOD),
            Category.CLEANING, createProductList(Category.CLEANING),
            Category.UTENSILS, createProductList(Category.UTENSILS),
            Category.OFFICE, createProductList(Category.OFFICE)
        );

        Stream<Category> categoryStream = new ArrayList<Category>(Arrays.asList(
            Category.OFFICE,
            Category.CLEANING
        )).stream();

        List<String> productNamesFromCategoryStream = BasicStreamsExercise02.categoriesToProductNames(productCategoryHashmap, categoryStream);

        System.out.println("\nProducts returned from Category Stream:"); 
        productNamesFromCategoryStream.forEach(p -> System.out.println(p));
    }

    //Finds the product cheaper than the pricelimit passed. In this case we pass a price limit of 50 cents, which no product has.
    static void testExercise03(){ 
        System.out.println("\n-----------EXERCISE 3-------------");
        var cheaperItem = BasicStreamsExercise03.findProductCheaperThan(products, new BigDecimal("0.50"));

        if(cheaperItem.isPresent()){
            System.out.println("Cheaper Item Exists. Cheaper Item: "+ cheaperItem.get().getName());
        } else { 
            System.out.println("Cheaper Item has not been found.");
        }
    }

    //Finds the cheapest cleaning product. If there's no such product, it will return an empty optional.
    static void testExercise04(){
        System.out.println("\n-----------EXERCISE 4-------------");
        var cheapestCleaningProduct = BasicStreamsExercise04.findCheapestCleaning(products);
        
        if(cheapestCleaningProduct.isPresent()){
            System.out.println("Cheapest Cleaning Category Product Found. Product: "+ cheapestCleaningProduct.get().getName());
        }
        else { 
            System.out.println("There is no cheapest cleaning product in the list. The optional returned null.");
        }
    }

    //Evaluates whether or not all the office supplies are cheap. It then prints the conclusion to console.
    static void testExercise05(){ 
        System.out.println("\n-----------EXERCISE 5-------------");
        var officeSuppliesAreCheap = BasicStreamsExercise05.areAllOfficeProductsCheap(products, new BigDecimal("10.00"));

        if(officeSuppliesAreCheap) { 
            System.out.println("Office Supplies are cheap!");
        } else { 
            System.out.println("Office Supplies are NOT cheap!");
        }
    }

    //Formats the product list using Collectors.joining with the escape character \n, creating a formatted list in a single string
    static void testExercise06(){ 
        System.out.println("\n-----------EXERCISE 6-------------");
        System.out.println(BasicStreamsExercise06.formatProductList(products));
    }

    //small method made to make instantiating the hashmap we pass to exercise 2 easier. It takes in a category and returns a product List.
    private static List<Product> createProductList(Category category) { 
        return products
                .stream()
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
