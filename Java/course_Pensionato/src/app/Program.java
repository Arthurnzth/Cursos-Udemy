package Udemy.Java.course_Pensionato.src.app;

import java.util.Locale;
import java.util.Scanner;

import Udemy.Java.course_Pensionato.src.entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int nRooms = Integer.parseInt(sc.nextLine());

        Student[] rooms = new Student[10];

        for(int i=0;i<nRooms;i++){
            System.out.printf("\nRent #%d:\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = Integer.parseInt(sc.nextLine());
            rooms[room] = new Student(name, email);
        }

        System.out.print("\nBusy rooms:\n");
        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null){
                System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }

        sc.close();
    }
}