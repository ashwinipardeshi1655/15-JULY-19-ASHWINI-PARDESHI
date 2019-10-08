package com.ust.jsppractice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jsppractice.dto.UserInfoBean;

public class UserDAOImpl implements UserDAO {

	@Override
	public UserInfoBean login(int id, String password) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		
		UserInfoBean userInfoBean = null;
		String jpql = "from user_info where id = :id and password = :password";
		Query query = em.createQuery(jpql);
		query.setParameter("id" , id);
		query.setParameter("password", password);
		
		try {
			userInfoBean = (UserInfoBean) query.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfoBean;
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

}
