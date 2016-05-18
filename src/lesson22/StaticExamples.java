package lesson22;

/**
 * Created by ignacy on 17.12.15.
 */
public class StaticExamples {
    public static void main(String[] args) {
        Product ball = new Product(123);
        Product tissue = new Product(124);
        System.out.println(ball);
        System.out.println(tissue);
        ball.setName("Adidas ball 2015");
        System.out.println(ball);
        System.out.println("Products number: "+Product.getQuantity());
        ball = new Product(321);
        System.out.println("Products number: "+Product.getQuantity());
    }

}

class Product {
    private final int serialNumber;
    private String name;
    private static int quantity = 0;

    Product(int serialNumber) {
        this.serialNumber = serialNumber;
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
