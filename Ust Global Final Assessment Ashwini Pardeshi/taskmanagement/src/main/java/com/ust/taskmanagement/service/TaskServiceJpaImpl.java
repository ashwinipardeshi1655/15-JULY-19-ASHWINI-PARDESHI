package com.ust.taskmanagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.taskmanagement.dto.Task;
import com.ust.taskmanagement.repository.TaskRepository;

@Service
public class TaskServiceJpaImpl implements TaskService {

	@Autowired
	TaskRepository repository;

	@Override
	public boolean addTask(Task task) {
		Date date = new Date();
		task.setStartDate(date);
		repository.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int taskId) {
		repository.deleteById(taskId);
		return true;
	}

	@Override
	public boolean modifyTask(Task task) {
		Date date = new Date();
		repository.update(date, task.getTaskId());
		return true;
	}

	@Override
	public List<Task> getAllTasks() {
		return repository.findAll();
	}

}
