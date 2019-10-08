package com.ust.usttyspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.usttyspringboot.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Transactional
	@Modifying
	@Query("update Employee set name=:name, password=:password where id=:id")
	public void update(@Param("name") String name, @Param("password") String password, @Param("id") int id);
		
	public List<Employee> findByName(String name);
	public Employee findByEmail(String Email);

}
