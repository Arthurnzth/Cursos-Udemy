package course_Storage.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Storage.src.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product data:\n");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.print("\nProduct data: " + product.toString());

        System.out.print("\n\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.print("\nUpdated data: " + product.toString());

        System.out.print("\n\nEnter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());
        
        System.out.print("\nUpdated data: " + product.toString());
        sc.close();
    }
}