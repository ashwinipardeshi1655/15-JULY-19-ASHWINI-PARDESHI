package com.ust.one2many;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2Many {
	
	public static void main(String[] args) {
		
		Pencils pencil = new Pencils();
		pencil.setPid(1);
		pencil.setPname("P11");
		pencil.setPbrand("DOMS");
		
		Pencils pencil1 = new Pencils();
		pencil1.setPid(2);
		pencil1.setPname("P12");
		pencil1.setPbrand("DOMS");
		ArrayList<Pencils> list = new ArrayList<Pencils>();
		list.add(pencil);
		list.add(pencil1);
		
		
		PencilBox pb = new PencilBox();
		pb.setBoxid(1);
		pb.setBname("Extramark");
		pb.setPencil(list);
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction trans = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			trans = em.getTransaction();
			trans.begin();
			System.out.println("Unidirectional");
			em.persist(pb);
			System.out.println("saved");
			trans.commit();
			
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		

}
}