package com.ust.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.one2one.Person;
import com.ust.one2one.VoterCard;

public class One2OneTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.setId(3);
		person.setAge(24);
		person.setName("Pranali");

		VoterCard vc = new VoterCard();
		vc.setV_id(684455);
		vc.setName("Pranali");
		person.setVotercard(vc);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();

			trans.begin();
			// em.persist(person);
			VoterCard votercard = em.find(VoterCard.class, 684455);
			System.out.println(votercard.getPerson().getId());
			System.out.println(votercard.getPerson().getAge());
			System.out.println(votercard.getPerson().getName());
			System.out.println("Saved");
			trans.commit();

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
