package com.ust.taskmanagement.service;

import java.util.List;

import com.ust.taskmanagement.dto.Task;

public interface TaskService {
	
	public boolean addTask(Task task);
	public boolean removeTask(int taskId);
	public boolean modifyTask(Task task);
	public List<Task> getAllTasks();

}
