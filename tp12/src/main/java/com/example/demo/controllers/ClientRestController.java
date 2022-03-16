package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Client;
import com.example.demo.service.IClientService;

@RestController
@RequestMapping("/Clients")
public class ClientRestController {
	@Autowired
	IClientService service;
	
	@PostMapping("/Add")
	public void save(@RequestBody Client c) {
		service.save(c);
	}

	@GetMapping("/all")
	public List<Client> getall() {
		return service.getall();
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Client c) {
		service.update(c);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
	service.delete(id);
		
	}
	
	@GetMapping("/{id}")
	public Optional<Client> getone(@PathVariable long id) {
		return service.getone(id);
	}

}
