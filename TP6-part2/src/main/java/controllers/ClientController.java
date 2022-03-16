package controllers;

import models.Client;
import services.ClientService;
import services.ClientServiceImpl;

public class ClientController {

ClientService clientService;
public ClientController(ClientService clientService) {
System.out.println("Call ClientController with clientServiceparam....");
this.clientService = clientService;
}

	public Client save(Client c ){
		System.out.println("ClientController level...");
		return clientService.save(c);
		}
	
	public ClientController() {
		System.out.println("CallClientController ....");
		}


}
