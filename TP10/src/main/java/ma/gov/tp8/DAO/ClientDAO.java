package ma.gov.tp8.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.gov.tp8.modelsTC.Client;



@Repository
public  class ClientDAO implements IClientDAO {

	@PersistenceContext
	private EntityManager em;

	public ClientDAO() {
		System.out.println("Call ClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		em.persist(c);
		return null;
	}

	@Override
	public Client findById() {
		Client c = em.find(Client.class, 1L);
		System.out.println("client Id : " + c.getId() + " Nom : " + c.getName());
		return c;
	}
	@Override
	public void update() {
		Client c =findById();
		System.out.println("client Id : " + c.getId() + " Nom : " + c.getName());
		c.setName("imane");
		}

	@Override
	public void remove() {
		Client c =findById();
		em.remove(c);
	}


}
