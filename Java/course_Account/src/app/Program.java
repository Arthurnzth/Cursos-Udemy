package course_Account.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Account.src.model.entities.Account;
import course_Account.src.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            try {

                System.out.println("Enter account data");
                System.out.print("Number: ");
                int number = Integer.parseInt(sc.nextLine());
                System.out.print("Holder: ");
                String holder = sc.nextLine();
                System.out.print("Initial balance: ");
                double balance = Double.parseDouble(sc.nextLine());
                System.out.print("Withdraw limit: ");
                double withdrawLimit = Double.parseDouble(sc.nextLine());

                Account account = new Account(number, holder, balance, withdrawLimit);

                System.out.print("\nEnter amount for withdraw: ");
                double amount = Double.parseDouble(sc.nextLine());

                account.withdraw(amount);

                System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

                break;

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number/value entered\n");
            }
            catch (DomainException e) {
                System.out.println("Withdraw error: " + e.getMessage());
            }
            catch (RuntimeException e) {
                System.out.println("Unexpected error\n");
            }
        
        }

        sc.close();

    }
}
