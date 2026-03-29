package section1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<AProduct> products;
    private Customer customer;
    private LocalDate orderedDate;

    public Order(Customer customer, LocalDate orderedDate) {
        if (customer == null) {
            throw new IllegalArgumentException("customer must not be null");
        }
        if (orderedDate == null) {
            throw new IllegalArgumentException("orderedDate must not be null");
        }
        this.customer = customer;
        this.orderedDate = orderedDate;
        this.products = new ArrayList<>();
    }

    public List<AProduct> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("customer must not be null");
        }
        this.customer = customer;
    }

    public LocalDate getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(LocalDate orderedDate) {
        if (orderedDate == null) {
            throw new IllegalArgumentException("orderedDate must not be null");
        }
        this.orderedDate = orderedDate;
    }

    public void addProduct(
            String productType,
            String brand,
            String license,
            Double price,
            String lotNumber,
            String manufacturedCountry) {
        AProduct product = ProductFactory.createProduct(
                productType, brand, license, price, lotNumber, manufacturedCountry);
        this.products.add(product);
    }

    public void addProduct(AProduct product) {
        if (product == null) {
            throw new IllegalArgumentException("product must not be null");
        }
        this.products.add(product);
    }

    public Double getTotalPrice() {
        double total = 0.0;
        for (AProduct product : products) {
            total += product.calculateCost();
        }
        return total;
    }

    public void generateReceipt() {
        System.out.println("===== ORDER RECEIPT =====");
        System.out.printf("Customer information: %s(%s)%n", customer.getName(), customer.getPhoneNumber());
        System.out.println("Total Product number: " + products.size());
        System.out.println("Ordered day: " + orderedDate);
        for (AProduct product : products) {
            System.out.printf("- %s | Cost: %.2f%n", product, product.calculateCost());
        }
        System.out.printf("Total price: %.2f%n", getTotalPrice());
        System.out.println("=========================");
    }
}
