package com.ust.one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Many2One {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			
			PencilBox box = em.find(PencilBox.class, 1);
			List<Pencils> pencil = box.getPencil();
			
			for (Pencils pencils : pencil) {
				System.out.println(pencils.getPid());
				System.out.println(pencils.getPname());
			}
	}	

}
