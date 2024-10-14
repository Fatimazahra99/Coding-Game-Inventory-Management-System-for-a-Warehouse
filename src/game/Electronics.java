package game;

public class Electronics extends Product {
    private String brand;
    private int warranty;

    public Electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("la marque est " + brand);
        System.out.println("la garantie de " + warranty + " years");
    }
    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }
}

