package section2;

public class Product {
    private final String name;
    private final String license;
    private final Double price;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.license = builder.license;
        this.price = builder.price;
    }

    public void displayInfor() {
        System.out.printf("Name: %s | License: %s | Price: %s%n", name, license, price);
    }

    public static class ProductBuilder {
        private String name;
        private String license;
        private Double price;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setLicense(String license) {
            this.license = license;
            return this;
        }

        public ProductBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
