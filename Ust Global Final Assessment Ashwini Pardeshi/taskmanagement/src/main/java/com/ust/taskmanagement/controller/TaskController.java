package com.ust.taskmanagement.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.taskmanagement.dto.Task;
import com.ust.taskmanagement.dto.TaskResponse;
import com.ust.taskmanagement.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")

public class TaskController {

	@Autowired
	private TaskService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addTask(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.addTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task added Found");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task failed to add");
		}
		return response;
	}

	@DeleteMapping(path = "remove/{taskId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse removeTask(@PathVariable("taskId") int taskId) {
		TaskResponse response = new TaskResponse();
		if (service.removeTask(taskId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task Deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task Failed to delete");
		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse modifyTask(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if (service.modifyTask(task)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Task updated successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Task failed to update");
		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllTasks() {
		List<Task> taskList = service.getAllTasks();
		TaskResponse response = new TaskResponse();
		if (taskList.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No task Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All data Found");
			response.setTasks(taskList);
		}
		return response;
	}
}
