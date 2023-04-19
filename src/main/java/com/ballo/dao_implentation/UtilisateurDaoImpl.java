package com.ballo.dao_implentation;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ballo.dao.Dao;
import com.ballo.dao.HibernateUtil;
import com.ballo.dao.UtilisateurDao;
import com.ballo.entity.Utilisateur;

public class UtilisateurDaoImpl implements Dao<Utilisateur> , UtilisateurDao{

	@Override
	public Utilisateur recherche(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Utilisateur user = (Utilisateur) session.get(Utilisateur.class, id);
        transaction.commit();
        session.close();
        return user;
	}

	@Override
	public void enregistrer(Utilisateur obj) {
		// TODO Auto-generated method stub
		 Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction transaction = session.beginTransaction();
         session.save(obj);
         transaction.commit();
         session.close();
		
	}

	@Override
	public void modifier(Utilisateur obj, int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Utilisateur user = (Utilisateur) session.load(Utilisateur.class, id);
        user.setNom(obj.getNom());
        user.setPrenom(obj.getPrenom());
        user.setPseudo(obj.getPseudo());
        
        session.update(user);
        transaction.commit();
        session.close();
		
	}

	@Override
	public void supprimner(Utilisateur obj) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
		
	}

	@Override
	public List<Utilisateur> liste() {
		// TODO Auto-generated method stub
		List<Utilisateur> liste = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Utilisateur");
        liste = query.list();
        return liste;
	}

	@Override
	public Utilisateur login(String pseudo, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}

}
