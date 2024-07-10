package entities;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import entities.enums.OrderStatus;

public class Order {
	
	//ATTRIBUTES
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	//CONSTRUCTOR
	public Order() {
		
	}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	
	//GETTER AND SETTER
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Id = " + id + String.format("%n") + 
				"Date = " + moment + String.format("%n") + 
				"Status = " + status;
	}
	
	
}


