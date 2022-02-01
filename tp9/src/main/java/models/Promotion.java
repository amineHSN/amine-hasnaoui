package models;

import javax.persistence.*;

@Entity
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String description;
	
	public Promotion() {
		
	}

	public Promotion(long id, String description) {
		this.id = id;
		this.description = description;
	}

	public Promotion(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", description=" + description + "]";
	}
	
	
}