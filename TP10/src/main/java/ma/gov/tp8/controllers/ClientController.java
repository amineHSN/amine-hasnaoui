package ma.gov.tp8.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.gov.tp8.Services.IClientService;
import ma.gov.tp8.modelsTC.Client;



@Controller("ctrl")
public class ClientController {
	

	@Autowired
	IClientService clientService;
	
	public ClientController() {
		System.out.println("Call ClientControllerImpl ....");
	}

	public Client save(Client c) {
		return clientService.save(c);
	}
	
	public void update() {
		clientService.update();
	}
	
	public Client findById() {
		return clientService.findById();
	}
	public void remove() {
		clientService.remove();
	}
}
