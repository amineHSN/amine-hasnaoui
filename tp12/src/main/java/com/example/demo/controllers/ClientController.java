package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.models.Client;
import com.example.demo.service.IClientService;

@Controller
public class ClientController {
	@Autowired
	IClientService service;
	
	public void save(Client c) {
		service.save(c);
	}

	public List<Client> getall() {
		return service.getall();
	}
	
	public void update(Client c) {
		service.update(c);
		
	}
	
	public void delete(long id) {
	service.delete(id);
		
	}
	
	public Optional<Client> getone(long id) {
		return service.getone(id);
	}


}
