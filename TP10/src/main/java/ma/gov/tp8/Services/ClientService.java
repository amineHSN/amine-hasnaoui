package ma.gov.tp8.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.tp8.DAO.IClientDAO;
import ma.gov.tp8.modelsTC.Client;



@Service
public class ClientService implements IClientService {
	
	
	@Autowired
	IClientDAO clientDAO;
	
	
	public ClientService() {
		System.out.println("Call ClientServiceImpl ....");
	}

	@Transactional
	@Override
	public Client save(Client clt) {
		return clientDAO.save(clt);
	}

	@Transactional
	@Override
	public void update() {
		clientDAO.update();
	}

	@Transactional
	@Override
	public Client findById() {
		// TODO Auto-generated method stub
		return clientDAO.findById();
	}

	@Transactional
	@Override
	public void remove() {
		clientDAO.remove();
	}

}
