package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        while (true) {
            
            try {

                System.out.print("Room number: ");
                int roomNumber = Integer.parseInt(sc.nextLine());
                System.out.print("Check-in date (dd/MM/yyyy): ");
                LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);
                System.out.print("Check-out date (dd/MM/yyyy): ");
                LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);

                Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
                System.out.println("Reservation: " + reservation);

                System.out.println("\nEnter data to update the reservation:");
                System.out.print("Check-in date (dd/MM/yyyy): ");
                checkIn = LocalDate.parse(sc.nextLine(), fmt);
                System.out.print("Check-out date (dd/MM/yyyy): ");
                checkOut = LocalDate.parse(sc.nextLine(), fmt);

                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);

                break;

            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid date format\n");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid room number\n");
            }
            catch (DomainException e) {
                System.out.println("Error in reservation: " + e.getMessage());
            }
            catch (RuntimeException e) {
                System.out.println("Unexpected error\n");
            }
        
        }

        sc.close();

    }
}
