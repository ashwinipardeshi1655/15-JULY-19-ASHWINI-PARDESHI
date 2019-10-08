package com.ust.usttyspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.usttyspringmvc.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory emf;

	@Override
	public Employee auth(String email, String password) {
		// emf = Persistence.createEntityManagerFactory("employee_unit"); //instead of
		// this we make ORMConfig class
		EntityManager em = emf.createEntityManager();
		String jpql = "from Employee where email =:email and password =:pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
			return (Employee) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (checkEmail(employee.getEmail())) {
			return false;
		}
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(employee);
		trans.commit();
		return true;
	}

	private boolean checkEmail(String email) {
		String jpql = "from Employee where email = :email";
		EntityManager em = emf.createEntityManager();
		Query query = (Query) em.createQuery(jpql);
		query.setParameter("email", email);
		try {
			query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Employee employee = em.find(Employee.class, id);
		if (employee == null) {
			return false;
		}
		em.remove(employee);
		trans.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		employee = em.find(Employee.class, employee.getId());
		if (employee == null) {
			return false;
		}
		employee.setName(employee.getName());
		employee.setPassword(employee.getPassword());
		employee.setDob(employee.getDob());
		trans.commit();
		return true;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String jpql = "From Employee";
		EntityManager em = emf.createEntityManager();
		Query query = (Query) em.createQuery(jpql);
		List<Employee> employeelist = query.getResultList();
		return employeelist;
	}

}
