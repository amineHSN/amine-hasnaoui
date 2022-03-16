package services;

import models.Client;
import repositories.ClientRepository;
import repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService {
	ClientRepository clientRepository = new ClientRepositoryImpl();

	@Override
	public Client save(Client c) {
		System.out.println("Service Layer : ClientServiceImpl Level... ");
		return null;
	}

	public ClientServiceImpl() {
		System.out.println("CallClientServiceImpl ....");
				}
}
