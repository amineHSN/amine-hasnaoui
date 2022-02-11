package ma.gov.tp8.DAO;

import ma.gov.tp8.modelsTC.Client;

public interface IClientDAO {
	 Client save(Client c);
	 void update();
	 Client findById();
	 void remove();
}
