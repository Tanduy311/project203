package section1;

public abstract class AProduct {
    private String license;
    private String brand;
    private Double price;

    public AProduct(String license, String brand, Double price) {
        this.license = license;
        this.brand = brand;
        this.price = price;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double calculateCost();

    @Override
    public String toString() {
        return String.format("%s -- %s (%s)", getClass().getSimpleName(), brand, license);
    }
}
