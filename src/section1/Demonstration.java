package section1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demonstration {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer ID 1", "Customer Name 1", "0123xxx789");
        Customer customer2 = new Customer("Customer ID 2", "Customer Name 2", "0123---ZZZ");

        OrderingService orderingService = new OrderingService(new ArrayList<>(), new ArrayList<>());
        orderingService.addCustomer(customer1);
        orderingService.addCustomer(customer2);

        Order order1 = new Order(customer1, LocalDate.now());
        order1.addProduct("medicine", "Med Brand 1.1", "Med License 1", 20.5, "Lot 1", null);
        order1.addProduct("medicine", "Med Brand 1.2", "Med License 1", 35.5, "Lot 1", null);
        order1.addProduct("toy", "Toy Brand 1", "Toy License 1", 21.1, null, "Vietnam");

        Order order2 = new Order(customer2, LocalDate.now());
        order2.addProduct("medicine", "Med Brand 2.1", "Med License 2", 69.9, "Lot 2", null);
        order2.addProduct("toy", "Toy Brand 2", "Toy License 2", 22.5, null, "Laos");

        orderingService.addOrder(order1);
        orderingService.addOrder(order2);

        orderingService.printAllOrders();

        System.out.println("===== HELPER METHOD DEMO: orderProducts() =====");
        List<AProduct> helperProducts = List.of(
                new Medicine("Helper License M", "Helper Med", 10.0, "Helper Lot"),
                new Toy("Helper License T", "Helper Toy", 15.0, "Thailand"));
        OrderingService helperService = new OrderingService(new ArrayList<>(), new ArrayList<>());
        helperService.addCustomer(customer1);
        helperService.orderProducts(customer1, helperProducts);

        try {
            order1.addProduct("invalid", "Brand X", "License X", 1.0, null, null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Validation check: " + ex.getMessage());
        }
    }
}
