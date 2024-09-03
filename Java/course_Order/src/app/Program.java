package course_Order.src.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import course_Order.src.entities.Client;
import course_Order.src.entities.Order;
import course_Order.src.entities.OrderItem;
import course_Order.src.entities.Product;
import course_Order.src.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmtDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmtDMY);

        Client client = new Client(clientName, clientEmail, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=1;i<=n;i++){
            System.out.printf("Enter #%d item data:\n", i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = Double.parseDouble(sc.nextLine());
            Product product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            int productQuantity = Integer.parseInt(sc.nextLine());
            OrderItem item = new OrderItem(productQuantity, product);
            order.addItem(item);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.print(order);

        sc.close();
    }
}