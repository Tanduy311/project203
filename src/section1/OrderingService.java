package section1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderingService {
    private final List<Customer> customers;
    private final List<Order> orders;

    public OrderingService(List<Customer> customers, List<Order> orders) {
        this.customers = customers == null ? new ArrayList<>() : customers;
        this.orders = orders == null ? new ArrayList<>() : orders;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("customer must not be null");
        }
        customers.add(customer);
    }

    public void addOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("order must not be null");
        }
        orders.add(order);
    }

    public void orderProducts(Customer customer, List<AProduct> products) {
        Order order = new Order(customer, LocalDate.now());
        if (products != null) {
            for (AProduct product : products) {
                order.addProduct(product);
            }
        }
        addOrder(order);
        order.generateReceipt();
    }

    public void printAllOrders() {
        System.out.println("===== ALL ORDERS IN ORDERING SERVICE =====");
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        for (Order order : orders) {
            order.generateReceipt();
        }
    }
}
