package course_Heranca.src.app;

import course_Heranca.src.entities.Account;
import course_Heranca.src.entities.BusinessAccount;
import course_Heranca.src.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // ! BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // @Override
        Account account1 = new Account(1005, "Fulano", 1000.0);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new SavingsAccount(1006, "Ciclano", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1007, "Beltrano", 1000.0, 500.00);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());
    }
}