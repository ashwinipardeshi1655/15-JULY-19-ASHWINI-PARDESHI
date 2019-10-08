package com.ust.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ConnEstablish {
	
	static EntityManagerFactory emf = null;
	static EntityManager em = null;
	static EntityTransaction trans = null;
	
	public static EntityManager getConnection() {
		
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		return em;
	}

	
}
