package section1;

public final class ProductFactory {
    private ProductFactory() {
    }

    public static AProduct createProduct(
            String productType,
            String brand,
            String license,
            Double price,
            String lotNumber,
            String manufacturedCountry) {
        if (productType == null) {
            throw new IllegalArgumentException("productType must not be null");
        }

        switch (productType.trim().toLowerCase()) {
            case "medicine":
                return new Medicine(license, brand, price, lotNumber);
            case "toy":
                return new Toy(license, brand, price, manufacturedCountry);
            default:
                throw new IllegalArgumentException("Unsupported productType: " + productType);
        }
    }
}
