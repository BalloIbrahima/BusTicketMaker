package com.ballo.dao;

import java.util.List;

public  interface Dao<T> {
	//Rechercher
    public  T recherche(Long id);
    //inserer
    public  void enregistrer(T obj);
    //modifier
    public  void modifier(T obj, Long id);
    //supprimer
    public  void supprimner(T obj);
    //liste
    public  List<T>liste();
}
