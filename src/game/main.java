package game;
public class main{
    public static void main(String[] args) {
        Product.welcomeMessage();
        Electronics laptop = new Electronics("Laptop", 1500.0, 10, "Dell", 2);
        System.out.println("---- Electronics Product ----");
        laptop.displayInfo();
        laptop.updateQuantity(20);
        laptop.updateQuantity(5, true);
        laptop.displayInfo();

        System.out.println();

        Food apple = new Food("Apple", 0.5, 100, "2024-12-31");
        System.out.println("---- Food Product ----");
        apple.displayInfo();
        apple.updateQuantity(120);

        apple.updateQuantity(50, false);
        apple.displayInfo();
    }
}
