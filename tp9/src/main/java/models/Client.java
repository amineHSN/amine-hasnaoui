package models;

import java.util.List;

import javax.persistence.*;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST })
	private List<Facture> factures;

	@ManyToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "my_join_table_client_promotion", joinColumns = @JoinColumn(name = "client_fk"
	, referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "promotion_fk", referencedColumnName = "id"))

	private List<Promotion> promotions;
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String name) {
		super();
		this.name = name;
	}

	public Client(String name, List<Facture> factures) {
		super();
		this.name = name;
		this.factures = factures;
	}

	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public CarteFidelio getCarteFidelio() {
		return carteFidelio;
	}

	public void setCarteFidelio(CarteFidelio carteFidelio) {
		this.carteFidelio = carteFidelio;
	}

}