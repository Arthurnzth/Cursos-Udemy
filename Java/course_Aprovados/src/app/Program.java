package Udemy.Java.course_Aprovados.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Aprovados.src.entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantos alunos serao digitados? ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] alunos = new Student[n];

        for(int i=0;i<alunos.length;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
            String name = sc.nextLine();
            double firstGrade = Double.parseDouble(sc.nextLine());
            double secondGrade = Double.parseDouble(sc.nextLine());
            alunos[i] = new Student(name, firstGrade, secondGrade);
        }

        System.out.print("Alunos aprovados:\n");
        for(int i=0;i<alunos.length;i++){
            if(alunos[i].isApproved()==true){
                System.out.println(alunos[i].getName());
            }
        }

        sc.close();
    }
}