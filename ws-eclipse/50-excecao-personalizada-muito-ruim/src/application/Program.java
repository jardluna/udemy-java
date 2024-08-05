package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(checkIn.after(checkOut)) {
			System.out.println();
			System.out.println("ERROR IN RESERVATION:");
			System.out.println("Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println();
			System.out.println("RESERVATION: \n" + reservation);
			
			System.out.println("----------------------------------------");		
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkInUpdate = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOutUpdate = sdf.parse(sc.next());

			if(checkIn.after(checkInUpdate) || checkOut.after(checkOutUpdate)) {
				System.out.println();
				System.out.println("ERROR IN RESERVATION:");
				System.out.println("Reservation dates for update must be future dates");
			}
			else if(checkInUpdate.after(checkOutUpdate)) {
				System.out.println();
				System.out.println("ERROR IN RESERVATION:");
				System.out.println("Check-out date must be after check-in date");
			}
			else if(checkInUpdate.before(checkOut)) {
				System.out.println();
				System.out.println("ERROR IN RESERVATION:");
				System.out.println("Reservation dates for update must be after check-out");
			}
			else {
				reservation.updateDates(checkInUpdate, checkOutUpdate);
				System.out.println();
				System.out.println("RESERVATION: \n" + reservation);
			}
		}
		
		sc.close();
	}
	
}


