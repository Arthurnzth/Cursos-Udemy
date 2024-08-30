package Udemy.Java.course_Triangle.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Triangle.src.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Triangle x = new Triangle(), y = new Triangle();

        System.out.print("Enter the measures of the triangle X: \n");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Enter the measures of the triangle Y: \n");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);
        if(areaX>areaY){
            System.out.println("Larger area: X");
        }
        else{
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}