package course_EmployeeER.src.entities;

public class OutsourcedEmployee extends Employee {

    private Double addicionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
        super(name, hours, valuePerHour);
        this.addicionalCharge = addicionalCharge;
    }
    public OutsourcedEmployee() {
        super();
    }

    public Double getAddicionalCharge() {
        return addicionalCharge;
    }
    public void setAddicionalCharge(Double addicionalCharge) {
        this.addicionalCharge = addicionalCharge;
    }
    
    @Override
    public final Double payment() {
        return super.payment()+(1.10*addicionalCharge);
    }

}
