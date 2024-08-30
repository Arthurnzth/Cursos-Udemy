package Udemy.Java.course_Radius.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Radius.src.util.Calculator;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        
        System.out.printf("\nCircumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f", Calculator.PI);
        sc.close();
    }
}