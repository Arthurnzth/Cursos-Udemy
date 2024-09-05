package course_Employee.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Employee.src.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Employee employee = new Employee();
        
        System.out.print("Enter employee data:\n");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.print("\nEmployee: " + employee.toString());
        System.out.print("\n\nWich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.print("\nUpdated data: " + employee.toString());
        sc.close();
    }
}