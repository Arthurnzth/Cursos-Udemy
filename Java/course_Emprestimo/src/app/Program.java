package course_Emprestimo.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Emprestimo.src.model.service.InterestService;
import course_Emprestimo.src.model.service.UsaInterestService;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = Double.parseDouble(sc.nextLine());
        System.out.print("Months: ");
        int months = Integer.parseInt(sc.nextLine());

        InterestService iService = new UsaInterestService(1.0);
        double payment = iService.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();

    }

}
