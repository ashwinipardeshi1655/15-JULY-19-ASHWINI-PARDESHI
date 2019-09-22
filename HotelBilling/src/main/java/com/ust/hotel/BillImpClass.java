package com.ust.hotel;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dto.beans.HotelEntity;



public class BillImpClass implements BillInterface {
	

	
	static HotelEntity hotel = new HotelEntity();
	Scanner sc = new Scanner(System.in);

	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction trans = null;

	public void insertfood() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		trans = em.getTransaction();
		trans.begin();
		
		System.out.println("Enter a itemcode");
		hotel.setItemcode(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter food name");
		hotel.setFoodname(sc.nextLine());
		System.out.println("Enter price");
		hotel.setPrice(Integer.parseInt(sc.nextLine()));
		em.persist(hotel);
		System.out.println("Data inserted");
		trans.commit();
	}


	public void updatefood() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		trans = em.getTransaction();
		try {
			trans.begin();
			
			System.out.println("Enter food name");
			String foodname = sc.nextLine(); 
			System.out.println("Enter food id");
			int itemcode = Integer.parseInt(sc.nextLine());
			String jpql2 = "update HotelEntity set foodname = :foodname1 where itemcode = :itemcode1";
			Query query = em.createQuery(jpql2);
			query.setParameter("foodname1", foodname);
			query.setParameter("itemcode1", itemcode);
			query.executeUpdate();
			System.out.println("data updated");
			trans.commit();
		} catch (NumberFormatException e) {
			trans.rollback();
			e.printStackTrace();
		}

	}



	public void totalbill() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		trans = em.getTransaction();
		
		System.out.println("Enter item code");
		int a= sc.nextInt();
		System.out.println("Enter item code");
		int b = sc.nextInt();

		String query3 = "select sum(price) from HotelEntity where itemcode in (:a,:b)";
		Query query = em.createQuery(query3);
		query.setParameter("a", a);
		query.setParameter("b", b);
		
		List c1 = query.getResultList();
		
		
		System.out.println("Total bill is = "+c1);
		
		
	}

	public void showfood() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		trans = em.getTransaction();

		String jpql = "from HotelEntity";

		Query query = em.createQuery(jpql);
		List<HotelEntity> resultList = query.getResultList();

		for (HotelEntity hotel : resultList) {
			System.out.println(hotel.getItemcode());
			System.out.println(hotel.getFoodname());
			System.out.println(hotel.getPrice());
			System.out.println("***************");
		}

	}


	public boolean deletefood() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		trans = em.getTransaction();
		
		trans.begin();
		System.out.println("Enter foodcode");
		int itemcode = Integer.parseInt(sc.nextLine()); 

		HotelEntity hm = em.find(HotelEntity.class, itemcode);
		em.remove(hm);
		System.out.println("Data REmoved");
		trans.commit();
		
		return true;
	}


	public HotelEntity addfood() {
		emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		
		int itemcode;
		System.out.println("Enter the itemcode");
		itemcode = Integer.parseInt(sc.nextLine());
		while(itemcode!=0) {
		HotelEntity hotel = em.find(HotelEntity.class, itemcode);
		
		System.out.println(hotel.getItemcode());
		System.out.println(hotel.getFoodname());
		System.out.println(hotel.getPrice());
		
		
		System.out.println("Enter the itemcode");
		itemcode = Integer.parseInt(sc.nextLine());
		
		}
		System.out.println("Make a bill");
		System.out.println("********");
	return hotel;

	}

}
