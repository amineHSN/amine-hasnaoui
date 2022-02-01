package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService{
	IClientDao iClientDao;
	
	public ClientServiceImpl(IClientDao IClientDao){
        this.iClientDao = IClientDao;
    }

    public ClientServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IClientDao getiClientDao() {
        return iClientDao;
    }
	@Override
	public Client save(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
