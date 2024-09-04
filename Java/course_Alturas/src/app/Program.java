package course_Alturas.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Alturas.src.entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = Integer.parseInt(sc.nextLine());

        Person[] pessoas = new Person[n];

        for(int i=0;i<pessoas.length;i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Altura: ");
            double height = Double.parseDouble(sc.nextLine());
            pessoas[i] = new Person(name, age, height);
        }

        int cont = 0;
        double soma = 0;
        for(int i=0;i<pessoas.length;i++){
            soma += pessoas[i].getHeight();
            if(pessoas[i].getAge()<16){
                cont++;
            }
        }
        System.out.printf("\nAltura média: %.2f", pessoas[0].media(soma, pessoas.length));
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%c", pessoas[0].percet(pessoas.length, cont), '%');
        for(int i=0;i<pessoas.length;i++){
            if(pessoas[i].getAge()<16){
                System.out.printf("\n%s", pessoas[i].getName());
            }
        }

        sc.close();
    }
}