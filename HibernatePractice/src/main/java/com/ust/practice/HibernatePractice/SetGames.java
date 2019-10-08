package com.ust.practice.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Video_Games;

public class SetGames {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;
		
		try {
			Video_Games v = new Video_Games();
			v.setId(5);
			v.setName("Counter Strike");
			v.setNo_of_players(4);
			v.setRatings("****");
			
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();
			em.persist(v);
			System.out.println("Data Entry Saved");
			trans.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
