package com.ballo.dao;

import com.ballo.entity.Utilisateur;

public interface UtilisateurDao {
	//Login
    public  Utilisateur login(String pseudo,String motDePasse);
}
