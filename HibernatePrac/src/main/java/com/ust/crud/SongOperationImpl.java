package com.ust.crud;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ust.beans.MusicEntity;

public class SongOperationImpl implements SongOperation{
	
	Scanner sc = new Scanner(System.in);
	static MusicEntity music = new MusicEntity();
	
	public static void main(String[] args) {
		SongOperationImpl sio = new SongOperationImpl();
		//sio.storeSong();
		//sio.searchSong(1);
		//sio.getAllSongs();
		//sio.getSongs(1);
		//sio.deleteSong(1);
		//sio.updateSongs();
		sio.randomSongs();
	}

	public boolean storeSong() {
		
		try {
			EntityManager em = ConnEstablish.getConnection();
			ConnEstablish.trans = em.getTransaction();
			ConnEstablish.trans.begin();
			
			music.setId(3);
			music.setName("josh");
			music.setRatings("*****");
			ConnEstablish.em.persist(music);
			System.out.println("Data Inserted");
			ConnEstablish.trans.commit();
			
		} catch (Exception e) {
		
			ConnEstablish.trans.rollback();
			e.printStackTrace();
		}
		return true;
	}

	public MusicEntity searchSong(int id) {
			EntityManager em = ConnEstablish.getConnection();
			MusicEntity music= em.find(MusicEntity.class, id);
			System.out.println(music.getId());
			System.out.println(music.getName());
			System.out.println(music.getRatings());
			System.out.println("Song found");
				
		return music;
	}

	public MusicEntity getSongs(int id) {
		EntityManager em = ConnEstablish.getConnection();
		MusicEntity music = em.find(MusicEntity.class, id);
		
			System.out.println(music.getId());
			System.out.println(music.getName());
			System.out.println(music.getRatings());
			
		return music;
	}

	public List<MusicEntity> getAllSongs() {
		EntityManager em = ConnEstablish.getConnection();
		String jpql = "from MusicEntity";
		Query query = em.createQuery(jpql);
		List<MusicEntity> resultList = query.getResultList();
		for (MusicEntity music : resultList) {
			System.out.println(music.getId());
			System.out.println(music.getName());
			System.out.println(music.getRatings());
		}
		return resultList;
	}

	public boolean updateSongs() {
		EntityManager em = ConnEstablish.getConnection();
		
			ConnEstablish.trans = em.getTransaction();
			try {
			ConnEstablish.trans.begin();
			
			System.out.println("Enter a name");
			String name = sc.nextLine(); 
			System.out.println("Enter a id");
			int id1 = Integer.parseInt(sc.nextLine());
			String jpql2 = "update MusicEntity set name = :name where id = :id1";
			Query query = em.createQuery(jpql2);
			query.setParameter("name", name);
			query.setParameter("id1", id1);
			query.executeUpdate();
			ConnEstablish.trans.commit();
		} catch (NumberFormatException e) {
			ConnEstablish.trans.rollback();
			e.printStackTrace();
		}
				
		
		return true;
	}

	public List<MusicEntity> randomSongs() {
		EntityManager em = ConnEstablish.getConnection();
		ConnEstablish.trans = em.getTransaction();
		ConnEstablish.trans.begin();
		
		String hhs = "from MusicEntity order by rand()";
		Query query = em.createQuery(hhs);
		List<MusicEntity> resultList = query.getResultList();
		for (MusicEntity music : resultList) {
			System.out.println(music.getId());
			System.out.println(music.getName());
			System.out.println(music.getRatings());
		}
		return resultList;

	}

	public boolean deleteSong(int id) {
		EntityManager em = ConnEstablish.getConnection();
		ConnEstablish.trans = em.getTransaction();
		ConnEstablish.trans.begin();
		MusicEntity mu = em.find(MusicEntity.class, id);
		em.remove(mu);
		System.out.println("Data REmoved");
		ConnEstablish.trans.commit();
		
		return true;
	}

}
