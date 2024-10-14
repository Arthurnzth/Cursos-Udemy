package course_Contratos.src.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import course_Contratos.src.model.entities.Contract;
import course_Contratos.src.model.entities.Installment;
import course_Contratos.src.model.services.ContractService;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while(true) {

            try{

                System.out.println("Entre os dados do contrato:");
                System.out.print("Número: ");
                int number = Integer.parseInt(sc.nextLine());
                System.out.print("Data (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
                System.out.print("Valor do contrato: ");
                double totalValue = Double.parseDouble(sc.nextLine());

                Contract contract = new Contract(number, date, totalValue);

                System.out.print("Entre com o número de parcelas: ");
                int months = Integer.parseInt(sc.nextLine());

                ContractService service = new ContractService();
                service.processContract(contract, months);

                System.out.println("Parcelas:");
                for (Installment i : contract.getInstallments()) {
                    System.out.println(i);
                }

                break;

            }
            catch(NumberFormatException e) {
                System.out.print("Número inválido inserido");
            }
            catch(DateTimeParseException e) {
                System.out.println("Data inválida inserida");
            }

        }

        sc.close();
        
    }

}
