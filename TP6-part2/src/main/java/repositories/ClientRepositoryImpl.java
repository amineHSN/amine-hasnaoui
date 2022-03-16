package repositories;

import models.Client;

public class ClientRepositoryImpl implements ClientRepository {

	@Override
	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		return null;
	}

	public ClientRepositoryImpl() {
		System.out.println("CallClientRepositoryImpl ....");
		}

}
