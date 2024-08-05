package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkInUpdate, Date checkOutUpdate) {
		if(checkIn.after(checkInUpdate) && checkOut.after(checkOutUpdate)) {
			return "ERROR IN RESERVATION: \nReservation dates for update must be future dates";
		}
		if(checkInUpdate.after(checkOutUpdate)) {
			return "ERROR IN RESERVATION: \nCheck-out date must be after check-in date";
		}
		if(checkInUpdate.before(checkOut)) {
			return "ERROR IN RESERVATION: \nReservation dates for update must be after first check-out";
		}
		this.checkIn = checkInUpdate;
		this.checkOut = checkOutUpdate;
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("- Room " + roomNumber + "\n");
		sb.append("- Check-in: ");
		sb.append(sdf.format(checkIn) + "\n");
		sb.append("- Check-out: ");
		sb.append(sdf.format(checkOut) + "\n");
		sb.append("- " + duration() + " nights");
		return sb.toString();
	}
	
}


