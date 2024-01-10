package MiniProjects;

import java.util.ArrayList;

class Product {
    protected int productId;
    protected String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("%s (ID: %d) - Rs%.2f%n", name, productId, price);
    }
}

class Electronics extends Product {
    private String brand;

    public Electronics(int productId, String name, double price, String brand) {
        super(productId, name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Brand: %s%n", brand);
    }
}

class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(int productId, String name, double price, String size, String color) {
        super(productId, name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Size: %s, Color: %s%n", size, color);
    }
}

class Customer {
    private String name;
    private ArrayList<Product> cart;

    public Customer(int customerId, String name, String email) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.printf("%s added to the cart.%n", product.name);
    }

    public void removeFromCart(Product product) {
        if (cart.contains(product)) {
            cart.remove(product);
            System.out.printf("%s removed from the cart.%n", product.name);
        } else {
            System.out.printf("%s not found in the cart.%n", product.name);
        }
    }

    public void displayCart() {
        System.out.printf("Shopping Cart for %s:%n", name);
        for (Product item : cart) {
            item.displayInfo();
        }
    }

    public void processOrder() {
        double totalAmount = cart.stream().mapToDouble(item -> item.price).sum();
        System.out.printf("Processing order for %s. Total amount: Rs%.2f%n", name, totalAmount);
        cart.clear();
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Example Usage
        // Creating Products
        Electronics laptop = new Electronics(1, "Laptop", 1200.0, "HP");
        Clothing tshirt = new Clothing(2, "T-Shirt", 20.0, "M", "Blue");

        // Creating Customer
        Customer customer = new Customer(101, "Shravya", "shravya@eb.com");

        // Adding items to the cart
        customer.addToCart(laptop);
        customer.addToCart(tshirt);

        // Displaying the cart
        customer.displayCart();

        // Removing an item from the cart
        customer.removeFromCart(tshirt);

        // Displaying the updated cart
        customer.displayCart();

        // Processing the order
        customer.processOrder();
    }
}

