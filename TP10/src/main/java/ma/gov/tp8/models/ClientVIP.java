package ma.gov.tp8.models;

import javax.persistence.*;


@Entity
@PrimaryKeyJoinColumn(name="vip_id")
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
