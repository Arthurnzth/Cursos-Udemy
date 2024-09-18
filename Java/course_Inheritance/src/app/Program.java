package course_Inheritance.src.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course_Inheritance.src.entities.ImportedProduct;
import course_Inheritance.src.entities.Product;
import course_Inheritance.src.entities.UsedProduct;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i=1;i<=n;i++) {
            
            System.out.printf("Product #%d data:\n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.nextLine().charAt(0);

            if (c=='c') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());

                products.add(new Product(name, price));

            }

            else if (c=='u') {

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufacturDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                products.add(new UsedProduct(name, price, manufacturDate));

            }

            else{

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(sc.nextLine());

                System.out.print("Customs fee: ");
                double customsFee = Double.parseDouble(sc.nextLine());

                products.add(new ImportedProduct(name, price, customsFee));

            }

        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
