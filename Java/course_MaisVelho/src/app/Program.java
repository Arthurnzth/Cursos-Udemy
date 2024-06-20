package Udemy.Java.course_MaisVelho.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_MaisVelho.src.entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());

        Person[] pessoas = new Person[n];

        for(int i=0;i<pessoas.length;i++){
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = Integer.parseInt(sc.nextLine());
            pessoas[i] = new Person(name, age);
        }

        int olderAge = 0;
        String older = "";
        for(int i=0;i<pessoas.length;i++){
            if(pessoas[i].getAge()>olderAge){
                older = pessoas[i].getName();
                olderAge = pessoas[i].getAge();
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + older);
        
        sc.close();
    }
}