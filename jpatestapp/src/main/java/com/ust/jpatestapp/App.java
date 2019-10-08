package com.ust.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpatestapp.dto.Movies;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction transaction = null;

		Movies movie = new Movies();
		movie.setId(3);
		movie.setName("Conjuring");
		movie.setRating("****");
		try {
			entitymanagerfactory = Persistence.createEntityManagerFactory("TestPersistence"); // Load the Driver
			//It will load all the necessary information...EntityManagerFactory is an interface.It is created only once...EntityManagerFactory is also used to create objectof entity manager
			//It is create to object of persistence
			entitymanager = entitymanagerfactory.createEntityManager(); // establish the connection
			//It is used to connect with database
			transaction = entitymanager.getTransaction();
			//to make it permanently store we use transaction

			transaction.begin();
			//It starts the transaction
			entitymanager.persist(movie);
			//persist method is used to insert the data....but it save within the session.
			System.out.println("Entry Saved");
			transaction.commit();
			//it stores the value in database permanently...If we didn't use this then data will rotate in above. And it will store it in temporary
			

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entitymanager.close();
		}

	}
}
//EntityManager = interact with database.connect with database.perform crud operations.
