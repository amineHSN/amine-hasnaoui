package ma.cigma.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import ma.cigma.model.Client;

@Controller
public class ClientController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping(value = {"/all","/"})
	public String getall(Model model) {
		
		model.addAttribute("client",new Client());
		List<Client> clients = restTemplate.getForObject("http://localhost:8080/api/Clients/all",List.class);
		model.addAttribute("clients",clients);
		
		return "index-client";
	}
	
	
	@PostMapping("/add")
	public String addClient(Model model,@ModelAttribute("client") Client client) {
		
		restTemplate.postForObject("http://localhost:8080/api/Clients/add", client, Client.class);
		
		return "redirect:/all";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteC(Model model,@PathVariable long id)  {
		
		restTemplate.delete("http://localhost:8080/api/Clients/"+id);
		
		return "redirect:/all";
	}
	
	
	@GetMapping("/update/{id}/{nom}")
	public String updateC(Model model,@PathVariable long id,@PathVariable String nom,@ModelAttribute("client") Client client)
	{
		client.setId(id);
		client.setNom(nom);
		List<Client> clients = restTemplate.getForObject("http://localhost:8080/api/Clients/all",List.class);
		model.addAttribute("clients",clients);
		
		return "index-client";
	}
	
	
}
