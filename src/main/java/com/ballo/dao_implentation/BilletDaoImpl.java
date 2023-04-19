package com.ballo.dao_implentation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ballo.dao.Dao;
import com.ballo.dao.HibernateUtil;
import com.ballo.entity.Billet;
import com.ballo.entity.Billet;
import com.ballo.entity.Billet;

public class BilletDaoImpl implements Dao<Billet> {

	@Override
	public Billet recherche(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Billet billet = (Billet) session.get(Billet.class, id);
        transaction.commit();
        session.close();
        return billet;
	}

	@Override
	public void enregistrer(Billet obj) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
		
	}

	@Override
	public void modifier(Billet obj, int id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Billet billet = (Billet) session.load(Billet.class, id);
        billet.setNomClient(obj.getNomClient());
        billet.setPrenomClient(obj.getPrenomClient());
        billet.setHeureDepart(obj.getHeureDepart());
        billet.setDestination(obj.getDestination());
        billet.setPrix(obj.getPrix());
        
        session.update(billet);
        transaction.commit();
        session.close();
		
	}

	@Override
	public void supprimner(Billet obj) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
		
	}

	@Override
	public List<Billet> liste() {
		// TODO Auto-generated method stub
		List<Billet> liste = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Billet");
        liste = query.list();
        return liste;
	}

}
