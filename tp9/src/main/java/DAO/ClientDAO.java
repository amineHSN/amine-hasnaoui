package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Client;

public  class ClientDAO implements IClientDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");
	EntityManager em = emf.createEntityManager();

	public ClientDAO() {
		System.out.println("Call ClientRepositoryImpl ....");
	}

	@Override
	public Client save(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return null;
	}

	@Override
	public Client findById() {
		em.getTransaction().begin();
		Client c = em.find(Client.class, 1L);
		System.out.println("client Id : " + c.getId() + " Nom : " + c.getName());
		em.getTransaction().commit();
		return c;
	}
	@Override
	public void update() {
		
		Client c =findById();
		System.out.println("client Id : " + c.getId() + " Nom : " + c.getName());
		em.getTransaction().begin();
		c.setName("imane");
		em.getTransaction().commit();
	}

	@Override
	public void remove() {
		Client c =findById();
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}


}