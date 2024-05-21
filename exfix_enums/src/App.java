import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String client_name = sc.nextLine();
        System.out.print("E-mail: ");
        String client_email = sc.nextLine();
        System.out.print("Birth date: ");
        LocalDate client_birth = LocalDate.parse(sc.next(), fmt01);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(client_name, client_email, client_birth));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String product_name = sc.nextLine();
            System.out.print("Product price: ");
            double product_price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, new Product(product_name, product_price));
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
