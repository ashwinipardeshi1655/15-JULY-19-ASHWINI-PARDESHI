package com.ust.practice.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ust.dto.Video_Games;

public class UpdateGames {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();
			Video_Games v = em.find(Video_Games.class, 2);
			v.setName("Mini Minitia");
			System.out.println("Data Entry Updated");
			trans.commit();
			
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
			
		}finally {
			em.close();
		}
	}

}
