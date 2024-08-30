package Udemy.Java.course_Dolar.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Dolar.src.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollarAmount = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountToBePaid());
        sc.close();
    }
}