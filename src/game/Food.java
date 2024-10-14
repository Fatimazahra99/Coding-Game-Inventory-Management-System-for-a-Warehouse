package game;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("la date d'expiration: " + expirationDate);
    }
    public String getExpirationDate() {
        return expirationDate;
    }
}
