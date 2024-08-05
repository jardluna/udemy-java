package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println();
			System.out.println("RESERVATION:\n" + reservation);
			
			System.out.println("----------------------------------------");	
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkInUpdate = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOutUpdate = sdf.parse(sc.next());
		
			reservation.updateDates(checkInUpdate, checkOutUpdate);
			System.out.println();
			System.out.println("RESERVATION:\n" + reservation);	
		}
		catch(DomainException e) {
			System.out.println();
			System.out.println("ERROR IN RESERVATION:\n" + e.getMessage());
		}
		catch(ParseException e) {
			System.out.println();
			System.out.println("INVALID DATE FORMAT");
		}
		catch(RuntimeException e) {
			System.out.println();
			System.out.println("UNEXPECTED ERROR");
		}
		finally {
			sc.close();
		}
		
	}
	
}


