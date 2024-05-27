import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(), fmt01);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(), fmt01);
        
        sc.close();
        if (!checkOut.isAfter(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else{ 
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt01);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt01);

            LocalDate now = LocalDate.now();

            if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } 
            else if(!checkOut.isAfter(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } 
            else{
                reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
            }

            
        }
    }
}
