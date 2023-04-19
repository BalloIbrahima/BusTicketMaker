package com.ballo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="billet")
public class Billet {

	@Id @GeneratedValue
	private Long id;
	
	private String nomClient;
	private String prenomClient;
	
	private String depart;
	private String arrivee;
	private Long prix;
	
}
