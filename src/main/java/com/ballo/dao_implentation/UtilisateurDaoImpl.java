package com.ballo.dao_implentation;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ballo.dao.Dao;
import com.ballo.dao.HibernateUtil;
import com.ballo.dao.UtilisateurDao;
import com.ballo.entity.Utilisateur;

public class UtilisateurDaoImpl implements Dao<Utilisateur> , UtilisateurDao{
	
	
	@Autowired 
	PasswordEncoder encoder;

	@Override
	public Utilisateur recherche(Long id) {
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
         //obj.setMotDePasse(encoder.encode(obj.getMotDePasse()));
         session.save(obj);
         transaction.commit();
         session.close();
		
	}

	@Override
	public void modifier(Utilisateur obj, Long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Utilisateur user = (Utilisateur) session.load(Utilisateur.class, id);
        user.setNom(obj.getNom());
        user.setPrenom(obj.getPrenom());
        user.setPseudo(obj.getPseudo());
        user.setMotDePasse(obj.getMotDePasse());
       
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
		Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Utilisateur where pseudo =:pseudo and motDePasse=:motDePasse ");
        query.setParameter("pseudo", pseudo);
        query.setParameter("motDePasse", motDePasse);
       //recuperation de l'utilisateur
        Utilisateur user = (Utilisateur) query.uniqueResult();
        
        session.close();
//        if(user !=null) {
//        	//compponraison du mot de passe
//        	
//        	if(encoder.matches(motDePasse, user.getMotDePasse()));{
//        		return user;
//        	}
//        	
//        }else {
//        	return null;
//        }
//        
        
        return user;
        
        
	}

	@Override
	public Utilisateur parPseudo(String pseudo) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
       //recuperation de l'utilisateur
        Query query = session.createQuery("from Utilisateur where pseudo =:pseudo ");
        query.setParameter("pseudo", pseudo);
        Utilisateur user = (Utilisateur) query.uniqueResult();
        transaction.commit();
        session.close();
        return user;
	}

}
