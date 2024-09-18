package course_EmployeeER.src.app;

import java.util.Scanner;

import course_EmployeeER.src.entities.Employee;
import course_EmployeeER.src.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i=1;i<=n;i++) {

            System.out.printf("Employee #%d data:\n", i);
            System.out.print("Outsourced (y/n)? ");

            if (sc.nextLine().charAt(0)=='y') {

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Hours: ");
                int hours = Integer.parseInt(sc.nextLine());

                System.out.print("Value per hour: ");
                double valuePerHour = Double.parseDouble(sc.nextLine());

                System.out.print("Addiciotnal charge: ");
                double addicionalCharge = Double.parseDouble(sc.nextLine());

                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, addicionalCharge));

            }

            else {

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Hours: ");
                int hours = Integer.parseInt(sc.nextLine());

                System.out.print("Value per hour: ");
                double valuePerHour = Double.parseDouble(sc.nextLine());

                employees.add(new Employee(name, hours, valuePerHour));
                
            }
            
        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}
