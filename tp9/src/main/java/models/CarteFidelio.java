package models;

import javax.persistence.*;

@Entity
public class CarteFidelio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String code;
	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public CarteFidelio() {
		
	}


	public CarteFidelio(String code, Client client) {
		super();
		this.code = code;
		this.client = client;
	}


	public CarteFidelio(String code) {
		super();
		this.code = code;
	}

	public CarteFidelio(long id, String code, Client client) {
		super();
		this.id = id;
		this.code = code;
		this.client = client;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "CarteFidelio [id=" + id + ", code=" + code + "]";
	}
	
	
	
}