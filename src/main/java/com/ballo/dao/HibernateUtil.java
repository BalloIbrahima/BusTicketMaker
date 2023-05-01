package com.ballo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	    

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
        	//Configuration cfg=new Configuration().configure( "hibernate.cfg.xml" );
        	//StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
        	            //cfg.getProperties());
        	//sessionFactory= cfg.buildSessionFactory(builder.build());     
        	
        	
        	///
        	StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
        	        .configure( "hibernate.cfg.xml" )
        	        .build();
        	
        	Metadata metadata = new MetadataSources( standardRegistry )
        	        .getMetadataBuilder()
        	        .build();
        	
        	return metadata.getSessionFactoryBuilder().build();

        }

        return sessionFactory;
    }
}
