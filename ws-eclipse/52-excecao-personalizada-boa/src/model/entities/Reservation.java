package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if(checkIn.after(checkOut)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
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
	
	public void updateDates(Date checkInUpdate, Date checkOutUpdate) throws DomainException {
		if(checkIn.after(checkInUpdate) && checkOut.after(checkOutUpdate)) {
			throw new DomainException("Reservation dates for update must be FUTURE dates");
		}
		if(checkInUpdate.after(checkOutUpdate)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		if(checkInUpdate.before(checkOut)) {
			throw new DomainException("Reservation dates for update must be AFTER check-out");
		}
		this.checkIn = checkInUpdate;
		this.checkOut = checkOutUpdate;
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


