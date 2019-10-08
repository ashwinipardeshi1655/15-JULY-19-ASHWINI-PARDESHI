package com.ust.practice.HibernatePractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.dto.Video_Games;

public class GetGames {
	
	public static void main(String[] args) {
	
	EntityManagerFactory emf = null;
	EntityManager em = null;

	
	try {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		
		Video_Games v = em.find(Video_Games.class, 1);
		
		System.out.println(v.getId());
		System.out.println(v.getName());
		System.out.println(v.getNo_of_players());
		System.out.println(v.getRatings());
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		em.close();
	}
	}

}
