package course_Contratos.src.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    public Installment() {
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toString() {
        return dueDate.format(fmt)
            + " - "
            + String.format("%.2f", amount);
    }

}
