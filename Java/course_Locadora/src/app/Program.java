package course_Locadora.src.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import course_Locadora.src.model.entities.CarRental;
import course_Locadora.src.model.entities.Vehicle;
import course_Locadora.src.model.services.BrazilTaxService;
import course_Locadora.src.model.services.RentalService;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = Double.parseDouble(sc.nextLine());
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = Double.parseDouble(sc.nextLine());

        // injeção de dependência por meio de contrutor
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService()); // upcasting
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();

    }

}
