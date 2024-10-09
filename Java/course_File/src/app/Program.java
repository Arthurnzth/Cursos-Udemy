package course_File.src.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import course_File.src.model.entities.Product;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourseFilePath = sc.nextLine();

        File sourseFile = new File(sourseFilePath);
        String sourseFolderPath = sourseFile.getParent();

        @SuppressWarnings("unused")
        boolean success = new File(sourseFolderPath + "\\out").mkdir();

        String outputFilePath = sourseFolderPath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourseFilePath))) {

            String line = br.readLine();
            while (line != null) {
                
                String[] datas = line.split(",");
                String name = datas[0];
                double price = Double.parseDouble(datas[1]);
                int quantity = Integer.parseInt(datas[2]);

                products.add(new Product(name, price, quantity));

                line = br.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

                for (Product product : products) {
                    bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                    bw.newLine();
                }

            }
            catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid value entered");
        }

        sc.close();
        
    }

}
