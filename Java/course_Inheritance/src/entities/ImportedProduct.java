package course_Inheritance.src.entities;

public final class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public ImportedProduct() {
        super();
    }

    public Double getCustomsFee() {
        return customsFee;
    }
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public final String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + String.format(" (Customs fee: $ %.2f)", customsFee);
    }

}
