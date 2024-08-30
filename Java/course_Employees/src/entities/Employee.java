package Udemy.Java.course_Employees.src.entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getSalary(){
        return this.salary;
    }

    public void increaseSalary(double percentage){
        salary += salary*percentage/100.0;
    }
    public String toString(){
        return (id
                + ", "
                + name
                + ", "
                + String.format("%.2f", salary));
    }
    
}