package Udemy.Java.course_Bank.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Bank.src.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Account account = new Account();

        System.out.print("Enter account number: ");
        int accountNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);

        switch (answer) {
            case 'y':
                System.out.print("Enter initial deposit value: ");
                double initialDepositValue = sc.nextDouble();
                account = new Account(accountNumber, accountHolder, initialDepositValue);
                break;
            case 'n':
                account = new Account(accountNumber, accountHolder);
                break;
        }

        System.out.print("\nAccount data:\n");
        System.out.print(account.toString());

        System.out.print("\n\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.depositValue(depositValue);
        System.out.print("Updated account data:\n");
        System.out.print(account.toString());

        System.out.print("\n\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdrawValue(withdrawValue);
        System.out.print("Updated account data:\n");
        System.out.print(account.toString());

        sc.close();
    }
}