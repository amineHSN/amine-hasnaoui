package ma.gov.tp8.Services;

import ma.gov.tp8.modelsTC.Client;

public interface IClientService {
	Client save(Client c);
	void update();
	Client findById();
	void remove();
}
