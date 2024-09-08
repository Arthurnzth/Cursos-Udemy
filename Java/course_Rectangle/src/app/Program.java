package course_Rectangle.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Rectangle.src.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width and height:\n");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        
        System.out.print("AREA = " + String.format("%.2f", rectangle.area()));
        System.out.print("\nPERIMETER = " + String.format("%.2f", rectangle.perimeter()));
        System.out.print("\nDIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
        sc.close();
    }
}