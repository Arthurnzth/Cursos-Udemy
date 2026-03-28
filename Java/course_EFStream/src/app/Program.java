package course_EFStream.src.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import course_EFStream.src.model.entities.Employee;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = ((s1, s2) -> s1.compareToIgnoreCase(s2));

            List<String> emails = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted(comp).collect(Collectors.toList());

            System.out.println(String.format("Email of people whose salary is more than %.2f:", salary));
            emails.forEach(System.out::println);

            double sum = list.stream().filter(e -> e.getName().toUpperCase().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.printf("Sum of salary of people whose name starts with \"M\": %.2f", sum);

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
        }

    }

}
