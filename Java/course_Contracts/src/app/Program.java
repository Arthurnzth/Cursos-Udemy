package course_Contracts.src.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import course_Contracts.src.entities.Department;
import course_Contracts.src.entities.HourContract;
import course_Contracts.src.entities.Worker;
import course_Contracts.src.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmtDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data: ");
        System.out.print("\nName: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = Double.parseDouble(sc.nextLine());

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            System.out.printf("Enter contract #%d data:\n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmtDMY);
            System.out.print("Value per hour: ");
            double valuePerhour = Double.parseDouble(sc.nextLine());
            System.out.print("Duration (hours): ");
            int hours = Integer.parseInt(sc.nextLine());
            HourContract contract = new HourContract(contractDate, valuePerhour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));

        sc.close();
    }
}