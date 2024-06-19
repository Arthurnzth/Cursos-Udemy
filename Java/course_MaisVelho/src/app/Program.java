package app;

import java.util.Locale;
import java.util.Scanner;

import entities.PersonOlder;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        PersonOlder[] pessoas = new PersonOlder[n];

        for(int i=0;i<pessoas.length;i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = Integer.parseInt(sc.nextLine());
            pessoas[i] = new PersonOlder(name, age);
        }

        String older = "";
        for(int i=0;i<pessoas.length-1;i++){
            if(pessoas[i].getAge()>pessoas[i+1].getAge()){
                older = pessoas[i].getName();
            }
            else{
                older = pessoas[i+1].getName();
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + older);
        
        sc.close();
    }
}
