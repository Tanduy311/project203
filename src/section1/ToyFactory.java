package section1;

public class ToyFactory implements ProductFactory {
    @Override
    public AProduct createProduct(
            String brand,
            String license,
            Double price,
            String lotNumber,
            String manufacturedCountry) {
        return new Toy(license, brand, price, manufacturedCountry);
    }
}
