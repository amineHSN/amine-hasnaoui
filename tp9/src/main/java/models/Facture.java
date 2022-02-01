package models;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Facture {
	@Id
	@GeneratedValue
	private long id;
	private double amount;
	private String description;
	@ManyToOne
	private Client client;
	
	public Facture() {
		
	}

	public Facture(double amount, String description) {
		super();
		this.amount = amount;
		this.description = description;
	}

	public Facture(String description) {
		super();
		this.description = description;
	}

	public Facture(long id, double amount, String description) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}