package com.ust.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;
		Scanner sc = new Scanner(System.in);

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();

			String jpql = "update Movies set name = :name1 where id = :id1";
			Query query = em.createQuery(jpql);
			query.setParameter("name1", "sthilonjdffg");
			query.setParameter("id1", 3);
			int count = query.executeUpdate();
			System.out.println("status = " + count);

			// Delete Operation

			String jpql1 = "Delete from Movies where id = :id2";
			Query query1 = em.createQuery(jpql1);
			System.out.println("Enter id");
			int i = sc.nextInt();
			query1.setParameter("id2", i);
			int count1 = query1.executeUpdate();
			System.out.println("status = " + count1);
			trans.commit();

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
