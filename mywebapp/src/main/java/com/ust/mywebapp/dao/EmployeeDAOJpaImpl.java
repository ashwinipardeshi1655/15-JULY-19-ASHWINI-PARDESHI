package com.ust.mywebapp.dao;

import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.mywebapp.dto.EmployeeInfoBean;

public class EmployeeDAOJpaImpl implements EmployeeDAO {

	Scanner sc = new Scanner(System.in);

	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();

		EmployeeInfoBean emp = null;
		try {
			emp = em.find(EmployeeInfoBean.class, id);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();

		try {
			trans.begin();

			em.persist(employeeInfoBean);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();

		EmployeeInfoBean employeeInfoBean = null;
		try {
			trans.begin();
			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
			em.remove(employeeInfoBean);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public EmployeeInfoBean login(int empId, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();

		EmployeeInfoBean employeeInfoBean = null;

		String jpql = "from EmployeeInfoBean where empId = :id and password = :pass";
		Query query = em.createQuery(jpql);
		query.setParameter("id", empId);
		query.setParameter("pass", password);

		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;

	}

	@Override
	public boolean updateEmployee(int id) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction trans = em.getTransaction();
//
//		EmployeeInfoBean employeeInfoBean = null;
//		try {
//			trans.begin();
//			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
//			em.persist(employeeInfoBean);
//			trans.commit();
//		} catch (Exception e) {
//			trans.rollback();
//			e.printStackTrace();
//		}		
		return true;
	}

	@Override
	public void addEmpJSP(EmployeeInfoBean employeeInfoBean) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			em.persist(employeeInfoBean);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		
	}

	@Override
	public void deleteEmpJSP(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();

		EmployeeInfoBean employeeInfoBean = null;
		try {
			trans.begin();
			employeeInfoBean = em.find(EmployeeInfoBean.class, id);
			em.remove(employeeInfoBean);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
			e.printStackTrace();
		}

		
	}

}
