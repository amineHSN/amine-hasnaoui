package controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Services.IService;
import models.Facture;

public class FactureController {
	@Autowired
	IService<Facture> service;

	public FactureController() {
		
	}

	public FactureController(IService<Facture> service) {
		super();
		this.service = service;
	}
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}
	public Facture save(Facture f) {
		return service.save(f);
	}
	
	public void update(Facture t) {
		service.update(t);
	}

	public Facture findById(Long id) {
		return service.findById(id);
	}

	public void remove(Long id) {
		service.remove(id);
	}
}