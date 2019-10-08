package com.ust.jpql;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpatestapp.dto.Movies;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();

			String jpql = "from Movies";

			Query query = em.createQuery(jpql);
			List<Movies> resultList = query.getResultList();

			for (Movies m : resultList) {
				System.out.println(m.getId());
				System.out.println(m.getName());
				System.out.println(m.getRating());
			}

			String name = "select name from Movies";

			Query query1 = em.createQuery(name);
			List<String> resultList1 = query1.getResultList();

			for (String s : resultList1) {
				System.out.println(s);

			}

			String id = "Select id from Movies";

			Query query2 = em.createQuery(id);
			List<Integer> resultList2 = query2.getResultList();

			for (Integer integer : resultList2) {
				System.out.println(integer);

			}

			String update = "update Movies set name = 'shoo' where id = 1";

			Query query3 = em.createQuery(update);
			int count = query3.executeUpdate();
			System.out.println("status = " + count);
			trans.commit();

		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}

	}

}
