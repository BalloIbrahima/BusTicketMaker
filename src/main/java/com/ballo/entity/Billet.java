package com.ballo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billet")
public class Billet implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nomClient;
	private String prenomClient;
	
	private Date heureDepart;
	private String depart;
	private String destination;
	private Long prix;
	
	
	public Billet(String nomClient, String prenomClient, Date heureDepart, String depart, String destination, Long prix) {
		
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.heureDepart = heureDepart;
		this.destination = destination;
		this.prix = prix;
		this.depart = depart;
	}


	public Billet() {
	
	}


	public Long getId() {
		return id;
	}


	
	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
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
