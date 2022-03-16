package com.example.demo.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Client {
	
	@Id
	@GeneratedValue
private long id;
private String nom;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
@Override
public String toString() {
	return "Client [id=" + id + ", nom=" + nom + "]";
}
public Client() {
	super();
}
public Client(String nom) {
	super();
	this.nom = nom;
}


}
