package course_Contratos.src.model.services;

import course_Contratos.src.model.entities.Contract;
import course_Contratos.src.model.entities.Installment;

public class ContractService {

    public void processContract(Contract contract, Integer months) {
        OnlinePaymentService service = new PaypalService();
        for (int i = 1; i <= months; i++) {
            double installment = contract.getTotalValue() / months; // 200
            double amount = service.interest(installment, i) + installment; // 200 + 1 % p/mes
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), service.paymentFee(amount) + amount));
        }
    }

}
