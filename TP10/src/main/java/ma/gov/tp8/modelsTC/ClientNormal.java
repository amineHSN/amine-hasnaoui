package ma.gov.tp8.modelsTC;

import javax.persistence.*;

@Entity
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
