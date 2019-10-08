package com.ust.usttyspringrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ust.usttyspringrest.dto.Employee;
import com.ust.usttyspringrest.dto.EmployeeResponse;
import com.ust.usttyspringrest.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Found");
			response.setEmployees(Arrays.asList(employee));
		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		List<Employee> employeeList = service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if (employeeList.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription(" data Found");
			response.setEmployees(employeeList);
		}
		return response;
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription(" data Found");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");

		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription(" data Found");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data Deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		}
		return response;
	}

}
