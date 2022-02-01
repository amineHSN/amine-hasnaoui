package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import DAO.DAO;
import models.Facture;

public class FactureService implements IService<Facture> {
	
	@Autowired
	DAO<Facture> dao;
	
	
	public FactureService() {
		
	}

	public FactureService(DAO<Facture> dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Facture save(Facture t) {
		return dao.save(t);
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void update(Facture t) {
		dao.update(t);
	}

	@Override
	public Facture findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

}