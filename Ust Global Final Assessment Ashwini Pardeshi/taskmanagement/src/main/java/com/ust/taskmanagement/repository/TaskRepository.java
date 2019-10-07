package com.ust.taskmanagement.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.taskmanagement.dto.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	@Transactional
	@Modifying
	@Query("update Task set endDate=:endDate where taskId=:taskId")
	public void update(@Param("endDate") Date endDate, @Param("taskId") int taskId);

}
