package com.ust.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpatestapp.dto.Movies;

public class DeleteData {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();
			Movies m = em.find(Movies.class, 5);
			em.remove(m);
			System.out.println("record deleted");
			trans.commit();

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}// end of main method

}// end of main class
