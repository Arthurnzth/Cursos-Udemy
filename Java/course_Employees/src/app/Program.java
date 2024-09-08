package course_Employees.src.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course_Employees.src.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){
            System.out.printf("\nEmployee #%d:\n", i+1);
            System.out.print("Id: ");
            int id = Integer.parseInt(sc.nextLine());

            while(hasID(employees, id)){
                System.out.print("This Id already exists. Please enter another Id: ");
                id = Integer.parseInt(sc.nextLine());
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int increaseID = Integer.parseInt(sc.nextLine());
        Integer position = pos(employees, increaseID);
        if(position==null){
            System.out.print("This id does not exist!\n");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = Double.parseDouble(sc.nextLine());
            employees.get(position).increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for(Employee x : employees){
            System.out.println(x);
        }

        sc.close();
    }

    public static Integer pos(List<Employee> list, int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                return i;
            }
        }
        return null;
    }

    public static Boolean hasID(List<Employee> list, int id){
        if(list.stream().filter(x->x.getId()==id).findFirst().orElse(null)==null){
            return false;
        }
        else return true;
    }

}