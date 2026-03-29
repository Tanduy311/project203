package section1;

public class MedicineFactory implements ProductFactory {
    @Override
    public AProduct createProduct(
            String brand,
            String license,
            Double price,
            String lotNumber,
            String manufacturedCountry) {
        return new Medicine(license, brand, price, lotNumber);
    }
}
