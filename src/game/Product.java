package game;

public class Product {
    // Attributes
    private String name;
    private double price;
    private int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayInfo() {
        System.out.println("Producct Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("la nouvelle quantité est:" + newQuantity);
    }
    public void updateQuantity(int addedQuantity, boolean addToExisting) {
        if (addToExisting) {
            this.quantity += addedQuantity;
            System.out.println("Quantity increased by: " + addedQuantity);
        } else {
            this.quantity = addedQuantity;
            System.out.println("Quantity set to: " + addedQuantity);
        }
        System.out.println("New Quantity: " + this.quantity);
    }
    public double getPrice() {
        return price;
    }
    public static void welcomeMessage() {
        System.out.println("Welcome to Inventory Management System for a Warehouse");
    }
}
