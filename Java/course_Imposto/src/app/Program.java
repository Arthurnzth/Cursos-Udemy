package course_Imposto.src.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course_Imposto.src.entities.Company;
import course_Imposto.src.entities.Individual;
import course_Imposto.src.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();
        double totalTaxes = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            
            System.out.printf("Tax payer #%d data:\n", i);
            System.out.print("Individual or company (i/c)? ");
            char c = sc.nextLine().charAt(0);

            if (c == 'i') {
                
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = Double.parseDouble(sc.nextLine());

                System.out.print("Health expenditures: ");
                double healthExpenditures = Double.parseDouble(sc.nextLine());

                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));

            }

            else {

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = Double.parseDouble(sc.nextLine());

                System.out.print("Number of employees: ");
                int numberOfEmployees = Integer.parseInt(sc.nextLine());

                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));

            }

        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer tp : taxPayers) {
            totalTaxes += tp.tax();
            System.out.println(tp);
        }

        System.out.print("\nTOTAL TAXES: $ " + totalTaxes);

        sc.close();
    }
}
