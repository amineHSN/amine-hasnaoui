package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IClientDao;
import com.example.demo.models.Client;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientDao dao;
	
	@Override
	public void save(Client c) {
		dao.save(c);
	}

	@Override
	public List<Client> getall() {
		return dao.findAll();
	}

	@Override
	public void update(Client c) {
		dao.save(c);
		
	}

	@Override
	public void delete(long id) {
		dao.deleteById(id);
		
	}

	@Override
	public Optional<Client> getone(long id) {
		return dao.findById(id);
	}

}
