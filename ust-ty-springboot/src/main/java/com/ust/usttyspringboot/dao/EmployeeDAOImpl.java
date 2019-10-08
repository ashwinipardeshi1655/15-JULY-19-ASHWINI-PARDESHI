package com.ust.usttyspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.usttyspringboot.dto.Employee;

//@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	//@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(employee);
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Employee employee = em.find(Employee.class, id);
			try {
				em.remove(employee);
				trans.commit();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Employee emp = em.find(Employee.class, employee.getId());
		if (emp != null) {
			emp.setName(employee.getName());
			emp.setDob(employee.getDob());
			emp.setPassword(employee.getPassword());
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, id);
		if (employee != null) {
			return employee;
		} else
			return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		String jpql = "from Employee";
		Query query = em.createQuery(jpql);
		List<Employee> empList = query.getResultList();
		return empList;
	}

}
