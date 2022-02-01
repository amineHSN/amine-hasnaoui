package Services;

import models.Client;

public interface IClientService {
	Client save(Client clt);
	void update();
	Client findById();
	void remove();
}