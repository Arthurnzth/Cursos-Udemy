package Udemy.Java.course_Product_VectExample.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Product_VectExample.src.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = Integer.parseInt(sc.nextLine());
        Product[] vect = new Product[n];

        for(int i=0;i<vect.length;i++){
            String name = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i=0;i<vect.length;i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/n;

        System.out.printf("AVARAGE PRICE = %.2f", avg);

        sc.close();
    }
}