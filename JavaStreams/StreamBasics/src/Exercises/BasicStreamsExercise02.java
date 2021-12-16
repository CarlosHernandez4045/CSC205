package Exercises;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Data.ExampleData;

import java.util.Map;
import java.util.Locale.Category;

import Model.Product;



public class BasicStreamsExercise02 {

    /**
     * Exercise 2a: In a list of products, find the products that are in a given category and return their names.
     *
     * @param products A list of products.
     * @param food A product category.
     * @return A List containing the names of the products in the given category.
     */
    public static List<String> getProductNamesForCategory(List<Product> products, Model.Category food) {
        // TODO: Add three stream operation methods:
        //
        // 1) Find the products that are in the given category
        // 2) Transform each product to its name
        // 3) Collect the result into a List
        //
        // Hint: Use the API documentation of interface java.util.stream.Stream.

//        return products.stream()...;

        return products
            .stream()
            .filter(p -> p.getCategory().equals(food))
            .map(p -> p.getName())
            .collect(Collectors.toList());
    }

    /**
     * Exercise 2b: Given a map that contains products grouped by category and a stream of categories, get the names of the products
     * for each category in that stream and return all the products in a list.
     *
     * @param productCategoryHashmap A map containing products grouped by category.
     * @param categoryStream         A stream of product categories.
     * @return A list containing the names of products in each of the categories in the given stream.
     */
    public static List<String> categoriesToProductNames(Map<Model.Category, List<Product>> productCategoryHashmap, Stream<Model.Category> categoryStream) {
        // TODO: Start with the stream of categories.
        // For each category in that stream, get the products.
        // Then transform them to product names.
        // Finally, collect the results in a list.
        //
        // Hint: You'll need to use different mapping methods.

//        return categories...;
        return categoryStream
                        .map(category -> "Category: " + category + "\nProducts: " + productCategoryHashmap.get(category).stream().map(p -> p.getName()).collect(Collectors.joining(", ")) + "\n")
                        .collect(Collectors.toList());
    }
}
