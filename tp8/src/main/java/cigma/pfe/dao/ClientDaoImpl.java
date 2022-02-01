package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import cigma.pfe.models.Client;

public class ClientDaoImpl implements IClientDao{
	IClientDao iClientDao;

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();



    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }

    public ClientDaoImpl(IClientDao iClientDao){
        this.iClientDao=iClientDao;
    }

    public ClientDaoImpl(){}

    public IClientDao getIClientDao() {
        return iClientDao;
    }
}
