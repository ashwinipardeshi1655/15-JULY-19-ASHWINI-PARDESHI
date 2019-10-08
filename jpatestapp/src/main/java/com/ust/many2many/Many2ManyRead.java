package com.ust.many2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2ManyRead {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;

			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();

			Courses course = em.find(Courses.class, 1);
			List<Student> student = course.getStudent();
			for (Student student2 : student) {
				System.out.println(student2.getSid());
				System.out.println(student2.getSname());
			}
			System.out.println("Saved");
			
	}

}
