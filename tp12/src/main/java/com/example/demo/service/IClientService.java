package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Client;

public interface IClientService {
public void save(Client c);
public List<Client> getall();
public void update(Client c);
public void delete(long id);
public Optional<Client> getone(long id);
}
