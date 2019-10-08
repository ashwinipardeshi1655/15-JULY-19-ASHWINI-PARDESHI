package com.ust.practice.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.dto.Video_Games;

public class DeleteGames {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();
			
			Video_Games v = em.find(Video_Games.class, 1);
			em.remove(v);
			System.out.println("Data Entry Deleted");
			trans.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
	}
}
