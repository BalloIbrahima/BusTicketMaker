package com.ballo.dao;

import java.util.List;

public abstract class Dao<T> {
	//Rechercher
    public abstract T recherche(int id);
    //inserer
    public abstract void enregistrer(T obj);
    //modifier
    public abstract void modifier(T obj, int id);
    //supprimer
    public abstract void supprimner(T obj);
    //liste
    public abstract List<T>liste();
}
