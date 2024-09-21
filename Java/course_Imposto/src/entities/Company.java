package course_Imposto.src.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;
    
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public Company() {
        super();
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public final Double tax() {
        if (numberOfEmployees <= 10) {
            return getAnualIncome() * 0.16;
        }
        else {
            return getAnualIncome() * 0.14;
        }
    }

}
