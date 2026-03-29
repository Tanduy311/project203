package section2;

public class Demonstration {
    public static void main(String[] args) {
        Product instance1 = new Product.ProductBuilder()
                .setName("Product 1: Medicine")
                .setLicense("Medicine License")
                .setPrice(68.9)
                .build();

        Product instance2 = new Product.ProductBuilder()
                .setName("Product 2: Toy")
                .setLicense("Toy License")
                .setPrice(2.5)
                .build();

        instance1.displayInfor();
        instance2.displayInfor();
    }
}
