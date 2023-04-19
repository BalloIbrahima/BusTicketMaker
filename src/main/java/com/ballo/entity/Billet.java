package com.ballo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="billet")
public class Billet {

	@Id @GeneratedValue
	private Long id;
	
	private String nomClient;
	private String prenomClient;
	
	private Date heureDepart;
	private String destination;
	private Long prix;
	
	
	public Billet(String nomClient, String prenomClient, Date heureDepart, String destination, Long prix) {
		
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.heureDepart = heureDepart;
		this.destination = destination;
		this.prix = prix;
	}


	public Billet() {
	
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public Date getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public Long getPrix() {
		return prix;
	}


	public void setPrix(Long prix) {
		this.prix = prix;
	}
	
	
	
	
	
	
	
}
