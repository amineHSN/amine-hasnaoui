package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Long>{

}
