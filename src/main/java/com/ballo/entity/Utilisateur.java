package com.ballo.entity;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="utilisateur")
public class Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String pseudo;
	private String motDePasse;
	
	
	public Utilisateur(String nom, String prenom, String pseudo, String motDePasse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
	}
	
	
	
	
	public Utilisateur() {}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
