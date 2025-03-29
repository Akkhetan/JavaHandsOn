package I_Collection;

import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Natural Sorting based on Price (Ascending Order)
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}

public class TreeSetExample {
    public static void main(String[] args) {
        //  TreeSet with Natural Sorting (Sorted by Price)
        Set<Product> products = new TreeSet<>();
        products.add(new Product(201, "Laptop", 1200.50));
        products.add(new Product(202, "Phone", 800.75));
        products.add(new Product(203, "Tablet", 500.00));
        products.add(new Product(204, "Monitor", 300.99));

        System.out.println("TreeSet Sorted by Price:");
        products.forEach(System.out::println);

        //  Using Custom Comparator to Sort by Name
        Set<Product> nameSortedProducts = new TreeSet<>(Comparator.comparing(p -> p.name));
        nameSortedProducts.addAll(products);

        System.out.println("\nTreeSet Sorted by Name:");
        nameSortedProducts.forEach(System.out::println);

        // Finding the First & Last Elements
        System.out.println("\nFirst Product (Lowest Price): " + ((TreeSet<Product>) products).first());
        System.out.println("Last Product (Highest Price): " + ((TreeSet<Product>) products).last());

        //  Filtering Products with Price > 600
        System.out.println("\nProducts with Price > 600:");
        products.stream()
                .filter(p -> p.price > 600)
                .forEach(System.out::println);
    }
}