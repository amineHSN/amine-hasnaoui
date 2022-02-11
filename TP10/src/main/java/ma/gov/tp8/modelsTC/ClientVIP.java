package ma.gov.tp8.modelsTC;

import javax.persistence.*;


@Entity
public class ClientVIP extends Client {
	private String preferences;

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public ClientVIP(String name, String preferences) {
		super(name);
		this.preferences = preferences;
	}
	
}
