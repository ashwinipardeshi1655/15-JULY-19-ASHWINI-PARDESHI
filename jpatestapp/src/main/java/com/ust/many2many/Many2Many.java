package com.ust.many2many;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Many2Many {

	public static void main(String[] args) {

		Courses course = new Courses();
		course.setCid(1);
		course.setCname("Core Java");

		Courses course1 = new Courses();
		course1.setCid(2);
		course1.setCname("SQL");

		ArrayList<Courses> clist = new ArrayList<Courses>();
		clist.add(course);
		clist.add(course1);

		Student student = new Student();
		student.setSid(101);
		student.setSname("Ashwini");
		student.setCourse(clist);

		Student student1 = new Student();
		student1.setSid(102);
		student1.setSname("Asmita");
		student1.setCourse(clist);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();

			trans.begin();
			em.persist(student);
			em.persist(student1);
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
