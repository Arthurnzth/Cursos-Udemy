package course_Shapes.src.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course_Shapes.src.entities.Circle;
import course_Shapes.src.entities.Rectangle;
import course_Shapes.src.entities.Shape;
import course_Shapes.src.entities.enums.Color;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            
            System.out.printf("Shape #%d data:\n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char c = sc.nextLine().charAt(0);

            if (c == 'r') {

                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());

                System.out.print("Width: ");
                double width = Double.parseDouble(sc.nextLine());

                System.out.print("Height: ");
                double height = Double.parseDouble(sc.nextLine());

                shapes.add(new Rectangle(color, width, height));

            }

            else {

                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());

                System.out.print("Radius: ");
                double radius = Double.parseDouble(sc.nextLine());

                shapes.add(new Circle(color, radius));

            }

        }

        System.out.println("\nSHAPES AREAS:");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();

    }
}
