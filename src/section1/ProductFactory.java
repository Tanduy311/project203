package section1;

public interface ProductFactory {
    AProduct createProduct(
            String brand,
            String license,
            Double price,
            String lotNumber,
            String manufacturedCountry);
}
