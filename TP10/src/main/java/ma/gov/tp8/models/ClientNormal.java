package ma.gov.tp8.models;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="normal_id")
public class ClientNormal extends Client {
	private int importanceLevel;

	public int getImportanceLevel() {
		return importanceLevel;
	}

	public void setImportanceLevel(int importanceLevel) {
		this.importanceLevel = importanceLevel;
	}

	public ClientNormal(String name, int importanceLevel) {
		super(name);
		this.importanceLevel = importanceLevel;
	}
	
}
