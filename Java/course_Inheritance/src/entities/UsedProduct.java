package course_Inheritance.src.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufacturDate) {
        super(name, price);
        this.manufactureDate = manufacturDate;
    }
    public UsedProduct() {
        super();
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manufacturDate) {
        this.manufactureDate = manufacturDate;
    }

    @Override
    public final String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }

}
