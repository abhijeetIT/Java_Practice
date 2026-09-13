package src.main.java.JavaBasic.StreamApi_Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;

public class DataAnalysis {
    static class Product {
        String name;
        String category;
        double price;
        int rating;

        public Product(String name, String category, double price, int rating) {
            this.name = name;
            this.category = category;
            this.price = price;
            this.rating = rating;
        }

        public String getName() { return name; }

        public String getCategory() { return category;}

        public double getPrice() {return price; }

        public int getRating() {return rating;}

        public void setName(String name) { this.name = name;}

        public void setCategory(String category) { this.category = category;}

        public void setPrice(double price) {this.price = price;}

        public void setRating(int rating) { this.rating = rating;}
    }
    public static void main(String[] args) {
        List<Product> Products = Arrays.asList(new Product("Trasmee", "Shampoo", 2D, 4),
                                               new Product("Clinic Plus", "Shampoo", 1D, 5),
                                               new Product("LifeBoy", "Soap", 10.0, 3),
                                               new Product("Head & Sholder", "Shampoo", 3.00, 4),
                                               new Product("KFC", "Fast Food", 200.00, 4),
                                               new Product("Kurkure", "Fast Food", 10, 5),
                                               new Product("Motorolla","Electronics",15000.00,4),
                                               new Product("Santoor", "Soap", 20, 4),
                                               new Product("MI", "Electronics", 12000.0, 2),
                                               new Product("Luxe", "Soap", 10, 5),
                                               new Product("Happy Happly","Fast Food",10.00,5),
                                               new Product("Samsung", "Electronics", 100000.0, 4),
                                               new Product("I phone", "Electronics", 180000, 5)
        );

// Find:
// 1. Most expensive product in each category
// 2. Average price by category
// 3. Products with rating > 4, sorted by price
// 4. Cheapest product in "Electronics" category


//1.        
    Map<String, Product> mostExpensiveProduct = Products.stream()
                                                        .collect(Collectors.groupingBy(
                                                         Product::getCategory,
                                                         Collectors.collectingAndThen(
                                                         Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                                                         Optional::get
        )
    ));

    System.out.println("=== Most Expensive Products by Category ===");
    mostExpensiveProduct.forEach((category, product) -> {
    System.out.println("┌─────────────────────────────────────");
    System.out.println("│ Category: " + category);
    System.out.println("│ Product: " + product.getName());
    System.out.println("│ Price: $" + product.getPrice());
    System.out.println("│ Rating: " + product.getRating() + "/5");
    System.out.println("└─────────────────────────────────────");
});

    //2.
    Map<String,Double> avgPriceByCategorie = Products.stream()
                                                     .collect(Collectors.groupingBy(
                                                        Product::getCategory,
                                                        Collectors.averagingDouble(
                                                            Product::getPrice)));


    System.out.println("====Avarage price of each categories====");
    avgPriceByCategorie.forEach((category,price)->{
        System.out.println("┌─────────────────────────────────────");
        System.out.println("│Category: " + category);
        System.out.println("│Price: $" + price);
        System.out.println("└─────────────────────────────────────");
    });


    //4.
    Product cheapestProduct = Products.stream()
                                      .filter(p -> "Electronics".equals(p.getCategory()))
                                      .min(Comparator.comparing(Product::getPrice))
                                      .orElse(null);


            System.out.println("===The Cheapest product in Electronics Categorie===\n"+"Product name: "+cheapestProduct.getName()+"\nProduct Price:"+cheapestProduct.getPrice()+"\nProduct Rating: "+cheapestProduct.getRating());
    }
    
}
