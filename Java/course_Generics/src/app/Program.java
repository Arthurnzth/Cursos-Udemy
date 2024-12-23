package course_Generics.src.app;

import java.util.Scanner;

import course_Generics.src.services.PrintService;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            Integer value = Integer.parseInt(sc.nextLine());
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();

    }

}
