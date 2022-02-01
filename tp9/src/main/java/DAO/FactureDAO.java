package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.Client;
import models.Facture;

public class FactureDAO implements DAO<Facture> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");
	EntityManager em = emf.createEntityManager();

	public FactureDAO() {

	}

	@Override
	public Facture save(Facture t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		return null;
	}

	@Override
	public List<Facture> findAll() {
		em.getTransaction().begin();
		Query query = em.createQuery("select f.id from facture f");
		ArrayList<Facture> factures = (ArrayList<Facture>) query.getResultList();
		return factures;
	}

	@Override
	public Facture findById(Long id) {
		em.getTransaction().begin();
		Facture fac = em.find(Facture.class, id);
		em.getTransaction().commit();
		return fac;
	}

	@Override
	public void update(Facture t) {
//		Facture f = findById(t.getId());
//		em.getTransaction().begin();
//		f.setDate(t.getDate());
//		em.getTransaction().commit();
	}

	@Override
	public void remove(Long id) {
		Facture f = findById(id);
		em.getTransaction().begin();
		em.remove(f);
		em.getTransaction().commit();
	}

}