package DAO;

import models.Client;

public interface IClientDAO {
	 Client save(Client c);
	 void update();
	 Client findById();
	 void remove();
}