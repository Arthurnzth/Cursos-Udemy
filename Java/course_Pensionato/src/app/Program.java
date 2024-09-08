package course_Pensionato.src.app;

import java.util.Locale;
import java.util.Scanner;

import course_Pensionato.src.entities.Rent;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int rents = Integer.parseInt(sc.nextLine());

        Rent[] rooms = new Rent[10];

        for(int i=0;i<rents;i++){
            System.out.printf("\nRent #%d:\n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = Integer.parseInt(sc.nextLine());
            rooms[room] = new Rent(name, email);
        }

        System.out.print("\nBusy rooms:\n");
        for(int i=0;i<rooms.length;i++){
            if(rooms[i]!=null){
                System.out.println(i + ": " + rooms[i].toString());
            }
        }

        sc.close();
    }
}