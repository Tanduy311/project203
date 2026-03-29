package section1;

public class Medicine extends AProduct {
    private String lotNumber;

    public Medicine(String license, String brand, Double price, String lotNumber) {
        super(license, brand, price);
        this.lotNumber = lotNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    @Override
    public Double calculateCost() {
        return getPrice() * 0.10;
    }

    @Override
    public String toString() {
        return String.format("%s: %s - %s", getBrand(), getPrice(), getLicense());
    }
}
