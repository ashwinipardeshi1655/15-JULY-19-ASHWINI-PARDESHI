package com.ust.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.jpatestapp.dto.Movies;

public class RetrieveData {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;

		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		Movies m = em.find(Movies.class, 4);
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getRating());

	}

}
