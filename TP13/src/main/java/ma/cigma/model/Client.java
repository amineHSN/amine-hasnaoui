package ma.cigma.model;



public class Client {
	
	private long id;
	private String nom;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Client() {
		super();
	}
	public Client(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	

}
