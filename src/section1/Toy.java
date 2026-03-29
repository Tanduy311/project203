package section1;

public class Toy extends AProduct {
    private String manufacturedCountry;

    public Toy(String license, String brand, Double price, String manufacturedCountry) {
        super(license, brand, price);
        this.manufacturedCountry = manufacturedCountry;
    }

    public String getManufacturedCountry() {
        return manufacturedCountry;
    }

    public void setManufacturedCountry(String manufacturedCountry) {
        this.manufacturedCountry = manufacturedCountry;
    }

    @Override
    public Double calculateCost() {
        return getPrice() * 0.08;
    }

    @Override
    public String toString() {
        return String.format("%s: %s - %s", getBrand(), getPrice(), getLicense());
    }
}
