package Udemy.Java.course_Grade.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Grade.src.entities.Grades;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Grades student = new Grades();
        student.name = sc.nextLine();
        student.firstQuarter = sc.nextDouble();
        student.secondQuarter = sc.nextDouble();
        student.thirdQuarter = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
        if(student.finalGrade()>=60){
            System.out.print("\nPASS");
        }
        else{
            System.out.printf("\nFAILED\nMISSING %.2f POINTS", (student.missingPoints()));
        }
        sc.close();
    }
}