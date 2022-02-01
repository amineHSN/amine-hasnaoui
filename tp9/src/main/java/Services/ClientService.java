package Services;

import DAO.IClientDAO;
import models.Client;

public class ClientService implements IClientService {
	

	IClientDAO clientDAO;
	

	public ClientService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientService(IClientDAO clientDAO) {
		super();
		this.clientDAO = clientDAO;
	}

	@Override
	public Client save(Client clt) {
		return clientDAO.save(clt);
	}

	@Override
	public void update() {
		clientDAO.update();
	}

	@Override
	public Client findById() {
		// TODO Auto-generated method stub
		return clientDAO.findById();
	}

	@Override
	public void remove() {
		clientDAO.remove();
	}

}