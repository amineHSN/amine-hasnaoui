package ma.gov.tp8.modelsTC;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Client {
	@Id
	// GenerationType.IDENTITY n’est pas permise si
	// La stratégie d'héritage est TABLE_PER_CLASS
	private long id;
	private String name;
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String name) {
		super();
		this.name = name;
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


}
